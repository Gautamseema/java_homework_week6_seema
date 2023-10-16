package javaprogramme;

/**
 * Write a Java program to swap two variables.
 */

public class ProgrammeHw15 {
    //main method
    public static void main(String[] args) {
        int a, b,temp;
        a = 15;
        b = 25;
        System.out.println("Before swapping : a , b = " + a + ", "+ + b);
        // swapping variable
         temp = a;
         a = b;
         b = temp;
        System.out.println("After swapping : a, b = " + a + ", "+ + b);

    }
}
