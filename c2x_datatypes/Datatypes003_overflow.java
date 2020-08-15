package c2x_datatypes;

public class Datatypes003_overflow {
// Overflow : results in inaccurate representation of input
// Underflow ; results in imprecise representation of input

    public static void main(String[] args) {
//        Oef001();
//        Oef002();
        Oef003();
    }

    static void Oef001() { // example of overflow
        int max = Integer.MAX_VALUE;
        System.out.println("max = " + max);
        System.out.println('0' + Integer.toBinaryString(max));
        max = Integer.MAX_VALUE + 1; // add 1 to max
        System.out.println("max = " + max);
        System.out.println(Integer.toBinaryString(max));
    }
    // max = 2147483647
    // 01111111111111111111111111111111  0 shows it is positive number
    // max = -2147483648 // smallest number
    // 10000000000000000000000000000000

    static void Oef002() { // example of overflow
        int min = Integer.MIN_VALUE;
        System.out.println("min = " + min);
        System.out.println(Integer.toBinaryString(min));
        int too_small = min - 1;  // substract -1 to min
        System.out.println("too_small = " + too_small);
        System.out.println('0' + Integer.toBinaryString(too_small));
    }
    // min = -2147483648
    // 10000000000000000000000000000000  // 1 shows it is a negative number
    // too_small = 2147483647 // largest number
    // 01111111111111111111111111111111

    static void Oef003() { // example of underflow
        double sum = 0;
        for (int i = 0; i < 50; i++) {
            sum += 0.02; // imperfect representation of 0.02
        }
        System.out.println("sum = " + sum);
    }
    // sum = 1.0000000000000004 // close to 1.00
    // floating point representation most of the imprecise representation of quantities
    // watch for integer overflows and floating point underflows in our calculations
}


