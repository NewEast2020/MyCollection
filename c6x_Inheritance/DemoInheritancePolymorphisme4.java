package c6x_Inheritance;

import c6x_Inheritance.demo3.*;
import c6x_Inheritance.demo2.*;


class DemoInheritancePolymorphisme4 {
    public static void main(String[] args) {
        Drank3 whiskey = new Whiskey3();
        Drank3 fanta = new Fanta3();
        Drank4 cola = new Cola4();
        whiskey.drinken();
        fanta.drinken();
        cola.drinken();

        AlcoholischeDrank3 whiskey2 = (Whiskey3)whiskey;
        whiskey2.alcoholPercentage = 40;
        whiskey2.toonAlcoholPercentage();

        Drank3 bier = new Bier3();
        bier.drinken();
        System.out.println();
        // veld alcoholpercentage is nu dubbel. DUS: kijk naar het type van links (of naar de Cast, dat heeft hetzelfde effect
        ((AlcoholischeDrank3)bier).alcoholPercentage = 8;  // links AlcoholischeDrank, dus int veld van class AlcoholischeDrank
        System.out.println("int veld bij Alc Drank: " + ((AlcoholischeDrank3)bier).alcoholPercentage);
        ((Bier3)bier).alcoholPercentage = 5; // links Bier, dus int veld van class Bier
        System.out.println("int veld bij Bier     : " + ((Bier3)bier).alcoholPercentage);
        ((AlcoholischeDrank3)bier).toonAlcoholPercentage();  // hier treedt polymorphisme op, want links Alc.Drank, maar gedrag is overriden, dus methode van Bier uitvoeren.
        ((Bier3)bier).toonAlcoholPercentage();
//        bier.toonAlcoholPercentage(); // Zo kom ik er niet bij want we verwijzen naar de instantie van bier vanuit een orv van het type Drank en deze kent die methode niet.
    }
}
