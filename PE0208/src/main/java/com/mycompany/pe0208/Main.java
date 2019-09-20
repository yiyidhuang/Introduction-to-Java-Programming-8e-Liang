/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe0208;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the timezone offset to GMT: ");
        int offset = input.nextInt();
  
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
        long currentHour = totalHours % 24 + offset;
        
        // Display results
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
