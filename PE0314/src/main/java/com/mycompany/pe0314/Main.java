/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe0314;
import java.util.Scanner;
/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        double number = Math.random();
        int coin = 0;
        if (number > .5) {
            coin = 1;
        }
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for heads or 1 for tails: ");
        int guess = input.nextInt();
        
        if (guess == coin) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong.");
        }
    }
}
