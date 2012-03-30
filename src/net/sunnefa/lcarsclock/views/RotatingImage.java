/*
 * This is RotatingImage.java
 * Created on 30.3.2012
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
package net.sunnefa.lcarsclock.views;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.geom.AffineTransform;
import javax.swing.JPanel;

/**
 *
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
public class RotatingImage extends JPanel {
    
    private Image image;
    
    private double current_angle;
    
    public RotatingImage(Image image) {
        this.set_image(image);
    }
    
    public void set_image(Image image) {
        this.image = image;
        
        MediaTracker mt = new MediaTracker(this);
        
        mt.addImage(image, 0);
        
        try {
            mt.waitForID(0);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
    
    public void rotate() {
        this.current_angle -= 2.0;
        
        if(this.current_angle >= 360.0) {
            current_angle = 0;
        }
        repaint();
    }
    
    public void rotate(int degrees) {
        this.current_angle = degrees;
        
        if(this.current_angle >= 360.0) {
            current_angle = 0;
        }
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        AffineTransform origXform = g2d.getTransform();
        
        AffineTransform newXform = (AffineTransform)(origXform.clone());
        
        int xRot = this.getWidth() / 2;
        int yRot = this.getHeight() / 2;
        
        newXform.rotate(Math.toRadians(this.current_angle), xRot, yRot);
        
        g2d.setTransform(newXform);
        
        int x = (getWidth() - this.image.getWidth(this)) / 2;
        int y = (getHeight() - this.image.getHeight(this)) / 2;
        
        g2d.drawImage(this.image, x, y, this);
        
        g2d.setTransform(origXform);
    }
    
}
