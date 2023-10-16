package javaprogramme;

import java.util.Scanner;

/** Write a Java program that takes a number as input and prints its multiplication table up to 10.
 */

public class ProgrammeHw10 {
 // main method
 public static void main(String[] args) {
     int number;
     Scanner scanner = new Scanner(System.in); // run scanner
     System.out.println("Input a number: ");
     number = scanner. nextInt();
     scanner.close();

     for (int i =0; i<10; i++){
         System.out.println(number + " x " + (i +1) + " = " + (number * (i+1)));
     }

 }
}
