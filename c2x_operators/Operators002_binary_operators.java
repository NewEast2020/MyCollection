package c2x_operators;

public class Operators002_binary_operators {

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

    // binary opertors perform arithmethic, relational and logical operations
    // <<
    // >>
    // >>>
    // three operators are bit shift operators
    // they are unique
    // they are only applicable to ineger types
    // directly manipulates the underlying bit patterns of integers

     // the right shift operators has 2 variations
     // arithmetic shift
     // logic shift

    static void Oef001(){
        System.out.println("1 << 1: " + (1 << 1));
        System.out.println("-1 << 1: " + (-1 << 1));
        System.out.println("4 >> 1: " + (4 >> 1));
        System.out.println("-4 >> 1: " + (-4 >> 1));
        System.out.println("1 >> 1: " + (1 >> 1));
        System.out.println("-4 >>> 1 :" + (-4 >>> 1));
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


