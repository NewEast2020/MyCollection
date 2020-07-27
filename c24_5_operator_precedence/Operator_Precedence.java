package c24_5_operator_precedence;

public class Operator_Precedence {

    public static void main(String[] args) {
        // theoretisch voorbeeld
        boolean result = toonBoolean(1, true) || toonBoolean(2, true) && toonBoolean(3, true);
        System.out.println("Result: "+ result);
        System.out.println("---------------");

        testOperatorPrecedence(); // 2-9
    }

    static boolean toonBoolean(int i, boolean b) {
        System.out.println(i + ": " + b);
        return b;
    }

    static void testOperatorPrecedence() {
        int num1 = 12;
        float num2 = 17.8f;
        boolean eJavaResult = true;
        boolean returnValue1 = num1 >= 12 && num2 < 4.567 || eJavaResult == true;
        boolean returnValue2 = (num1 >= 12 && num2 < 4.567) || eJavaResult == true;
        boolean returnValue3 = num1 >= 12 && (num2 < 4.567 || eJavaResult == false);

        System.out.println("returnValue = " + returnValue1);
        System.out.println("returnValue2 = " + returnValue2);
        System.out.println("returnValue3 = " + returnValue3);
    }
}
/* output
1: true
Result: true
---------------
returnValue = true
returnValue2 = true
returnValue3 = false
 */