package c24_3_operators3;

class Operators {
    public static void main(String[] args) {
        arithmeticOperators242();
        relationalOperators243();
        logicalOperators244();
        operatorPrecedence245();
    }

    private static void arithmeticOperators242() {
        System.out.println("arithmeticOperators242()");
        int a = 10; // probeer deze ook eens als double uit
        a *= 2;  // a = a * 2 (is hetzelfde als)
        System.out.println("a = " + a);
        a *= 2;  // a = a * 2
        System.out.println("a = " + a);

        System.out.println("7 / 2 = " + 7 / 2);
        System.out.println("7 % 2 = " + 7 % 2);
        System.out.println();
    }

    private static void relationalOperators243() {
        System.out.println("relationalOperators243()");
        System.out.println("5 != 5 " + (5 != 5));
        System.out.println();
    }

    private static void logicalOperators244() {
        System.out.println("logicalOperators244()");
        int a;
        System.out.println("4 < 6 || 6 > 3: " +  (4 < 6 || 6 > 3)); // in dit geval stopt Java na het vergelijken van 4 met 6
        a = 10;
        int b = 12;
        System.out.println("a < b || ++a < b: " + (a < b || ++a < b)); // vergelijk 10 met 12
        System.out.println("a = " + a);
        // Nu zonder short-circuit
        System.out.println("a < b | a++ > b: " + (a < b | a++ > b)); // vergelijk 10 met 12
        System.out.println("a = " + a);

        System.out.println("true || false: + " + (true || false)); // true
        System.out.println("false || true: " + (false || true)); // true
        System.out.println("true || true: " + (true || true));  // true
        System.out.println("false || false: " + (false || false));// false

        System.out.println("true && false: " + (true && false)); // false
        System.out.println("true && false: " + (true && false)); // false
        System.out.println("true && false: " + (true && false));  // true
        System.out.println("true && false: " + (true && false));// false
        System.out.println();
    }

    private static void operatorPrecedence245() {
        System.out.println("operatorPrecedence245()");
        int a;
        int b;

        a = 10;
        b = 20;
        int c = a+++b; // a++ + b : Zo interpreteert Java de a+++b
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        // Nu is a 11 en b is 20.
        c = a+ ++b; // a = 11 b = 21 c = 32
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        // Nu is a 12, b 21

        a = 10;
        b = 20;
        c = a+ + +b; // (+b) -> unary, waardoor deze waarde int wordt (te vergelijken met casten naar een int)
        // Dan hou je over a+ +b => (+b) -> unary
        // Dan hou je over a+ b => 30
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        System.out.println();
    }
}

/* output
arithmeticOperators242()
a = 20
a = 40
7 / 2 = 3
7 % 2 = 1

relationalOperators243()
5 != 5 false

logicalOperators244()
4 < 6 || 6 > 3: true
a < b || ++a < b: true
a = 10
a < b | a++ > b: true
a = 11
true || false: + true
false || true: true
true || true: true
false || false: false
true && false: false
true && false: false
true && false: false
true && false: false

operatorPrecedence245()
a = 11 b = 20 c = 30
a = 11 b = 21 c = 32
a = 10 b = 20 c = 30
 */