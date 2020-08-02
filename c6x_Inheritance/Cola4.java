package c6x_Inheritance;

class Cola4 extends NonAlcoholischeDrank4 {
    public void drinken() { // Doordat bij NonAlcoholisch de methode protected is gemaakt, moet deze protected of public zijn!!
        System.out.println(this.getClass().getSimpleName() + ", is het lekkerst met een ijsklontje en met prik. Zonder prik is het niet te zuipen.");
    }
}
