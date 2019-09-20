/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe02158e;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // financial application: compound value
        double balance = 0;
        int monthlyDeposit = 100;
        double monthlyInterestRate = 0.05 / 12;
        balance = (balance + monthlyDeposit) * (1 + monthlyInterestRate);
        System.out.println(balance);
        balance = (balance + monthlyDeposit) * (1 + monthlyInterestRate);
        System.out.println(balance);
        balance = (balance + monthlyDeposit) * (1 + monthlyInterestRate);
        System.out.println(balance);
        balance = (balance + monthlyDeposit) * (1 + monthlyInterestRate);
        System.out.println(balance);
        balance = (balance + monthlyDeposit) * (1 + monthlyInterestRate);
        System.out.println(balance);
        balance = (balance + monthlyDeposit) * (1 + monthlyInterestRate);
        System.out.println(balance);
    } 
}

