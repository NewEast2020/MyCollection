package c23_2_object_reference_variables;

public class VerschilPrimitivesObjecten {

    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = test1;
        test1.getal = 10;
        test2.getal = 20;
        System.out.println("test1.getal = " + test1.getal); // Er komt toch echt 20 te staan.

        // Bij primitives werkt dit (natuurlijk) anders
        int getal1 = 10; // getal1 wordt 10
        int getal2 = getal1; // getal2 wordt gelijk aan getal1, dus 10
        getal1 = 50;        // nu wordt getal1 gelijk aan 50
        System.out.println("getal2 = " + getal2); // maar getal2 is gewoon nog 10
    }
}

class Test {
    int getal;
}

/*
test1.getal = 20
getal2 = 10
 */