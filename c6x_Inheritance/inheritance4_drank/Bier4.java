package c6x_Inheritance.inheritance4_drank;

public class Bier4 extends AlcoholischeDrank4 {
    protected void drinken() { // protected is een grotere zichtbaarheid, dan default, dus dat mag
        System.out.println("Bier drink je met grote slokken. Klok, klok... Leeg");
    }
}
