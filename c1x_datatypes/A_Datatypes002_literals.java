package c1x_datatypes;
import java.math.BigDecimal;

// prefixes
// suffixes
// prefixes and suffixes helps to define literals

// 0x : hexadecimal prefix

public class A_Datatypes002_literals {
    public static void main(String[] args) {
//       Oef002();
//       Oef004();
//       Oef005();
//       Oef006();
//       Oef007();
        Oef008();
}

    static void Oef001(){
        int a = 0x2A; // 0x hexidecimal prefix
        System.out.println(a); // decimal
        System.out.println(Integer.toBinaryString(a)); // binary
        System.out.println(Integer.toBinaryString(42));
    }
    // output:
    // 42
    // 101010
    // 101010

    static void Oef002(){
        int a = 052; // 0 is octal prefix
        System.out.println(a);
    }
    // output:
    // 42

    static void Oef003(){
//        float a = 1.23451234512345;
//        float b = 1.23;
//        System.out.println(a);
        // =========== compiler error =============
        // java: incompatible types: possible lossy conversion from double to float
        // literal number by default is interpretated by Java as a a double floating point type !!
        // not aloud because the double is wider than the float
    }
    static void Oef004(){
        float a = 1.23451234512345f;
        float b = 1.23F;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
   // output
   // a = 1.2345123 some digits  are lost !!!
   // b = 1.23

    static void Oef005(){
        double a = 1.23451234512345;
        System.out.println("a = " + a);
    }
    // a = 1.2345123291015625
    // all digits preserved

    static void Oef006(){
        double e = 0.02;
        System.out.println(e);
        System.out.println(new BigDecimal(e)); // what is stored internally
    }
    // output
    // 0.02
    // 0.0200000000000000004163336342344337026588618755340576171875
    static void Oef007(){
        double e = 1.666656494140625;
//          double e = 1.153457935793625;

        System.out.println(e);
        System.out.println(new BigDecimal(e));
    }
    // output the same !!
    //1.666656494140625
    //1.666656494140625

    static void Oef008(){
        // different ways of defining a literal character
        char a = 'a';       // single quote notation
        char b = 97;        // acsii code
        char c = 0x03C0;    // hexdecimal
        char d = '\u03C0';  // uni code
        // char is inherently een integer type (intrinsiek onlosmakelijk verbonden)
        // java interprets char as integers
        // literal values are interpreted and stored in primitive types
        // Information loss is possible in this process
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("a + b + c + d: " + a+b+c+d);
    }
    //a = a
    //b = a
    //c = π
    //d = π
    //a + b + c + d: aaππ
}
