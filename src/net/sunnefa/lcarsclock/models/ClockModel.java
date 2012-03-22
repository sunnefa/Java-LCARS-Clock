/**
 * This is ClockModel.java
 * Created on 22.3.2012
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
package net.sunnefa.lcarsclock.models;

import java.util.Date;
import java.util.Timer;



/**
 *
 * @author Sunnefa Lind <sunnefa_lind@hotmail.com>
 */
public class ClockModel {
    
    Date clock_date;
    
    public ClockModel() {
        this.clock_date = new Date(2371, 5, 25, 12, 15);
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
        console(this.clock_date.getDate());
        return this.clock_date.getDate();
    }
    
    public int get_year() {
        console(this.clock_date.getYear());
        return this.clock_date.getYear();
    }
    
    public int get_month() {
        console(this.clock_date.getMonth());
        return this.clock_date.getMonth();
    }
    
    private void console(int num) {
        System.out.println(num);
    }

    
}
