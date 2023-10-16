package javaprogramme;

import java.util.Scanner;

/** Write a program to convert the upper case to lower case.
 */

public class ProgrammeHw9 {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input a String");
        String line = scanner.nextLine();
        //convert the upper case to lower case.
        line = line.toLowerCase();
        System.out.println(line);
        scanner.close();


    }
}
