/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe0211;
import java.util.Scanner;
/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();
        
        double startingPopulation = 312032486.0;
        // System.out.println(startingPopulation);
        
        double totalSecondsInYear = 365 * 24 * 60 * 60;
        // System.out.println(totalSecondsInYear);
        
        // calculate births per year
        double birthsPerYear = totalSecondsInYear / 7.0;
        // System.out.println(birthsPerYear);
        
        // calculate new immigrants per year
        double immigrantsPerYear = totalSecondsInYear / 45.0;
        // System.out.println(immigrantsPerYear);
        
        // calculate deaths per year
        double deathsPerYear = totalSecondsInYear / 13.0;
        // System.out.println(deathsPerYear);
        // add births/yr and immigrants/yr and subtract deaths/yr to/from total
        double increaseInPopulation = (birthsPerYear + immigrantsPerYear - deathsPerYear) * numberOfYears;
        double population = startingPopulation + increaseInPopulation;
        System.out.println("The population in " + numberOfYears + " years is " + population);
        
    }
}