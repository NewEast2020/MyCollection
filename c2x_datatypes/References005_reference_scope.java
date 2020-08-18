package c2x_datatypes;

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

public class References005_reference_scope {

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


