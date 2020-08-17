package c2x_datatypes;

public class References003_primitive_type_casting {

    public static void main(String[] args) {
//        Oef001();
//        Oef002();
        Oef003();
        Oef004();
        Oef005();
        Oef006();
        Oef007();
        Oef008();
        Oef009();
        Oef010();
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


