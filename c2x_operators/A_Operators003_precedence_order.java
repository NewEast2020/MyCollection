package c2x_operators;

public class A_Operators003_precedence_order {

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
1.unary          - var++ var-- ++var --var  +var -var ~var
2.multiplicative - * / %
3.addictive      - + -
4.shift          - << >> >>>
5.relational     - < > <= >= instanceof
6.equality       - == !=
7.bitwise logical- &  ^  |
8.logical        - &&  ||
9.ternary        - expression ? expression : expression
10.assignments   - += -= *= /= %= &= ^= != <<= >>= >>>=

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


