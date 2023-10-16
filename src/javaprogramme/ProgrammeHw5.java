package javaprogramme;

import java.util.Scanner;

/** Write a program for a calculator
 *  With addition,subtraction, multiplication and division methods
 * All with parameters and use string concatenation methods.
 */

public class ProgrammeHw5 {
    //static methods
public static void addition(int a, int b){
        System.out.println("Addition of" + a + " and "+ b + " is : " + (a+b));
    }
public static void subtraction(int a, int b){
    System.out.println("Subtraction of" + a + " and "+ b + " is : " + (a+b));
}
 //Instance methods
public void multiplication(int a, int b){
        System.out.println("Multiplication of" + a + " and "+ b + " is : " + (a*b));
    }
public void division(int a, int b){
        System.out.println("Division of" + a + " and "+ b + " is : " + (b/a));
    }
  //main methods
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProgrammeHw5 obj = new ProgrammeHw5();
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        addition(a,b);
        subtraction(a,b);
        obj.multiplication(a,b);
        obj.division(a,b);
        scanner.close();
    }
        ;
}
