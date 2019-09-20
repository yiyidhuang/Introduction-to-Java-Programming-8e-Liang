/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pe0111;

/**
 *
 * @author newTodd
 */
public class Main {
    public static void main(String[] args) {
        double population = 312032486.0;
        System.out.println("population at beginning: " + population);
        double totalSecondsInYear = 365 * 24 * 60 * 60;
        System.out.println("seconds in a year: " + totalSecondsInYear);

        // calculate births per year
        double birthsPerYear = totalSecondsInYear / 7.0;
        System.out.println("births per year: " + birthsPerYear);
        
        // calculate new immigrants per year
        double immigrantsPerYear = totalSecondsInYear / 45.0;
        System.out.println("immigrants per year: " + immigrantsPerYear);
        
        // calculate deaths per year
        double deathsPerYear = totalSecondsInYear / 13.0;
        System.out.println("deaths per year: " + deathsPerYear);
        
        // add births/yr and immigrants/yr and subtract deaths/yr to/from total
        population = population + birthsPerYear + immigrantsPerYear - deathsPerYear;
        System.out.println(population); // year 1
        population = population + birthsPerYear + immigrantsPerYear - deathsPerYear;
        System.out.println(population); // year 2
        population = population + birthsPerYear + immigrantsPerYear - deathsPerYear;
        System.out.println(population); // year 3
        population = population + birthsPerYear + immigrantsPerYear - deathsPerYear;
        System.out.println(population); // year 4        
        population = population + birthsPerYear + immigrantsPerYear - deathsPerYear;
        System.out.println(population); // year 5
    }
}
