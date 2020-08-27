package c2x_operators;

public class B_DecisionConstructs003_switch_vs_nested_if_else {

    public static void main(String[] args) {
//        Oef001();
        Oef002();
//        Oef003();
//        Oef004();
//        Oef005();
//        Oef006();
//        Oef007();
//        Oef008();
//        Oef009();
//        Oef010();
    }
// allow us you compare a variable with a list of literal values
// and execute code blocks selectively
// type of variable is limited to a handfull of types
// any primitive integer type, vb: byte short and int
// char
// enums
// String values


    static void Oef001(){
        Character c = 'A';
        switch(c) { // switch on a character object
            case 'A': // literal values are primitive char values
                System.out.println("Excellent job!");
                // no break statement
                // subsequent will be executed
            case 'B':
                System.out.println("Good job!");
                break;
            default:
                System.out.println("Decent job!");
        }
    }
// aloud to compare Character objects to char primitives
// due to autoboxing

// output
// Excellent job!
// Good job!

    static void Oef002(){
        int days = 0, month = 6;
        switch(month){
            case 1: case 3: case 5: case 6: case 7:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            default:
                days = 30;
        }
        System.out.println("days = " + days);
    }
    // output
    // days = 31

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


