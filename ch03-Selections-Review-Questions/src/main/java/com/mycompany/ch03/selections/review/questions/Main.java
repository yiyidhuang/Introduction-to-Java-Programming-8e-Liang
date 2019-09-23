/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ch03.selections.review.questions;

class Main {
  public static void main(String[] args) {
    
    // Question 3.9 - generate random integers
    int i = (int)(Math.random() * 20);
    System.out.println("-------3.09--------");
    System.out.println("number between 0 and 20: " + i);
    int j = (int)(Math.random() * 10 + 10);
    System.out.println("number between 10 and 20: " + j);
    int k = (int)(Math.random() * 40 + 10);
    System.out.println("number between 10 and 50: " + k);
    
    // Question 3.10 
    int y = 3;
    int x = 0;
    if (y > 0) {
        x = 1;
    }
    System.out.println("-------3.10--------");
    System.out.println("y is " + y + " therefore x is " + x);
      
    // Q 3.11
    
    double pay = 100;
    int score = 100;
    if (score > 90) {
        pay += pay * 0.03;
    }
    System.out.println("-------3.11--------");
    System.out.println("Score is " + score + " therefore pay increased to " + pay);
    
    pay = 100;
    score = 0;
    if (score > 90) {
        pay += pay * 0.03;
    } else {
        pay += pay * 0.01;
    }
    System.out.println("Score is " + score + " therefore pay increased to " + pay);
    
    // 3.12
    
    score = 60;
    char grade;
    if (score < 60.0) {
        grade = 'F';
    }
    else if (score <=70.0) {
        grade = 'D';
    } else if (score <= 80.0) {
        grade = 'C';
    } else if (score <= 90.0) {
        grade = 'B';
    } else {
        grade = 'A';
    }
    System.out.println("-------3.12--------");
    System.out.println("score is " + score + " therefore grade is " + grade);
    
    // 3.13
    
    System.out.println("-------3.13--------");
    int count = 11;
    boolean newline = true;
    newline = count % 10 == 0 ? true : false;
    System.out.println("");
    System.out.println("count is " + count + " therefore newline is " + newline);
    
    // 3.14
    
    System.out.println("");
    System.out.println("-------3.14--------");
    System.out.println("");
    int xx = 1;
    System.out.println( (xx != 1) == !(xx == 1) );
    
    // 3.15
    System.out.println("");
    System.out.println("-------3.15--------");
    System.out.println("");
    
    int num = 55;
    boolean answer = num >= 1 && num <= 100 ? true : false;
    System.out.println("num is " + num + " therefore answer is " + answer);
    
    // 3.16
    
    System.out.println("");
    System.out.println("-------3.16--------");
    System.out.println("");
    num = -1;
    answer = (num >=1 && num <= 100) || num < 0 ? true : false;
    
    System.out.println("is number between 1 and 100 or is it negative? " + answer );
    
    // 3.17
    
    int q = 2;
    int r = 1;
    boolean s = x > y && y > 0;
    
    // 3.18
    
    System.out.println("");
    System.out.println("-------3.18--------");
    System.out.println("");
    int xxx = 1;
    boolean test1 = (xxx >= 1) && (xxx++ > 1);
    boolean test2 = (xxx > 1) && (xxx++ > 1);
      System.out.println(xxx);
      System.out.println(test1);
      System.out.println(test2);
    
      
    // 3.19
      
    System.out.println("");
    System.out.println("-------3.19--------");
    System.out.println("");
    
    char ch = 'A';
    System.out.println("A: " + (ch >= 'A' && ch <= 'Z'));
    ch = 'p';
    System.out.println("p: "+ (ch >= 'A' && ch <= 'Z'));
    ch = 'E';
    System.out.println("E: " + (ch >= 'A' && ch <= 'Z'));
    ch = '5';
    System.out.println("5: " + (ch >= 'A' && ch <= 'Z'));
    
    System.out.println("");
    System.out.println("-------3.21 to 3.24--------");
    System.out.println("");
    
    int age = 15;
    boolean isTeenager = age > 13 && age < 18 ? true : false;
    System.out.println(isTeenager); //true
    
    int weight = 50;
    int height = 161;
    boolean isHealthy = weight > 50 || height > 160 ? true : false; // true
    System.out.println(isHealthy);
    
    isHealthy = weight > 50 && height > 160 ? true : false;
    System.out.println(isHealthy); // false
    
    isHealthy = weight > 50 ^ height > 160 ? true : false;
    System.out.println(isHealthy); // true
    
    System.out.println("");
    System.out.println("-------3.27--------");
    System.out.println("");

    int xxxx = 0;
    int a = 1;
    switch(a) {
        case 1: xxxx += 5;
                break;
        case 2: xxxx += 10;
                break;
        case 3: xxxx += 16;
                break;
        case 4: xxxx += 34;
                break;
        default: System.out.println("Invalid value");
        
    }
    
      System.out.println("a is " + a + " and xxxx is " + xxxx);
      
      System.out.println("");
    System.out.println("-------3.28--------");
    System.out.println("");
    
    int day = 5;
    String dayName;
    switch(day){
        case 0:     dayName = "Sunday";
                    break;
        case 1:     dayName = "Monday";
                    break;
        case 2:     dayName = "Tuesday";
                    break;
        case 3:     dayName = "Wednesday";
                    break;
        case 4:     dayName = "Thursday";
                    break;
        case 5:     dayName = "Friday";
                    break;
        case 6:     dayName = "Saturday";
                    break;
        default:    dayName = "Invalid";
    }
      System.out.println(dayName);
      
    System.out.println("");
    System.out.println("-------3.29--------");
    System.out.println("");
    
    System.out.print(count % 10 == 0 ? count + "\n" : count + " ");
    
    System.out.println("");
    System.out.println("-------3.30--------");
    System.out.println("");
    
    int temperature = 90;
    pay = temperature > 90 ? pay * 1.5 : pay * 1.1; 
      System.out.println(pay);
      
    System.out.println("");
    System.out.println("-------3.31--------");
    System.out.println("");
    
      System.out.println("boolean: %%b, character: %%c, decimal integer: %%d, floating-point number: %%f, string: %%s");
    
      System.out.printf("%5d %d", 1, 2, 3); // too many parameters
      System.out.println("");
      System.out.printf("%5d %.2f", 1, 2.0); // too few parameters
      System.out.println("");
      System.out.printf("%5d %.3f\n", 1, 2.0); // second parameter is invalid type - ie int instead of float
      
      System.out.printf("amount is %f %e\n", 32.32, 32.32);
      System.out.printf("amount is %5.4f %5.4e\n", 32.32, 32.32);
      System.out.printf("%6b\n", (1 > 2));
      System.out.printf("%-6b%s\n", (1 > 2), "Java");
      System.out.printf("%6b%-6s\n", (1 > 2), "Java");
      
  }
}