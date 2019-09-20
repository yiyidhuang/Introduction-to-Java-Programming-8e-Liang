/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.li0204;

import java.util.Scanner;
/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        final double PI = 3.14159; // Declare a constant
        
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a radius
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();
        
        // Compute area
        double area = radius * radius * PI;
        
        // Display result
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
    
}
