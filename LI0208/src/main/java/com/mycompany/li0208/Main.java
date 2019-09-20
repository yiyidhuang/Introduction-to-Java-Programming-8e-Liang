// Listing 2.8
// Sales Tax
// input: purchase amount
// output: sales tax amount
package com.mycompany.li0208;
import java.util.Scanner;
/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();
        
        double tax = purchaseAmount * 0.13;
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
        
        //checkpoints
        float f = 12.5F;
        int i = (int)f;
        System.out.println("f is " + f);
        System.out.println("i is " + i);
        double amount = 5;
        System.out.println(amount / 2);
        System.out.println( 5 / 2);
    }
}
