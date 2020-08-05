package c6x_Inheritance.inheritance2;

abstract class AlcoholischeDrank2 extends Drank2 {
    // default abstract void drinken();
    int alcoholPercentage;
    void toonAlcoholPercentage() {
        System.out.println(this.getClass().getSimpleName() + " heeft een alcoholpercentage van " + alcoholPercentage + "%.");
    }
}
