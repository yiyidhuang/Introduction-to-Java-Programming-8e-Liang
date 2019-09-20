/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe02168e;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // PE02168e - Science: calculating energy needed to heat water
        System.out.print("Enter amount of water in kilograms: ");
        double weight = input.nextDouble();
        System.out.print("Enter initial temp in C: ");
        double initialTemp = input.nextDouble();
        System.out.print("Enter final temp in C: ");
        double finalTemp = input.nextDouble();
        double energy = weight * (finalTemp - initialTemp) * 4184;
        System.out.println("The energy needed is: " + energy);
    } 
}

