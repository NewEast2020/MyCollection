package c34_overloading5;

public class Overloading5 {
    public static void main(String[] args) {
        Gebouw westVleugel = new Gebouw();
        westVleugel.openen(12); // losse literal value van 12 wordt altijd gezien als int => int methode
        short s = 12;
        westVleugel.openen(s); // een argument van het type short => dus short methode
        westVleugel.openen(2L);
        westVleugel.openen(2.0);
//        int getal = 2L; // Dit mag ook niet, dus ook niet als argument
    }
}

class Gebouw {
    void openen(int waarde) {
        System.out.println("1.Overloaded methode met int argument: " + waarde);
    }
    void openen(short waarde) {
        System.out.println("2.Overloaded methode met short argument: " + waarde);
    }
    void openen(long waarde) {
        System.out.println("3.Overloaded methode met long argument: " + waarde);
    }
    void openen(double waarde) {
        System.out.println("4.Overloaded methode met double argument: " + waarde);
    }
}
/*
1.Overloaded methode met int argument: 12
2.Overloaded methode met short argument: 12
3.Overloaded methode met long argument: 2
4.Overloaded methode met double argument: 2.0
 */