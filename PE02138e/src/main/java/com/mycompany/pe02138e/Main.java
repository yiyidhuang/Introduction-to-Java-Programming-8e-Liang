/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe02138e;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // PE0213 - calculating future investment value
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();
        double monthlyInterestRate = annualInterestRate / 1200;
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        // format to keep two digits after decimal point - always rounds down!
        futureInvestmentValue = (int)(futureInvestmentValue * 100) / 100.0;
        System.out.println("Accumulated value is " + futureInvestmentValue);
    }
}
