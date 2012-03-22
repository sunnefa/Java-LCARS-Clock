/*
 * This is DigitalView.java
 * Created on 22.3.2012
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
package net.sunnefa.lcarsclock.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
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
        
        GridLayout grid = new GridLayout(2,1);
        grid.setHgap(150);
        
        this.setLayout(grid);
        
        this.time_label = new JLabel();
        this.time_label.setText(this.clock_model.get_hours() + ":" + this.clock_model.get_minutes() + ":" + this.clock_model.get_seconds());
        this.time_label.setFont(new Font("Swiss911 UCm BT", Font.TRUETYPE_FONT, 79));
        this.time_label.setForeground(new Color(255, 153, 0));
        this.time_label.setBounds(100, 100, 300, 300);
        
        this.date_label = new JLabel();
        this.date_label.setText(this.clock_model.get_date() + "." + this.clock_model.get_month() + "." + this.clock_model.get_year());
        this.date_label.setFont(new Font("Swiss911 UCm BT", Font.TRUETYPE_FONT, 79));
        this.date_label.setForeground(new Color(255, 153, 0));
        
        this.star_label = new JLabel("", JLabel.CENTER);
        this.star_label.setText("65582.5");
        this.star_label.setFont(new Font("Swiss911 UCm BT", Font.TRUETYPE_FONT, 79));
        this.star_label.setForeground(new Color(255, 153, 0));
        
        
        this.add(this.time_label);
        this.add(this.date_label);
        this.add(this.star_label);
        
    }
    
}
