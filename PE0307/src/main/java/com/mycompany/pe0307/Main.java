/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe0307;
import java.util.Scanner;
/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();
        
        int remainingAmount = (int)(amount * 100);
        
        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        
        int numberOfPennies = remainingAmount;
        
        System.out.println("Your amount " + amount + " consists of:");
        
        if (numberOfOneDollars > 0) {
            System.out.println("\t" + numberOfOneDollars + (numberOfOneDollars > 1 ? " dollars" : " dollar"));
        }
        if (numberOfQuarters > 0) {
            System.out.println("\t" + numberOfQuarters + (numberOfQuarters > 1 ? " quarters" : " quarter"));
        }
        if (numberOfDimes > 0) {
            System.out.println("\t" + numberOfDimes + (numberOfDimes > 1 ? " dimes" : " dime"));
        }
        if (numberOfNickels > 0) {
            System.out.println("\t" + numberOfNickels + (numberOfNickels > 1 ? " nickels" : " nickel"));
        }
        if (numberOfPennies > 0) {
            System.out.println("\t" + numberOfPennies + (numberOfPennies > 1 ? " pennies" : " penny"));
        }
        
    }
}

