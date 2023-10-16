package javaprogramme;

/**
 * Write a Java program to add two binary numbers.
 * Input Data: Input first binary number: 10
 * Input second binary number: 11
 * Expected Output: Sum of two binary numbers: 101
 */


public class ProgrammeHw16 {
    //main method
    public static void main(String[] args) {

        String binary1 = "10";
        String binary2 = "11";

        int f = Integer.parseInt (binary1, 2);
        int s = Integer.parseInt(binary1, 2);

        int ans = f + s;

        String sum = Integer.toBinaryString(ans);
        System.out.println("Sum of two Binary number: " + sum);
    }

}
