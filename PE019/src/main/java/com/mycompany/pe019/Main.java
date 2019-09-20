/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe019;

/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        final double WIDTH = 4.5;
        final double HEIGHT = 7.9;
        double area = WIDTH * HEIGHT;
        double perimeter = WIDTH + WIDTH + HEIGHT + HEIGHT;
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
    }
}
