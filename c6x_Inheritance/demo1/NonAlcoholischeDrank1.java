package c6x_Inheritance.demo1;

abstract class NonAlcoholischeDrank1 extends Drank1 {
    protected void drinken() { // dit mag, want protected is groter dan default
        System.out.println(this.getClass().getSimpleName() + ", lekker fris op voor op een warme dag, wanneer het zonnetje schijnt.");
    }
}
