/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe0110;

/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        // Display average speed in miles
        double distanceKm = 14.0;
        double minutes = 45.5;
        double hours = minutes / 60.0;
        double distanceMiles = distanceKm / 1.6;
        double milesPerHour = distanceMiles / hours;
        System.out.println("The average speed of the runner in miles is: " + milesPerHour);
        System.out.println((14 / 45.5) * 60 / 1.6);
       
    }
}
