package c6x_Inheritance.inheritance2_drank;

class Cola2 extends NonAlcoholischeDrank2 {
    public void drinken() { // Doordat bij NonAlcoholisch de methode protected is gemaakt, moet deze protected of public zijn!!
        System.out.println(this.getClass().getSimpleName() + ", is het lekkerst met een ijsklontje en met prik. Zonder prik is het niet te zuipen.");
    }
}
