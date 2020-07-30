package c15_3_phone;

class SpelenMetStaticMethod {
    public static void main(String[] args) {
        Dinosaurus1 returnWaarde = zetGetalOmNaarString(25);
        // zetGetalOmNaarString(25) geeft mij (een leash naar) een String terug. \
        // Die kan ik dus niet opvangen in een int
        // int returnWaarde => daar vang ik het resultaat van de aanroep van de methode in op.
    }

    public static Dinosaurus1 zetGetalOmNaarString(int getal) {
         // zichtbaarheid static/(niet Static) returntype naamVanDeMethode(argumenten) {....}
         // return "Test"; // Niet interessant
        return new Dinosaurus1();
    }

//    public static Hamburger plaatsBestelling(Bestelling bestelling, int geld) {
//        return new Hamburger();
//    }
}
