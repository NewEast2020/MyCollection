package c15_3_phone;

class Screen {
    static void mijnMethode() {
//        System.out.println(staticGetal); // Hij kent deze variabele niet, want deze variabele is NIET gedeclareerd binnen de class Screen
        System.out.println("aanroep static void methode: " + Phone2.staticGetal); // Wel gemaakt in de class Phone, dus via Phone. kan ik bij alle static variabelen
    }
}
