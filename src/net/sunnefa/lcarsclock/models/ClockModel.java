/**
 * This is ClockModel.java
 * Created on 22.3.2012
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
package net.sunnefa.lcarsclock.models;

import java.text.SimpleDateFormat;
import java.util.*;
import net.sunnefa.lcarsclock.listeners.MyEventListener;



/**
 *
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
public class ClockModel {
    
    private List listeners = new ArrayList();
    
    Date clock_date;
    
    public ClockModel() {
        this.clock_date = new Date();
        Timer timer = new Timer();
        TimerTask time_task = new TimerTask() {
            @Override
            public void run() {
                clock_date.setSeconds(clock_date.getSeconds() + 1);
                ClockModel.this.dispatchEvent();
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
    
    public String get_year() {
        SimpleDateFormat simple = new SimpleDateFormat("yyyy");
        return simple.format(this.clock_date);
    }
    
    public int get_month() {
        return this.clock_date.getMonth();
    }
    
    public synchronized void addEventListener(MyEventListener listener) {
        this.listeners.add(listener);
    }
    
    public synchronized void removeEventListener(MyEventListener listener) {
        this.listeners.remove(listener);
    }
    
    public synchronized void dispatchEvent() {
        ChangeEventClass change_event = new ChangeEventClass(this);
        
        Iterator i = this.listeners.iterator();
        
        while(i.hasNext()) {
            ((MyEventListener) i.next()).handle_change(change_event);
        }
    }
    
    private static class ChangeEventClass extends EventObject {

        public ChangeEventClass(Object o) {
            super(o);
        }
    }

    
}
