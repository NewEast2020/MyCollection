package voertuig;

class Trein extends Voertuig { // Trein is A Voertuig (trein is een voertuig
    @Override // Dit mag, maar hoeft niet.
    void voortBewegen() { // Dit noemen we overriding
        System.out.println("Trein doet tjoek tjoek");
    }
}
