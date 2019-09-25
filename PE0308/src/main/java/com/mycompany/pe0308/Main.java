/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe0308;
import java.util.Scanner;
/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter 3 integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        if (num2 > num3) {
           int temp = num2;
           num2 = num3;
           num3 = temp;
        }
        
        if (num1 > num2) {
           int temp = num1;
           num1 = num2;
           num2 = temp;
        }
        
        System.out.println(num1 + " " + num2 + " " + num3);
    }
    
   
    
}
