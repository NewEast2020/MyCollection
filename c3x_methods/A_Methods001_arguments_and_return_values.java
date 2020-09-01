package c3x_methods;

public class A_Methods001_arguments_and_return_values {

    public static void main(String[] args) {
        Oef002();
        Oef003();
        Oef004();
        Oef005();
        Oef006();
        Oef007();
        Oef008();
        Oef009();
        Oef010();
    }

    static void Oef002() {
        A_Methods001_arguments_and_return_values m = new A_Methods001_arguments_and_return_values();
        m.method1();
        m.method2();
        m.method3();
        m.method4();
    }
    public void method1(){}

    public void method2(){
        return;
    }

    public Float method3(){
        //return 12.3; // temp comment
        return 12.3f; // temp inserted
    }

    public Float method4(){
        return 12.3f;
    }
    static void Oef003() {

    }

    static void Oef004() {

    }

    static void Oef005() {

    }

    static void Oef006() {

    }

    static void Oef007() {

    }

    static void Oef008() {

    }

    static void Oef009() {

    }

    static void Oef010() {

    }
}

// Methods and Inheritance are 2 key concepts in
// object oriented designing java
// method overriding and inheritance and polymorphism
// method is a procedure or function,
// method is a  reusable block of code
// method can be called from other parts of the program
// method in java always associated with an object

class Main_oef001 {
    // method print
    //  2 parameters : String and int array
    // return  no value
    static void print(String label, int... data){
        System.out.print(label+": ");
        for(int item: data){
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args1) {
        int[] args = {1, 2, 3, 4};
        String label = "test 1";

        print(label, args);
        print("test 2", 1, 2, 3, 4, 5);
        print("test 3", new int[]{1, 2, 3, 4, 5 ,6});
        // print("test 4", {1, 2, 3, 4}); // temp comment
                   // compile error
                   // java: illegal start of expression
    }
    // output
    //    test 1: 1 2 3 4
    //    test 2: 1 2 3 4 5
    //    test 3: 1 2 3 4 5 6
}
// important rule about method arguments
// methods take arguments or parameters from the caller as input
// the parameter type passed into a method must be assignable to
// the parameter types in the method declaration
// methods can take a variable number of arguments
// = at most one variable length arguments
// = must be defined as the last one in parameter list

class Main_oef002 {
    // 4 methods defined

    public void method1_oef002(){}

    public void method2_oef002(){
        return;
    }

    public Float method3_oef002(){
        // return 12.3; // commented out
                     // compile error
                     // java: incompatible types: double cannot be converted to java.lang.Float

        return 12.3f; // comment new line
    }

    public Float method4_oef002(){
        return 12.3f;
    }

    public static void main(String[] args) {
        Main_oef002 m = new Main_oef002();
        m.method1_oef002();
        m.method2_oef002();
        m.method3_oef002();
        m.method4_oef002();
    }
    // output
    // ... niets
}