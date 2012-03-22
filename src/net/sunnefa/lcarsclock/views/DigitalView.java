/*
 * This is DigitalView.java
 * Created on 22.3.2012
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
package net.sunnefa.lcarsclock.views;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.sunnefa.lcarsclock.models.ClockModel;

/**
 *
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
public class DigitalView extends JPanel {
    
    ClockModel clock_model;
    
    public DigitalView(ClockModel clock_model) {
        this.clock_model = clock_model;
        
        JLabel time_label = new JLabel();
        time_label.setText("15:47:10");
        time_label.setFont(new Font("/Users/shannensekaya/NetBeansProjects/LCARS Clock/assets/lcars.TTF", Font.BOLD, 48));
        time_label.setForeground(new Color(255, 0, 0));
        this.add(time_label);
        
    }
    
}
