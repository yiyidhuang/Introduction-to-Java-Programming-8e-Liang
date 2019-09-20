/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe02148e;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // PE01248e - health application: computing BMI
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        weight = weight * 0.45359237; // convert to kilograms
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        height = height * 0.0254; // convert to meters
        double bmi = weight / Math.pow(height, 2);
        System.out.println("BMI is " + bmi);
    } 
}

