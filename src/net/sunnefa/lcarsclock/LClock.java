/**
 * This is LClock.java
 * Created on 22.3.2012
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
package net.sunnefa.lcarsclock;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
class LClock {
    
    /**
     * The variable holding the main application window
     * @var app_window
     */
    JFrame app_window;
    
    /**
     * The variable holding the main app label which uses the label image as a background
     * @var app_label
     */
    JLabel app_label;
    
    /**
     * The variable holding the main background image
     * @var label_image
     */
    BufferedImage label_image;

    /**
     * Main constructor which created the frame, loads the background and adds it to the label.
     */
    public LClock() {
        try {
            this.label_image = ImageIO.read(new File("/Users/shannensekaya/NetBeansProjects/LCARS Clock/assets/lcars_background.png"));
        } catch(IOException ioe) {
            //do something
        }
        this.app_window = new JFrame("LCARS Clock");
        this.app_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.app_window.setLayout(new FlowLayout());
        this.app_window.setSize(820, 755);
        this.app_window.setBackground(Color.black);
        
        this.app_label = new JLabel(new ImageIcon(label_image));
        this.app_window.add(app_label);
        
        this.app_window.setVisible(true);
        
    }
    
}