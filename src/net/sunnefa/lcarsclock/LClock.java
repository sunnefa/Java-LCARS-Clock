/**
 * This is LClock.java
 * Created on 22.3.2012
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
package net.sunnefa.lcarsclock;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import net.sunnefa.lcarsclock.models.ClockModel;
import net.sunnefa.lcarsclock.views.DigitalView;

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
        this.app_window.setLayout(new BorderLayout());
        this.app_window.setSize(820, 755);
        this.app_window.setBackground(Color.black);
        this.app_window.setResizable(false);
        
        //JPanel new_panel = new JPanel();
        //new_panel.setBounds(70, 110, 680, 200);
        //new_panel.setBackground(Color.yellow);
        
        this.app_label = new JLabel(new ImageIcon(label_image));
        
        ClockModel clock_model = new ClockModel();
        DigitalView digital_view = new DigitalView(clock_model);
        
        float dg_x = app_label.getAlignmentX() + 70;
        console(app_label.getAlignmentX());
        
        digital_view.setBounds((int)dg_x, 110, 680, 200);
        
        this.app_window.add(digital_view);
        
        
        this.app_window.add(app_label);
        
        
        
        this.app_window.setVisible(true);
        
    }

    private void console(float msg) {
        System.out.println(msg);
    }
    
}