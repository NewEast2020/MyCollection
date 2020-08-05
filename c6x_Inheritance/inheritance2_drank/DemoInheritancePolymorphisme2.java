package c6x_Inheritance.inheritance2_drank;

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
/* output
Bier drink je met grote slokken. Klok, klok... Leeg
De mensen die dit drinken, drinken dit met kleine slokken, maar David heeft aan 1 slok genoeg.
Fanta2, lekker fris op voor op een warme dag, wanneer het zonnetje schijnt.
Cola2, is het lekkerst met een ijsklontje en met prik. Zonder prik is het niet te zuipen.
 */