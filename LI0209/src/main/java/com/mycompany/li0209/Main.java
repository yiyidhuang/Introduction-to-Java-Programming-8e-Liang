/* Listing 2.9
Compute Loan
Input: (1) loan amount; (2) annual interest rate; (3) length of loan in years
Output: (1) monthly payment; (2) total payment
 */
package com.mycompany.li0209;
import java.util.Scanner;
/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Enter annual interest rate        
        System.out.print("Enter annual interest rate, e.g., 7.5%: ");
        double annualInterestRate = input.nextDouble();
        
        //Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;
        
        // Enter number of years
        System.out.print("Enter length of loan in years: ");
        int numberOfYears = input.nextInt();
        
        // Enter loan amount        
        System.out.print("Enter the loan amount: ");
        double loanAmount = input.nextDouble();
        
        // Calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        
        double totalPayment = monthlyPayment * numberOfYears * 12;
        
        System.out.println("Monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("Total payment is $" + (int)(totalPayment * 100) / 100.0);
    }
}
