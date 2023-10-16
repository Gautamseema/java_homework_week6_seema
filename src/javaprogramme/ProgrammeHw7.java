package javaprogramme;

import java.util.Scanner;

/** Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius
 */

public class ProgrammeHw7 {
    //main method
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner scanner = new Scanner(System.in); // run scanner
        System.out.println("Enter the Fahrenheit value=");
        fahrenheit = scanner.nextDouble();
        scanner.close();

        //°C = [(°F-32)×5]/9.
        celsius = ((fahrenheit -32)* 5/9 );
        System.out.println("celsius");
        //convert degree Fahrenheit to degree Celsius
        System.out.println(fahrenheit + " degree fahrenheit is equal to " + celsius + " in celsius");


    }
}
