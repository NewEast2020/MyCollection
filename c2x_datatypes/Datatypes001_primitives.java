package c2x_datatypes;
// java assigns a == data type == to each and every == piece of data == ,
// including hard-coded literal values
public class Datatypes001_primitives {
    public static void main(String[] args) {
        oef003();
        oef004();
    }

    static void oef001(){
//        int waarde = 12345678901; // integer number to large
        // int 32 bits
        // java: integer number too large: 12345678901
        // 12345678901 : literal nummer
        // 12345678901 : default geinterpreteerd als een int
        // 12345678901 > 2^31 (32 bit)
        //  container waarde is int
//        System.out.println(waarde);
    } // xxxxxxxxxx compile error xxxxxxxxxxxxx

    static void oef002(){
//        long waarde = 12345678901; // integer number to large
        // long 64 bits
        // java: integer number too large: 12345678901
        // 12345678901 : literal nummer
        // 12345678901 : default geinterpreteerd als een int
        // 12345678901 > 2^31 (32 bit)
        //  container waarde is long
//        System.out.println(waarde);
    } // xxxxxxxxx compile error xxxxxxxxxxxxxx

    static void oef003(){
        long waarde = 12345678901L;
        // long 64 bits
        // compile ok
        // 12345678901 : literal nummer
        // 12345678901 : geinterpreteerd als een long
        // 12345678901 > 2^63 (64 bit)
        // container waarde is long
        System.out.println(waarde);
    }
    // output:
    // 12345678901

    static void oef004(){
        short waarde = 12;
        // literal integer 32 bits
        // container waarde 16 bits
        // compile ok
        // 12  : literal nummer
        // 12  : geinterpreteerd als een int
        // 12 fits in een short
        // container waarde is short
        System.out.println(waarde);
    }
    // output:
    // 12
}