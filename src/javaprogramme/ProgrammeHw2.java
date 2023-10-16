package javaprogramme;

/** Declare two static variables
 * Declare one static method
 * Call both static variables into the static method inside the print statement.
 *Declare the Main method.
 * Call the static method into the Main method and Run the programme.
 */


public class ProgrammeHw2 {
    static int age = 45; //static variable
    static String name ="Maya"; //static variable

 //static method
public static void m2(){
        System.out.println(age);
        System.out.println(name);

    }
//main method
    public static void main(String[] args){
        m2(); //method calling to main method;

    }
}
