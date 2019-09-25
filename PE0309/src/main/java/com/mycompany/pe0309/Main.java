/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe0309;

/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the first nine digits of the ISBN, separated by spaces: ");
        int d1 = input.nextInt();
        int d2 = input.nextInt();
        int d3 = input.nextInt();
        int d4 = input.nextInt();
        int d5 = input.nextInt();
        int d6 = input.nextInt();
        int d7 = input.nextInt();
        int d8 = input.nextInt();
        int d9 = input.nextInt();
        
        int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        System.out.println(checksum);
        if (checksum == 10) {
            System.out.println("" + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        } else {
            System.out.println("" + d1 + + d2  + d3 + d4 + d5 + d6 + d7 + d8 + d9 + checksum);
        }
        
        
    }
}
