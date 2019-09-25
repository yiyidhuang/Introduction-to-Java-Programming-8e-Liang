/* PE0320 Science: wind-chill temperature
 * 
 * windChill = 35.764 + 0.6215 * tempFahr - 35.75 * Math.pow(windSpeedMPH, 0.16) + 0.4275 * tempInFahr * Math.pow(windSpeedMPH, 0.16)
 * 
 * windChill is a number (double)
 * tempFahr is a number (double) between -58 and 41 degrees fahrenheit
 * windSpeedMPH is a number (double) greater than or equal to 2
 * 
 * (tempFahr, windSpeedMPH -> windChill)
 * 
 * computes the windChill
 * 
 * public static void printWindChill(tempFahr, windSpeedMPH) { 23.3 }
 */
package com.mycompany.pe0320;
import java.util.Scanner;
/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature in fahrenheit: ");
        double tempFahr = input.nextDouble();
        System.out.print("Enter a windspeed in MPH: ");
        double windSpeedMPH = input.nextDouble();
        
        // print message if both numbers are invalid
        if((tempFahr < -58.0 || tempFahr > 41.0) && (windSpeedMPH < 2.0)) {
            System.out.println("Both temperature and wind speed are invalid");
        
        // display result if both numbers are valid
        } else if ((tempFahr >= -58.0 && tempFahr <= 41.0) && (windSpeedMPH >= 2.0)) {
            double windChill = 35.764 + 0.6215 * tempFahr - 35.75 * Math.pow(windSpeedMPH, 0.16) + 0.4275 * tempFahr * Math.pow(windSpeedMPH, 0.16);
            System.out.println("Wind chill is " + windChill);;
        
        // print message that tempFahr is invalid
        } else if (tempFahr < -58.0 || tempFahr > 41.0) {
            System.out.println("Temperature is invalid");
        
        // print message that windSpeedMPH is invalid
        } else {
            System.out.println("Wind speed is invalid");
        }
        
    }
}
