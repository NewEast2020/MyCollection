package c2x_operators;

public class B_DecisionConstructs002_ternary_operators {

    public static void main(String[] args) {
//        Oef001();
//        Oef002();
//        Oef003();
//        Oef004();
//        Oef005();
        Oef006();
    }
// nested if statements that use conditional assigned values to variables
// an distinct way to express such logic is to use a conditional expression
// with a ternary operator

    static void Oef001() {
        int score = 2;
        String comment = score >= 4 ?
                "Excellent job!" :
                score >= 3 ? "Good job!" : "Good try!";
        System.out.println(comment);
    }
    // all the possible values must be of the same type
    // of comment must be all values os String type
    // otherwise the code will not compile

    // output
    // Good try!

    static void Oef002() {
        String[] a = {"een", "twee", "drie"};
        String[] b = {"a", "b", "c"};

        boolean result = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                if (b[i] == null) {
                    result = true;
                }
            } else {
                result = a[i].equals(b[i]);
            }
        }
        System.out.println("result = " + result);
    }
    // output
    // result = false

    static void Oef003() {
        String[] a = {"een", "twee", null};
        String[] b = {"a", "b", null};

        boolean result = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                if (b[i] == null) {
                    result = true;
                }
            } else {
                result = a[i].equals(b[i]);
            }
        }
        System.out.println("result = " + result);

    }
    // output
    // result = true

    static void Oef004() {
//        String [] a = {"een","twee","drie"};
//        String [] b = {"a","b","c"};

//        String [] a = {"een","twee",null};
//        String [] b = {"a","b","c"};

//        String [] a = {"een","twee","drie"};
//        String [] b = {"a","b",null};

//        String [] a = {"een","twee","drie"};
//        String [] b = {"a","b","c"};

//        String [] a = {"een",null,"drie"};
//        String [] b = {"a",null,"c"};

        String[] a = {"een", "twee", "drie"};
        String[] b = {"a", "twee", "c"};

        boolean result = false;
        for (int i = 0; i < a.length; i++) {
            String e1 = a[i], e2 = b[i];
            result = e1 == null ?
                    e2 == null : e1.equals(e2);
        }
        System.out.println("result oef04 = " + result);
    }
    // result oef04 = false

    static void Oef005() {
//        String [] a = {"een","twee",null};
//        String [] b = {"a","b",null};

        String[] a = {"een", "twee", "drie"};
        String[] b = {"a", "b", "drie"};

        boolean result = false;
        for (int i = 0; i < a.length; i++) {
            String e1 = a[i], e2 = b[i];
            result = e1 == null ?
                    e2 == null : e1.equals(e2);
        }
        System.out.println("result oef05 = " + result);
    }
    // output
    // result oef05 = true

    static void Oef006() {
        int testScore = 99;
        String
        grade = testScore>=80?
                "Math grade is Awesome":
                testScore<=50?
                        "Failed your Math test":"passed";
        System.out.println("grade = " + grade);
    }
    // output
    // grade = Math grade is Awesome
}