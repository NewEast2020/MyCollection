package c2x_operators;

public class B_DecisionConstructs002_ternary_operators {

    public static void main(String[] args) {
        Oef001();
//        Oef002();
//        Oef003();
//        Oef004();
//        Oef005();
//        Oef006();
//        Oef007();
//        Oef008();
//        Oef009();
//        Oef010();
//
    }
// nested if statements that use conditional assigned values to variables
// an distinct way to express such logic is to use a conditional expression
// with a ternary operator

    static void Oef001(){
        int score = 2;
        String comment = score>=4?
                "Excellent job!":
                score>=3? "Good job!":"Good try!";
        System.out.println(comment);
    }
    // all the possible values must be of the same type
    // of comment must be all values os String type
    // otherwise the code will not compile

    // output
    // Good try!

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


