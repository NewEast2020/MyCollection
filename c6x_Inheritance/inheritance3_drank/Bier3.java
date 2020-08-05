package c6x_Inheritance.inheritance3_drank;

public class Bier3 extends AlcoholischeDrank3 {
    public int alcoholPercentage; // 5%
    @Override
    public void drinken() { // protected is een grotere zichtbaarheid, dan default, dus dat mag
        System.out.println("Bier drink je met grote slokken. Klok, klok... Leeg");
    }
    public void toonAlcoholPercentage() {
        System.out.println("Let op: de methode toonAlcoholPercentage gaan we nu overriden!!!!");
        System.out.println(this.getClass().getSimpleName() + " heeft een alcoholpercentage van " + alcoholPercentage + "%."); // veld dat het dichtsbij is.
        System.out.println("In de parent (AlcoholischeDrank staat dit veld ook:" + super.alcoholPercentage);
        System.out.println("roep super.toonAlcoholPercentage aan");
        super.toonAlcoholPercentage();
        System.out.println("--- einde methode ----");
    }
}
