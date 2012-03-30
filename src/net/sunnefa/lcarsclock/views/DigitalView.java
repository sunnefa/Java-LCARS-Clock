/*
 * This is DigitalView.java
 * Created on 22.3.2012
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
package net.sunnefa.lcarsclock.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.EventObject;
import javax.swing.JLabel;
import net.sunnefa.lcarsclock.listeners.MyEventListener;
import net.sunnefa.lcarsclock.models.ClockModel;

/**
 *
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
public class DigitalView extends AbstractClock {
    
    JLabel time_label = new JLabel();
    
    JLabel date_label = new JLabel();
    
    JLabel star_label = new JLabel("", JLabel.CENTER);
    
    
    public DigitalView(ClockModel clock_model) {
        super(clock_model);
        
        this.clock_model.addEventListener(new MyEventListener() {
            @Override
            public void handle_change(EventObject e) {
                
                String hours = DigitalView.this.clock_model.get_hours() + "";
                String minutes = DigitalView.this.clock_model.get_minutes() + "";
                String seconds = DigitalView.this.clock_model.get_seconds() + "";
                
                if(DigitalView.this.clock_model.get_hours() < 10) {
                    hours = "0" + DigitalView.this.clock_model.get_hours();
                }
                
                if(DigitalView.this.clock_model.get_minutes() < 10) {
                    minutes = "0" + DigitalView.this.clock_model.get_minutes();
                }
                
                if(DigitalView.this.clock_model.get_seconds() < 10) {
                    seconds = "0" + DigitalView.this.clock_model.get_seconds();
                }
                
                DigitalView.this.time_label.setText(hours + ":" + minutes + ":" + seconds);
            }
        });
        
        GridLayout grid = new GridLayout(2,1);
        grid.setHgap(150);
        
        this.setLayout(grid);
        
        this.time_label = new JLabel();
        this.time_label.setBounds(100, 100, 300, 300);
        this.set_font_color(time_label);
        
        
        this.date_label = new JLabel();
        this.date_label.setText(this.clock_model.get_date() + "." + this.clock_model.get_month() + "." + this.clock_model.get_year());
        this.set_font_color(date_label);
        
        this.star_label = new JLabel("", JLabel.CENTER);
        this.star_label.setText("65582.5");
        this.set_font_color(star_label);
        
        
        this.add(this.time_label);
        this.add(this.date_label);
        this.add(this.star_label);
        
    }

    private void set_font_color(JLabel label) {
        label.setForeground(new Color(255, 153, 0));
        label.setFont(new Font("Swiss911 UCm BT", Font.TRUETYPE_FONT, 79));
        
    }
    
}
