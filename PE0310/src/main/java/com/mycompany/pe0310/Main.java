/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe0310;
import java.util.Scanner;
/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        
        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);
        
        System.out.print("What is " + num1 + " + " + num2 + ": " );
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        
        if (answer == (num1 + num2)) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong. " + num1 + " + " + num2 + " should be " + (num1 + num2));
        }
    }
}
