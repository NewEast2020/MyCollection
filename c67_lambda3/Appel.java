package c67_lambda3;

class Appel {
    private String kleur; // private field
    private int gewicht;

    public String getKleur() { // getter
        return kleur;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public void setKleur(String kleur) { // setter
        this.kleur = kleur;
    }

    public boolean isZwaarderDan(int gewicht) {
        return this.gewicht > gewicht;
    }

    public boolean isLichterDan(int gewicht){
        return this.gewicht < gewicht;
    }

    public boolean isKleur(String kleur) {
        return this.kleur.equalsIgnoreCase(kleur);
    }

    public Appel(String kleur, int gewicht) {
        setKleur(kleur); // setter aanroepen ipv dubbele code
        setGewicht(gewicht);
    }

    @Override
    public String toString() {
        return "Mijn appel is " + getKleur() + " van kleur en weegt " + getGewicht() + " gram.";
    }
}
