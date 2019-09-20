/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe0210;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in kilograms:");
        double weight = input.nextDouble();
        
        System.out.print("Enter the initial temperature:");
        double initialTemperature = input.nextDouble();
        
        System.out.print("Enter the final temperature:");
        double finalTemperature = input.nextDouble();
        
        double energyNeeded = weight * (finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is " + energyNeeded);
    }
}
