package javaprogramme;

import java.util.Scanner;

/** Write a program to enter any radius value of the circle and find out the area.
 */

public class ProgrammeHw6 {
   // main methods
    public static void main(String[] args) {
        double radius,area;
        Scanner scanner = new Scanner(System.in); // import Scanner;
        System.out.println("Enter the radius of circle");
        radius = scanner.nextDouble();
        scanner.close();

        area = Math.PI * radius * radius;
        System.out.println("Area of the Circle is " + area);

    }

}
