package c6x_Inheritance;

class DemoInheritancePolymorphisme2 {
    public static void main(String[] args) {
        Drank2 bier = new Bier2();
        Drank2 whiskey = new Whiskey2();
        Drank2 fanta = new Fanta2();
        Drank2 cola = new Cola2();
        bier.drinken();
        whiskey.drinken();
        fanta.drinken();
        cola.drinken();
    }
}
