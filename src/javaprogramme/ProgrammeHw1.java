package javaprogramme;

/**Declare two instance variables.
 * Declare one instance method.
 * Call both instance variables into the instance method inside the print statement.
 * Declare the Main method.
 * Call the above instance method into the Main method and Run the programme.
 */


public class ProgrammeHw1 {
   int age = 35; // age is Instance variable
   String name = "Alex"; // name is Instance variable

    // Instance method

    public void m1(){
        ProgrammeHw1 s = new ProgrammeHw1();
        System.out.println(s.name);
        System.out.println(s.age);
    }
    //main method
    public static void main(String[] args) {
        ProgrammeHw1 s = new ProgrammeHw1();
        s.m1();
    }
}
