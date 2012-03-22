/*
 * This is DigitalView.java
 * Created on 22.3.2012
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
package net.sunnefa.lcarsclock.views;

import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import net.sunnefa.lcarsclock.models.ClockModel;

/**
 *
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
public class DigitalView extends JPanel {
    
    ClockModel clock_model;
    
    public DigitalView(ClockModel clock_model) {
        this.clock_model = clock_model;
        
        
        
        //GridLayout grid = new GridLayout(2,1);
        
        this.setLayout(new FlowLayout());
        
        JLabel time_label = new JLabel();
        time_label.setText("15:47:10");
        time_label.setFont(new Font("Swiss911 UCm BT", Font.TRUETYPE_FONT, 79));
        time_label.setForeground(new Color(255, 153, 0));
        time_label.setBounds(100, 100, 300, 300);
        
        JLabel date_label = new JLabel();
        date_label.setText("22.03.2012");
        date_label.setFont(new Font("Swiss911 UCm BT", Font.TRUETYPE_FONT, 79));
        date_label.setForeground(new Color(255, 153, 0));
        
        JLabel star_label = new JLabel();
        star_label.setText("65582.5");
        star_label.setFont(new Font("Swiss911 UCm BT", Font.TRUETYPE_FONT, 79));
        star_label.setForeground(new Color(255, 153, 0));
        
        
        this.add(time_label);
        this.add(date_label);
        this.add(star_label, JPanel.BOTTOM_ALIGNMENT);
        
    }
    
}
