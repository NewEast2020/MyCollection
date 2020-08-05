package c6x_Inheritance.inheritance1_drank;

class Card{
    int waarde;
    String kleur;

    Card(String kleur, int waarde) {
        this.kleur = kleur;
        this.waarde = waarde;
    }

    @Override
    public String toString() {
        return kleur + " " + waarde;
    }
}
