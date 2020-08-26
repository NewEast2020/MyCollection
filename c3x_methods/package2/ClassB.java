package c3x_methods.package2;

import c3x_methods.package1.ClassC;

public class ClassB extends ClassC {
    public void print(){
        super.message = "World!";
        super.print();
    }
}
