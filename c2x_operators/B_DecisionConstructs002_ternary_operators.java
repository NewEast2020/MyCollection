package c2x_operators;

public class B_DecisionConstructs002_ternary_operators {

    public static void main(String[] args) {
//        Oef001();
//        Oef002();
        Oef003();
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
        String [] a = {"een","twee","drie"};
        String [] b = {"a","b","c"};

        boolean result = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                if (b[i] == null) {
                    result = true;
                }
            }else{
               result = a[i].equals(b[i]);
            }
        }
        System.out.println("result = " + result);
    }
    // output
    // result = false

    static void Oef003(){
        String [] a = {"een","twee",null};
        String [] b = {"a","b",null};

        boolean result = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                if (b[i] == null) {
                    result = true;
                }
            }else{
                result = a[i].equals(b[i]);
            }
        }
        System.out.println("result = " + result);

    }
    // output
    // result = true

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


