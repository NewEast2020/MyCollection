package c24_2_operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        a = ++a + a * --a; // van links naar rechts bepalen wat er in de variabele zit
        // a = 11 + 11 * 10;
        // a = 11 + 110;
        System.out.println("a = " + a);
    }
}
/*
a = 121
 */