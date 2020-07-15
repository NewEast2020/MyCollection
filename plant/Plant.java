package plant;

abstract class Plant {
    int hoogte = 70; // instantie variabele, die willen we setten bij het aanmaken van een plant!

    abstract void waterGeven();

    public void toonHoogtePlant() {
        System.out.println(this.getClass().getSimpleName() + " heeft hoogte " + hoogte);
    }

    void praatTegenPlant() {
        System.out.println("Er wordt tegen de " + getClass().getSimpleName() +
                           " gepraat en dat vindt hij fijn...");
    }
}
