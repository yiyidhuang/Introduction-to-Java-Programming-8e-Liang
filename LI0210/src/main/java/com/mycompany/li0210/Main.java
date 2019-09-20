/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.li0210;
import java.util.Scanner;
/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       // Receive the amount
       System.out.print("Enter an amount in double, e.g. 11.56: ");
        double amount = input.nextDouble();
        
        int remainingAmount = (int)(amount * 100);
        // System.out.println(remainingAmount);
        
        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        // System.out.println(numberOfOneDollars);
        // System.out.println(remainingAmount);
        
        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        // System.out.println(numberOfQuarters);
        // System.out.println(remainingAmount);
        
        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        
        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        
        // find the number of pennies in the remaining aamount
        int numberOfPennies = remainingAmount;
        
        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println("     " + numberOfOneDollars + " dollars");
        System.out.println("     " + numberOfQuarters + " quarters");
        System.out.println("     " + numberOfDimes + " dimes");
        System.out.println("     " + numberOfNickels + " nickels");
        System.out.println("     " + numberOfPennies + " pennies");
        
        
    }
}
