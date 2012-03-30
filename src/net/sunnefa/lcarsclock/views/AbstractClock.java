/*
 * This is AbstractClock.java
 * Created on 22.3.2012
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
package net.sunnefa.lcarsclock.views;

import javax.swing.JPanel;
import net.sunnefa.lcarsclock.models.ClockModel;

/**
 *
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
public class AbstractClock extends JPanel {
    
    protected ClockModel clock_model;
    
    public AbstractClock(ClockModel clock_model) {
        this.clock_model = clock_model;
        //this.clock_model.addEventListener(new MyEventListener());
    }
    
}
