/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe0305;
import java.util.Scanner;
/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);
        int c = (int)(Math.random() * 10);
        System.out.printf("What is the sum of %d %d %d?", a, b, c);
        int answer = input.nextInt();
        
        
    }
}
