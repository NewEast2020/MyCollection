package c6x_Inheritance;

abstract class AlcoholischeDrank3 extends Drank3 {
    // default abstract void drinken();
    int alcoholPercentage; // 8%
    void toonAlcoholPercentage() {
        System.out.println(this.getClass().getSimpleName() + " heeft een alcoholpercentage van " + alcoholPercentage + "%.");
    }
}
