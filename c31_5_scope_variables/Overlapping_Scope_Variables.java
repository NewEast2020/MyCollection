package c31_5_scope_variables;


public class Overlapping_Scope_Variables {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
//        testClass.vulWaarde(12);
        testClass.vulWaarde();
    } // Nu zijn ook alle instanties verdwenen (testClass)
}

