/*
 * This is AnalogView.java
 * Created on 22.3.2012
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
package net.sunnefa.lcarsclock.views;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;
import net.sunnefa.lcarsclock.models.ClockModel;

/**
 *
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
public class AnalogView extends AbstractClock {
    private ClockModel clock_model;
    
    
    
    public AnalogView(ClockModel clock_model) {
        super(clock_model);
        Image hour_hand_image = Toolkit.getDefaultToolkit().getImage("/Users/shannensekaya/NetBeansProjects/LCARS Clock/assets/hour-hand.png");
        RotatingImage hour_hand = new RotatingImage(hour_hand_image);
        hour_hand.setBounds(100, 100, 200, 200);
        
        this.add(hour_hand);
        
        
        
    }
    
}
