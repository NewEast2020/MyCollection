package c6x_Inheritance;

abstract class NonAlcoholischeDrank3 extends Drank3 {
    int suikerPercentage;
    protected void drinken() { // dit mag, want protected is groter dan default
        System.out.println(this.getClass().getSimpleName() + ", lekker fris op voor op een warme dag, wanneer het zonnetje schijnt.");
    }
}
