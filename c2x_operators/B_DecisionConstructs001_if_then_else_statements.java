package c2x_operators;

public class B_DecisionConstructs001_if_then_else_statements {

    public static void main(String[] args) {
//        Oef001();
//        Oef002();
        Oef003();
    }
// decision contruct to change the flow
// conditional execution of code blocks
// if ()
//   {}
//   else {}

// then block can not be ommitted
// then block can be empty {}



    static void Oef001(){
        int score = 65;
        if (score >= 60){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
    // output
    // Pass

    static void Oef002(){
        boolean x = false;
        if (x = false){
            System.out.println("False");
        }else{
            System.out.println("True");
        }
    }
    // if condition is an assigment , not an comparison
    // if (false) -> else block
    // output
    // True

    static void Oef003(){
        int score = 4;
        String message;
        if (score >= 4){
            message = "Good job!";
        }else if (score < 4){
            message = "Decent job.";
        }
//        System.out.println(message);
    }
    // output
    // compiler error : java: variable message might not have been initialized
    // variable message is a local variable. is not inititialised
    // because of if () {} else if() {}

    // cannot be printed, reults in a compler error
}


