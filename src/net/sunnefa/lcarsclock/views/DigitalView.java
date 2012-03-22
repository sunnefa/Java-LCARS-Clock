/*
 * This is DigitalView.java
 * Created on 22.3.2012
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
package net.sunnefa.lcarsclock.views;

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
        time_label.setText("I'm a time label");
        
        this.add(time_label);
        
    }
    
}
