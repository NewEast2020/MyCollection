package plant;

class Fuchsia extends Plant {
    // Fuchsia erft de instantie variabele int hoogte
    Fuchsia(int hoogte) { // Dit is een lokale methode variabele. Scoped gedurende de methode en NIET daarbuiten
        this.hoogte = hoogte; // de instantie variabele hoogte (this.hoogte) krijgt de waarde van de meegegeven variabele hoogte
        System.out.println("We hebben een Fuchsia gekocht met hoogte " + this.hoogte);
    }

    void waterGeven() {
        System.out.println("De Fuchsia krijgt water en ik zie hem groeien.");
        hoogte = hoogte + 1; // hoogte += 1; hoogte++;
    }
}
