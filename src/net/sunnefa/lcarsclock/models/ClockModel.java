/**
 * This is ClockModel.java
 * Created on 22.3.2012
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
package net.sunnefa.lcarsclock.models;

import java.util.*;



/**
 *
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
public class ClockModel {
    
    private List listenters = new ArrayList();
    
    Date clock_date;
    
    public ClockModel() {
        this.clock_date = new Date(2371, 5, 25, 12, 15);
        Timer timer = new Timer();
        TimerTask time_task = new TimerTask() {
            @Override
            public void run() {
                clock_date.setSeconds(clock_date.getSeconds() + 1);
                
            }
        };
        
        timer.schedule(time_task, 1000, 1000);
    }
    
    public int get_seconds() {
        return this.clock_date.getSeconds();
    }
    
    public int get_minutes() {
        return this.clock_date.getMinutes();
    }
    
    public int get_hours() {
        return this.clock_date.getHours();
    }
    
    public int get_date() {
        return this.clock_date.getDate();
    }
    
    public int get_year() {
        return this.clock_date.getYear();
    }
    
    public int get_month() {
        return this.clock_date.getMonth();
    }

    
}
