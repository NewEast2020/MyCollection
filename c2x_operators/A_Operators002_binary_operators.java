package c2x_operators;

public class A_Operators002_binary_operators {

    public static void main(String[] args) {
//        Oef001();
//        Oef002();
//        Oef003();
//        Oef004();
//        Oef005();
        Oef006();
    }

    // binary opertors perform arithmethic, relational and logical operations
    // <<
    // >>
    // >>>
    // three operators are bit shift operators
    // they are unique
    // they are only applicable to integer types
    // directly manipulates the underlying bit patterns of integers

     // the right shift operators has 2 variations
     // arithmetic shift
     // logic shift

    static void Oef001(){
        // bit shift operators
        // threat operands as bit patterns
        System.out.println("1 << 1: " + (1 << 1)); // in general << 1 : multiplication by 2
        System.out.println("-1 << 1: " + (-1 << 1));
        System.out.println("4 >> 1: " + (4 >> 1)); // in general >> 1 : division by 2
        System.out.println("-4 >> 1: " + (-4 >> 1));
        System.out.println("1 >> 1: " + (1 >> 1)); // exception
        System.out.println("-4 >>> 1 :" + (-4 >>> 1)); // exception
        System.out.println("Integer.toBinaryString(-4): " + (Integer.toBinaryString(-4)));
        System.out.println("Integer.toBinaryString(-4>>1): " + (Integer.toBinaryString(-4>>1)));
        System.out.println("Integer.toBinaryString(-4>>>1): " + (Integer.toBinaryString(-4>>>1)));
    }
    // output
    //  1 << 1: 2
    // -1 << 1: -2
    // 4 >> 1: 2
    // -4 >> 1: -2
    // 1 >> 1: 0
    // -4 >>> 1 :2147483646
    // Integer.toBinaryString(-4): 11111111111111111111111111111100
    // Integer.toBinaryString(-4>>1): 11111111111111111111111111111110
    // Integer.toBinaryString(-4>>>1): 1111111111111111111111111111110

    static void Oef002(){
        System.out.println(Integer.toBinaryString(-4));
        System.out.println(Integer.toBinaryString(-4>>1));
        System.out.println(Integer.toBinaryString(-4>>>1));
    }
    // 11111111111111111111111111111100
    // 11111111111111111111111111111110
    // 01111111111111111111111111111110

    static void Oef003(){
        System.out.println(5%3); // compute reminder of 5 divided by 3
        System.out.println(-5%-3);
        System.out.println(-5%3);
        System.out.println(5%-3);
    }
    // the sign of the result always match the sign of the numerator (teller)
    // 2
    // -2
    // -2
    // 2

    static void Oef004(){
        // bitwise logical operators works on values
        // threat operands as bit patterns
        System.out.println(1 & 2 );
        // 001 & 010 => 000
        System.out.println(1 & 3 );
        // 001 & 011 => 001
        System.out.println(1 | 3 );
        // 001 | 011 => 011
        System.out.println(1 ^ 3 );
        // 001 ^ 011 => 010
    }
    // 0
    // 1
    // 3
    // 2

    static void Oef005(){
        // bitwise logical operators also works on boolean values
        // as boolean values are represented by a single bit
        // 1 bit for true
        // 0 bit for false
        System.out.println("true  & true  : " + (true & true));
        System.out.println("true  & false : " + (true & false));
        System.out.println("false & false : " + (false & false));
        System.out.println("true  | true  : " + (true | true));
        System.out.println("true  | false : " + (true | false));
        System.out.println("false | false : " + (false | false));
    }
    // true  & true  : true
    // true  & false : false
    // false & false : false
    // true  | true  : true
    // true  | false : true
    // false | false : false

    static void Oef006(){
        // relational and or operators , boolean logic on boolean values
        // short circuit logical operators, because the operands are not always evaluated
        System.out.println(true && true);
        System.out.println(false && 1/0==1);
        System.out.println(true || false || 1/0==1);
    }
    // true
    // false
    // true
}


