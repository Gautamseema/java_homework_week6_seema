package javaprogramme;

/** Declare two instance and two static variables.
 * Declare one instance method.
 * Declare one static method.
 * Call all four instance and static variables into both instance and static methods inside the print statement.
 * Declare the Main method.
 * Call both instance and static methods into the Main method and run the programme.
 */


public class ProgrammeHw4 {
    String name = "Maya"; // Instance
    String subject = "English"; // Instance
    static int age = 14; //static variable
    static int score = 130; //static variable
   //Instance and static method
    public void m1(){
        ProgrammeHw4 g = new ProgrammeHw4();
        System.out.println(g.name);
        System.out.println(name);
        System.out.println(g.subject);
        System.out.println(subject);
        System.out.println(ProgrammeHw4.age);
        System.out.println(age);
        System.out.println(ProgrammeHw4.score);
        System.out.println(score);
    }
    //Instance method
    public void m2(){
        System.out.println(name);
        System.out.println(subject);
        m3();
    }
    //static method
    public static void m3(){
        System.out.println(age);
        System.out.println(score);
    }
    //main method

    public static void main(String[] args) {
        ProgrammeHw4 g = new ProgrammeHw4();
        g.m1();
        g.m2();
        m3();


    }
}
