/* PE0324 - Game: picking a card
 * 
 * number is a number between 1 and 52. It represents a card in a deck of cards
 */
package com.mycompany.pe0324;

/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 52 + 1);
        System.out.println(number);
        switch(number % 13) {
            case 1:
                System.out.print("Ace of ");
                break;
            case 11:
                System.out.print("Jack of ");
                break;
            case 12: 
                System.out.print("Queen of ");
                break;
            case 13: 
                System.out.print("King of ");
                break;
            default:
                System.out.print((number % 13) + " of ");
                break;
        }
        switch(number / 13) {
            case 0:
                System.out.println("Clubs");
                break;
            case 1:
                System.out.println("Diamonds");
                break;
            case 2:
                System.out.println("Hearts");
                break;
            case 3: 
                System.out.println("Spades");
        }
    }
}
