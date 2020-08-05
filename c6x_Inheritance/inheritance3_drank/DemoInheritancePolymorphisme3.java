package c6x_Inheritance.inheritance3_drank;

class DemoInheritancePolymorphisme3 {
    public static void main(String[] args) {
        Drank3 bier = new Bier3();
        Drank3 whiskey = new Whiskey3();
        Drank3 fanta = new Fanta3();
        Drank3 cola = new Cola3();
        bier.drinken();
        whiskey.drinken();
        fanta.drinken();
        cola.drinken();

        ((Bier3)bier).alcoholPercentage = 5; // Casten naar NonAlcoholDranken had ook gemogen
        AlcoholischeDrank3 whiskey2 = (Whiskey3)whiskey;
        whiskey2.alcoholPercentage = 40;
        System.out.println(((Bier3)bier).alcoholPercentage);
        ((Bier3)bier).toonAlcoholPercentage();
        whiskey2.toonAlcoholPercentage();
    }
}
/* output
Bier drink je met grote slokken. Klok, klok... Leeg
De mensen die dit drinken, drinken dit met kleine slokken, maar David heeft aan 1 slok genoeg.
Fanta3, lekker fris op voor op een warme dag, wanneer het zonnetje schijnt.
Cola3, is het lekkerst met een ijsklontje en met prik. Zonder prik is het niet te zuipen.
5
Let op: de methode toonAlcoholPercentage gaan we nu overriden!!!!
Bier3 heeft een alcoholpercentage van 5%.
In de parent (AlcoholischeDrank staat dit veld ook:0
roep super.toonAlcoholPercentage aan
Bier3 heeft een alcoholpercentage van 0%.
--- einde methode ----
Whiskey3 heeft een alcoholpercentage van 40%.
 */