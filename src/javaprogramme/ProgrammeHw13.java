package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */

public class ProgrammeHw13 {
    //main method
    public static void main(String[] args) {
        double a,b,c, average, n;
        Scanner scanner = new Scanner(System .in); // run scanner
        System.out.println("Input the first number");
        a = scanner.nextDouble();
        System.out.println("input the second number");
        b = scanner.nextDouble();
        System.out.println("input the third number");
        c = scanner.nextDouble();
        System.out.print("The average of entered number is: " +((a+b+c) / 3));
        scanner.close();



    }





}
