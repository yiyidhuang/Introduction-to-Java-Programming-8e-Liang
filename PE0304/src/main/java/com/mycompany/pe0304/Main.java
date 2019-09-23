/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe0304;
import java.util.Scanner;
/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstInteger = (int)(Math.random() * 100);
        int secondInteger = (int)(Math.random() * 100);
        System.out.printf("What is the sum of %d and %d? ", firstInteger, secondInteger);
        int answer = input.nextInt();
        System.out.println("");
        System.out.println(answer == (firstInteger + secondInteger));
    }
}
