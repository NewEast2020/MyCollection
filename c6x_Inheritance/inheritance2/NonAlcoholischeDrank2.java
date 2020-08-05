package c6x_Inheritance.inheritance2;

abstract class NonAlcoholischeDrank2 extends Drank2 {
    int suikerPercentage;
    protected void drinken() { // dit mag, want protected is groter dan default
        System.out.println(this.getClass().getSimpleName() + ", lekker fris op voor op een warme dag, wanneer het zonnetje schijnt.");
    }
}
