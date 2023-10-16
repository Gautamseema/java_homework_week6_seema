package javaprogramme;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */

public class ProgrammeHw8 {
    // main method
    public static void main(String[] args) {
      int base , height, triangle;
        Scanner scanner = new Scanner(System.in);// import Scanner
        System.out.println("Enter base value of triangle");
        base = scanner.nextInt();
        System.out.println("Enter height value of triangle");
        height = scanner.nextInt();
        scanner.close();

        triangle = ( (base * height) /2);
        System.out.println("Area of triangle is" + triangle);
    }
}
