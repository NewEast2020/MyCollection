package c2x_operators;

public class Operators001_unary_operators {

    public static void main(String[] args) {
//        Oef001();
//        Oef002();
        Oef003();
    }

    // computing is about information processes
    // information is represented as data
    // we can operate on them
    // we call them operators
    // understand the functions they perform
    // and how they behave
    // specially uin the presence of other operators
    // operators can be categorized in many different ways (10 categories)
    // number of operands they can take: unary, binary, ternary operators
    // each operators and operand forms an expression
    // each operand can be a subexpression, consist of other operators and their operands

    // an expression can always be evaluated into a single value
    // by evaluating all their sub expressions

    static void Oef001(){
        int a = -42;            // unary minus operator indicates sign of de literal value
        System.out.println(+a); // unary plus operator
        System.out.println(-a); // unary minus operator negate the value
        System.out.println(a);  // prints the value stored in variable a
    }
    // -42
    //  42
    // -42

    // ~ = (tilde unary operator) bitwise complement operators
    // only applied to integer value
    // performs the function by flipping the bits of the integer
    // internally every integer value is represented by a string of bits
    // the complement of the bit pattern can be obtained by turning the zeros to ones
    // and the ones to zeros

    static void Oef002(){
        int a = 42;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(~a));
    }
    //                           101010  = last 6 bits of the pattern, leading zeros ommitted by java
    // 11111111111111111111111111010101  = complement bit pattern of 42,
    //                                     last 6 bits are flipped,
    //                                     leading zeros become one

    // 12345678901234567890123456789012 = 32

    // ! = (exclamation unary operator) unary logical not operator
    // operator negates boolean value
    // boolean type has only 2 possible values: true or false
    // opposite of true is false and
    // opposite of false is true


    // ++ = shorthand increment operator
    // -- = shorthand decrement operator
    // can only be used on variables
    // they calculated a new numerical value
    // thet assign the new value back to the variable

    static void Oef003(){
        int a = 42;
        System.out.println("a = " + a);
        System.out.println("++a = " + ++a);  // pre increment: incremented before printed
        System.out.println("a = " + a);
        System.out.println("a++ = " + a++); // post increment: printed before incremented
        System.out.println("a = " + a);
        System.out.println("--a = " + --a); // pre decrement: : decremented before printed
        System.out.println("a = " + a);
    }
    //   a = 42
    // ++a = 43
    //   a = 43
    // a++ = 43
    //   a = 44
    // --a = 43
    //   a = 43

}


