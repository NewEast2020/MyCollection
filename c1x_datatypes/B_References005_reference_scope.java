package c1x_datatypes;

class Main {
    int a = 123;
    public static void main(String[] args) {
        Main m = new Main();
        m.print();
        m.print1(234);
        m.print();
    }
// every data goto a life cycle
// variable name start to exist when it is created
// variable scope defines where in the program the variable is available for reference
// the definition of variable a exist in 2 differnt scopes
// once in the Main class as instance variable
// the other in the print1 method as an input parameter
// use 2 print methods to print variable a

    public void print(){
        System.out.println(a);
    }

    public void print1(int a){
        System.out.println(a);
        a = 345;
    }
}
// output
// 123
// 234
// 123


class Main2 {
    // instance variable must be initialized before referenced
    // by oonstructors
    // by initializer blocks

    public Integer a;

    public Main2(){
        a = 3;
        System.out.println("constructor: "+a);
    }

    {
        a = 2;
        System.out.println("initializer: "+a);
    }

    public static void main(String[] args) {
        System.out.println(new Main2().a);
    }
}
// output
// initializer: 2
// constructor: 3
// 3

class Main3 {
    public static void main(String[] args) {
        Main3 a = new Main3();
        Main3 b = a;
        System.out.println("a:"+a);
        a = null;
        System.out.println("b:"+b);
        b = null;

        System.gc();
        System.out.println("end of main()");
    }

    public void finalize(){
        System.out.println("Bye from: "+this);
    }
}
// try
// a: Main3.main@hex
// b: Main3.main@hex
// end of main()
// Bye from:

// real output
// a:c2x_datatypes.Main3@1540e19d
// b:c2x_datatypes.Main3@1540e19d
// end of main()
// Bye from: c2x_datatypes.Main3@1540e19d

class Main4 {
    public static void main(String[] args) {
        Main4 a = new Main4();
        Main4 b = a;
        System.out.println("a:"+a);
        a = null;
        System.out.println("b:"+b);
//        b = null;

        System.gc();
        System.out.println("end of main()");
    }

    public void finalize(){
        System.out.println("Bye from: "+this);
    }
}

// real output
// a:c2x_datatypes.Main4@1540e19d
// b:c2x_datatypes.Main4@1540e19d
// end of main()
// geen bye !!
public class B_References005_reference_scope {

    public static void main(String[] args) {
        Oef001();
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
    static void Oef001(){

    }
    static void Oef002(){

    }
    static void Oef003(){

    }
    static void Oef004(){

    }
    static void Oef005(){

    }
    static void Oef006(){

    }
    static void Oef007(){

    }
    static void Oef008(){

    }
    static void Oef009(){

    }
    static void Oef010(){

    }
}


