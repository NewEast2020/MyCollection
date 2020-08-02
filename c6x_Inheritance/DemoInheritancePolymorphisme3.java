package c6x_Inheritance;

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
