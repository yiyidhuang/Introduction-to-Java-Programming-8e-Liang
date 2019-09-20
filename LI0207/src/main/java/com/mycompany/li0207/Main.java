
// Listing 2.7
// Show Current Time in hh:mm:ss

package com.mycompany.li0207;

/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        // Obtain total milliseconds since Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        
        // Obtain total seconds since Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;
        
        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;
        
        // Obtain total minutes
        long totalMinutes = totalSeconds / 60;
        
        // Compute current minute in the hour
        long currentMinute = totalMinutes % 60;
        
        // Obtain total hours
        long totalHours = totalMinutes / 60;
        
        // Compute current hour
        long currentHour = totalHours % 24;
        
        // Display results
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
        double a = 6.5;
        a += a + 1;
        System.out.println(a);
        a = 6;
        a /= 2;
        System.out.println(a);
        int x, y;
        x = y = x = 5;
        System.out.println(x);
        System.out.println(y);
        int aa = 6;
        int b = aa++;
        System.out.println(aa);
        System.out.println(b);
        aa = 6;
        b = ++aa;
        System.out.println(aa);
        System.out.println(b);
        System.out.println((int)a);
        System.out.println(a);
        System.out.println((double)(1 / 2));
        System.out.println((int)1.7);
        double d = 4.5;
        System.out.println((int)d);
        System.out.println(d);
        int i = (int)d;
        System.out.println(i);
    }
}
