package javaprogramme;

/** Declare one instance and one static variable.
 * Declare one instance method.
 * Declare one static method.
 * Call both instance and static variables into both instance and static methods inside the
   print statement.
 * Declare the Main method.
 * Call both instance and static methods into the Main method and run the programme.
 */

public class ProgrammeHw3 {
 String name = "Maya";// Instance variable
 static int age = 40;// static variable

    //Instance and static method

    public void m1() {
        ProgrammeHw3 s = new ProgrammeHw3();
        System.out.println(s.name);
        System.out.println(name);
        System.out.println(ProgrammeHw3.age);
        System.out.println(age);
    }
 // Instance method
    public void m2() {
        System.out.println(name);
        m3();

    }
    //static method
    public static void m3(){

        System.out.println(age);
    }
   //main method
    public static void main(String[] args) {
        ProgrammeHw3 s = new ProgrammeHw3();
        s.m1();
        s.m2();
        m3();

    }

}
