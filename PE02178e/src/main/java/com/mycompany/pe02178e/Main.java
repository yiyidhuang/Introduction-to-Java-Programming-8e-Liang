/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe02178e;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // PE0128 - Science: wind chill temperature
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temp = input.nextDouble();
        System.out.print("Enter the wind speed in mph: ");
        double windSpeed = input.nextDouble();
        double windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temp * Math.pow(windSpeed, 0.16);
        System.out.println("The wind chill index is " + windChill);
    } 
}

