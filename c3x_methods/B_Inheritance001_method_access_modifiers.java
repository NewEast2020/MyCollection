package c3x_methods;

import c3x_methods.package1.ClassA_oefb001;
import c3x_methods.package2.ClassB_oefb001;

public class B_Inheritance001_method_access_modifiers {

    public static void main(String[] args) {
    }
}

// 4 different levels of visibility
// Private   - Between { } in the defining class
// private member hast the least amount of visibility
// can only be referenced inside the class in which it is defined

// Default/package private - Classes in the same package
// if no access modifier is used , it is considered default or package private
// it means it can be referenced in all the classes in the same package
// in which the method is defined

// Protected - Default and subclasses
// it is less protected or more visible then default
// a protected method can be accessed from classes in the same package
// and all the subclasses that can maybe in other packages

// Public    - Everywhere
// a public method can be invoked anywhere an object or reference can be found

// main class that uses 3 other classes defining 2 packages
// main method has 3 print methods calls
// print method defined in class Main
// print method defined in ClassA
// print method defined in ClassB

class Main_oefb001 {
    private String message_oefb001 = "hello";

    public static void main(String[] args) {
        new Main_oefb001().print_oefb001();
        new ClassA_oefb001().print_oefb001();
        // 3x_methods.package1.ClassA_oefb001; cannot be accessed from outside package
        // ClassA print -> default -> public
        new ClassB_oefb001().print_oefb001();
    }

    private void print_oefb001(){
        System.out.println(message_oefb001);
    }
} // output
  //   hello
  //   World!
  //   World!