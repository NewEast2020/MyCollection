package c6x_Inheritance.inheritance1_drank;

class Bier1 extends AlcoholischeDrank1 {
    @Override
    protected void drinken() { // protected is een grotere zichtbaarheid, dan default, dus dat mag
        System.out.println("Bier drink je met grote slokken. Klok, klok... Leeg");
    }
}
