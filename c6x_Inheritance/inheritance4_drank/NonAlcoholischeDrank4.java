package c6x_Inheritance.inheritance4_drank;

public abstract class NonAlcoholischeDrank4 extends Drank4 {
    public int suikerPercentage = 30;
    protected void drinken() { // dit mag, want protected is groter dan default
        System.out.println(this.getClass().getSimpleName() + ", lekker fris op voor op een warme dag, wanneer het zonnetje schijnt.");
    }
}
