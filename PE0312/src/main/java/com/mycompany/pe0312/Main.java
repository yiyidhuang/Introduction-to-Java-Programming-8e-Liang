/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe0312;
import java.util.Scanner;
/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        
        if ((num % 5 == 0) && (num % 6 == 0)) {
            System.out.println(num + " is divisble by both 5 and 6");
        } else if ((num % 5 == 0) || (num % 6 == 0)) {
            System.out.println(num + " is divisible by 5 or 6, but not both");
        } else {
            System.out.println(num + " is not divisible by either 5 or 6");
        }
    }
}
