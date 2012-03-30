/*
 * This is AnalogView.java
 * Created on 22.3.2012
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
package net.sunnefa.lcarsclock.views;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.EventObject;
import javax.swing.JPanel;
import net.sunnefa.lcarsclock.listeners.MyEventListener;
import net.sunnefa.lcarsclock.models.ClockModel;

/**
 *
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
public class AnalogView extends AbstractClock {
    private ClockModel clock_model;
    
    private RotatingImage hour_hand;
    
    private RotatingImage minute_hand;
    
    private RotatingImage second_hand;
    
    
    
    public AnalogView(ClockModel clock_model) {
        super(clock_model);
        
        this.clock_model.addEventListener(new MyEventListener() {
            @Override
            public void handle_change(EventObject e) {
                
            }
        });
        
        
        
        Image hour_hand_image = Toolkit.getDefaultToolkit().getImage("/Users/shannensekaya/NetBeansProjects/LCARS Clock/assets/hour-hand.png");
        Image minute_hand_image = Toolkit.getDefaultToolkit().getImage("/Users/shannensekaya/NetBeansProjects/LCARS Clock/assets/minute-hand.png");
        Image second_hand_image = Toolkit.getDefaultToolkit().getImage("/Users/shannensekaya/NetBeansProjects/LCARS Clock/assets/second-hand.png");
        
        setLayout(null);
        this.hour_hand = new RotatingImage(hour_hand_image);
        this.hour_hand.setBounds(100, 105, hour_hand_image.getWidth(this),hour_hand_image.getHeight(this));
        
        this.minute_hand = new RotatingImage(minute_hand_image);
        this.minute_hand.setBounds(90, 35, minute_hand_image.getWidth(this), minute_hand_image.getHeight(this));
        
        this.second_hand = new RotatingImage(second_hand_image);
        this.second_hand.setBounds(70, 110, second_hand_image.getWidth(this), second_hand_image.getHeight(this));

        this.add(this.minute_hand);
        this.add(this.second_hand);
        this.add(this.hour_hand);
        
        
        
    }
    
}
