package javaprogramme;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data: Input a Decimal Number : 5
 */

public class ProgrammeHw17 {
   //main method
    public static void main(String[] args) {
        int decimal = 5;


        String binary1 = Integer.toBinaryString(decimal);
        System.out.println("Binary number is " + binary1);


    }
}
