/* PE 0316 - Random character
 * 
 * "asciiDecimalCode" is a number (integer) between 65 and 90
 *  It represents an uppercase letter
 * 
 * "uppercaseCharacter" is a character that is an uppercase letter between A and Z
 * 
 * number -> character
 * 
 * takes a random number between 65 and 90 inclusive and converts it to its
 * corresponding ASCII character (uppercase letter)
 * 
 * public static int generateAsciiCode() { asciiDecimalCode eg 75 }
 * public static void printUppercaseCharacter(asciiDecimalCode) { 'A' }
 *
 * given 65; expect 'A'
 * given 75; expect 'J'
 * given 90; expect 'Z'

   
*/

package com.mycompany.pe0316;

/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        // generate a random number between 65 and 90 inclusive, ie the ASCII codes for uppercase letters
        int asciiDecimalCode = (int)Math.round(((Math.random() * 26) + 65));
        
        // convert asciiDecimalCode to its corresponding ASCII character
        char uppercaseCharacter = (char)asciiDecimalCode;
        
        // display result
        System.out.println(uppercaseCharacter);
    }
}
