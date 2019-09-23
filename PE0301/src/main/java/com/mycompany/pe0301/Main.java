/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe0301;
import java.util.Scanner;
/**
 * Programming Exercise 3.2 
 * Algebra: solving quadratic equations
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        double r1 = (- b + Math.pow((b * b - 4 * a * c), 0.5)) / 2.0 * a;
        double r2 = (- b - Math.pow((b * b - 4 * a * c), 0.5)) / 2.0 * a;
        
        double d = b * b - 4 * a * c;
        if (d > 0) {
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (d == 0) {
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
    
}
