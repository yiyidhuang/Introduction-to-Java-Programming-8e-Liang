/*
 * Liang 8e - PE 0212 - calculate interest on next monthly payment
 */
package com.mycompany.pe02128e;
import java.util.Scanner;
/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate: ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();
        
        double interest = balance * (annualInterestRate / 1200);
        
        System.out.println("The next monthly interest payment is " + interest);
        
    }
}
