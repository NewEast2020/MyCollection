package c34_overloading4;

public class Overloading4 {
    public static void main(String[] args) {
        Gebouw westVleugel = new Gebouw();
        westVleugel.openen(); //
        westVleugel.openen("Tekst"); //
        westVleugel.openen(12);
        westVleugel.openen(new Dinosaurus());
        westVleugel.openen(12.4);
    }
}

class Gebouw {
    void openen(String sleutel) {
        System.out.println("1.Overloaded methode met String argument: " + sleutel);
    }

    public void openen() { // methode met dezelfde naam, maar andere parameterlijst
        System.out.println("2.Overloaded methode zonder argument");
    }

    void openen(int waarde) {
        System.out.println("3.Overloaded methode met int argument: " + waarde);
    }
    //    void openen(int getal){} // de naam van de parameter heeft natuurlijk geen invloed, alleen het type!!
    //    boolean openen(int waarde) { // compileert niet, want er is al een methode met dezelfde parameters en naam
    //        System.out.println("Overloaded methode boolean returntype met int argument: " + waarde);
    //        return true;
    //    }
    static void openen(double waarde) {
        System.out.println("4.Overloaded methode met double argument: " + waarde);
    }

    void openen(Dinosaurus dino) {
        System.out.println("5.Overloaded methode met Dinosaurus als argument: " + dino);
    }
}
class Dinosaurus{
}
/*  output
2.Overloaded methode zonder argument
1.Overloaded methode met String argument: Tekst
3.Overloaded methode met int argument: 12
5.Overloaded methode met Dinosaurus als argument: c34_overloading4.Dinosaurus@28d93b30
4.Overloaded methode met double argument: 12.4
 */