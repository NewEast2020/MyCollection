package c2x_operators;

public class A_Operators003_precedence_order {

    public static void main(String[] args) {
//        Oef001();
//        Oef002();
//        Oef003();
        Oef004();
    }

// While multiple operators appears in the same expression
// Java must decide the order in which to evaluate the operators
// This order is deternined by the precendence order of the operators and
// their associativities (Left to right or Right to left)
// Category = Operator = Associativities
// All operators and descending order of precendence
// operators on top are eveluated first
// operators on the botton are evaluated last
// decrement and increment operators have the highest precedence order and the
// various assigment operators have the lowest precenence order
// operators of the same precendence order appears next to each other
// mostly applied from the left to the right
// This is called left associativity
// Most operators are left associative
// Some are right associative
/*
1.unary          - var++ var-- ++var --var  +var -var ~var  Left to Right
2.multiplicative - * / %                                    Left to Right
3.addictive      - + -                                      Left to Right
4.shift          - << >> >>>                                Left to Right
5.relational     - < > <= >= instanceof                     Left to Right
6.equality       - == !=                                    Left to Right
7.bitwise logical- &  ^  |                                  Left to Right
8.logical        - &&  ||                                   Left to Right
9.ternary        - expression ? expression : expression     Right to Left
10.assignments   - += -= *= /= %= &= ^= != <<= >>= >>>=     Right to Left
 */

    static void Oef001(){
        int a = 1;
        System.out.println(3+2*++a);
    }
    // equivalent expression is : (3+(2*(++a)))
    // expression inside parenthesis are evaluated first
    // output
    // 7

    // ++a   1.unary : ++var
    // *     2.multiplication
    // +     3.addictive

    // lege output

    static void Oef002(){
        int a, b, c=1;
        System.out.println(a=b=c);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
    // only c is initialized
    // (a = (b=c))
    // 1
    // a = 1
    // b = 1
    // c = 1

    static void Oef003(){
        boolean a,c,e=true;
        a=c=e;
        int b,d,f,g=1;
        b=d=f=g;
     //   a?b:c?d:e?f:g;      // expression
     //   a?b:(c?d:(e?f:g));  // equivalent according to right associative rule
        // the three ternary operators have the same precendence order
        // the right ternary operator is evaluated first according to the right associative rule

    }
    static void Oef004(){
        System.out.println(true?1:(false?2:(true?1/0:3)));
    }
    // output : 1

    // not all subexpressions are evaluated
    // 1/0 is not evaluated, because it is unnecesary

}


