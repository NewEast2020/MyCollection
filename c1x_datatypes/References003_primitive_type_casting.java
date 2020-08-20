package c1x_datatypes;

public class References003_primitive_type_casting {

    public static void main(String[] args) {
//        Oef001();
//        Oef002();
//        Oef003();
        Oef004();
        Oef005();
 }

    static void Oef001(){
        char a = 'a';
        int b = a; // java promotes automatically narrow types to wider types
                   // ascii code value of letter a is promoted to an int of decimal value 97
                   // converting from wider type to narrow type has be done explicitly with type casting
                   // and loss of information is possible

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
   // a = a
   // b = 97

    static void Oef002(){
//        byte b = 261;
                // ========= compile error =======
                // java: incompatible types: possible lossy conversion from int to byte
                // error :  required type : byte
                //          provided type : int
//        System.out.println(b);
//        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(261)); // output: 100000101
    }

    static void Oef003(){
        byte b = (byte) 261;
                 // 261 is an int and cannot assigned to a byte
                 // cannot go from wider type to a narrow type
                 //
        System.out.println("b = " + b);
                 // byte uses only 8 bits
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(261));
    } // b = 5
      // 101
      // 100000101

    static void Oef004() {
        int a = (int) 12.3; // int can not store fractional part
                            // lost fractional part in the type casting
                            // example of information loss due to type casting
        System.out.println("a = " + a);
    } // a = 12

    static void Oef005(){
//        int a = (int)true;       // java: incompatible types: boolean cannot be converted to int
                  // try to cast a boolean into an int
                  // boolean is not aloud in type casting at all !!!
                  // boolean is incompatible with any other primitive types
//        boolean b = (boolean)1;  // java: incompatible types: int cannot be converted to boolean
                  // try to cast an int into a boolean
//        System.out.println(a+b); // java: bad operand types for binary operator '+'
//                                 //       first type:  int
//                                 //       second type: boolean
    }

// what is th tak away here ?
// 1. we are aloud to convert between primitive types
// 2. when we use type casting we may loose information in the process
// 3. we must keep this in mind
// 4.
}


