
package com.mycompany.pe0206;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int numberEntered = input.nextInt(); // 932
        int onesPlace = numberEntered % 10; // 2
        int tensAndHundreds = numberEntered / 10; // 93
        int tensPlace = tensAndHundreds % 10; // 3
        int hundredsPlace = tensAndHundreds / 10; // 9
        int sum = onesPlace + tensPlace + hundredsPlace;
        System.out.println("THe sum of the digits is " + sum);
    }
}