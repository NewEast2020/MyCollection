package c6x_Inheritance.inheritance3_drank;

public abstract class AlcoholischeDrank3 extends Drank3 {
    // default abstract void drinken();
    public int alcoholPercentage; // 8%
    public void toonAlcoholPercentage() {
        System.out.println(this.getClass().getSimpleName() + " heeft een alcoholpercentage van " + alcoholPercentage + "%.");
    }
}
