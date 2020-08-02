package c6x_Inheritance;

class Bier2 extends AlcoholischeDrank2 {
    @Override
    protected void drinken() { // protected is een grotere zichtbaarheid, dan default, dus dat mag
        System.out.println("Bier drink je met grote slokken. Klok, klok... Leeg");
    }
}
