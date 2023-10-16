package javaprogramme;
/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * Test Data: Input first number: 125 Input second number: 24
 */

import java.util.Scanner;

public class ProgrammeHw18 {
    public static void main(String[] args) {
        int number1, number2;
        Scanner scanner = new Scanner(System .in);
        System.out.println("input first number");
        number1 = scanner.nextInt();
        System.out.println("input second number");
        number2 = scanner.nextInt();
        scanner.close();


        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println(number1 + " mod " + number2 + " = " + (number1 % number2));





    }
}
