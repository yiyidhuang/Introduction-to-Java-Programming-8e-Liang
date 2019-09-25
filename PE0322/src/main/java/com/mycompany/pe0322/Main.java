/* PE0322 - Geometry: point in a circle?
 * 
 * "x1" and "y1" are numbers that represent the two coordinates of a point on a grid
 * "X2" and "Y2" represent the coordinates 0 and 0, respectively, on a grid
 * "distance" is a number that is the distance from x1, y1 to x2, y2
 * "RADIUS" is a number that is 10. It represents the radius of a circle on the grid
 * "isInsideCircle" is a boolean that tells you whether (x, y) is inside circle
 * 
 * (x1, y1, X2, Y2 -> distance)
 * (RADIUS, distance -> isInsideCircle)
 * 
 * Program takes two coordinates and determines whether they are inside a circle centered at (0, 0) with a radius of 10
 * 
 * given (4, 5); expect distance < 10 and isInsideCircle == true
 * given (9, 9(; expect distance > 10 and isInsideCircle == false
 */
package com.mycompany.pe0322;
import java.util.Scanner;
/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        final double X2 = 0.0;
        final double Y2 = 0.0;
        final double RADIUS = 10.0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        double distance = Math.pow(X2 - x1, 2) + Math.pow(Y2 - y1, 2);
        distance = Math.pow(distance, 0.5);
        
        boolean isInsideCircle = distance <= RADIUS;
        
        if (isInsideCircle) {
            System.out.println("Point (" + x1 + ", " + y1 + ") is in the circle" );
        } else {
            System.out.println("Point (" + x1 + ", " + y1 + ") is not in the circle");
        }
    }
}
