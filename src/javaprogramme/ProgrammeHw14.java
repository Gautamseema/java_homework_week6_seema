package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data: Width = 5.5 Height = 8.5
 */

public class ProgrammeHw14 {
    //main method;
    public static void main(String[] args) {
        double w, h, area, perimeter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height of rectangle");
        h = scanner.nextDouble();
        System.out.println("Enter width of rectangle");
        w = scanner.nextDouble();
        perimeter = 2*(h+w);
        System.out.println("perimeter of rectangle:" +perimeter);
        area = h*w;
        System.out.println("Area of rectangle:" + area);
      scanner.close();

    }
}
