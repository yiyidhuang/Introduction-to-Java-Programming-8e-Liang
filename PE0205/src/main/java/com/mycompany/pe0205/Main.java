
package com.mycompany.pe0205;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityPercentage = input.nextDouble();
        double gratuityDecimal = gratuityPercentage / 100.0;
        double gratuity = subtotal * gratuityDecimal;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}