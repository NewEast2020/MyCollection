package c3x_methods.package1;

public class ClassA_oefb001 {
    public // public added else print only visible in package1
           // in c3x_methods.package1.ClassA_oefb001; cannot be accessed from outside package
           // and called in package B_Inheritance001_method_access_modifiers
    void print_oefb001(){
        ClassC_oefb001 c = new ClassC_oefb001();
        c.message_oefb001 = "World!"; // temp comment
        c.print_oefb001(); // temp comment
    }
}
