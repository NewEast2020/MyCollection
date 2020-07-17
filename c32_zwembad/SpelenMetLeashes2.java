/*
class Zwembad
	int aantalBaden
	String naamBad

●	Maak class Zwembad & class SpelenMetZwembaden (of zo)
●	Maak 2 zwembaden aan met de naam
    ○	“Merwestein”
    ○	“Dompelaar”
●	Toon de namen van de beide zwembaden op het scherm
●	Toon de leashes van de beide zwembaden op het scherm
●	Maak een derde object reference variabele aan van het type Zwembad en
    laat deze verwijzen naar het Zwembad met de naam “Merwestein”
    ○	Pas de naam van het zwembad aan via de nieuwe orv (object reference variabele)
    ○	Toon de nieuwe naam van het zwembad via de originele orv
* */

package c32_zwembad;
public class SpelenMetLeashes2 {
    public static void main(String[] args) { // standard main
        // besturing v/d zwembaden
        System.out.println("Start van mijn zwembaden programma");

        // Twee zwembaden aangemaakt
        Zwembad zwembad1 = new Zwembad(); // Type naamVariabel = new Instantie van die class
        Zwembad zwembad2 = new Zwembad();

        // de leashes van beide zwembaden geprint.
        System.out.println(zwembad1);
        System.out.println(zwembad2);

        // zwembaden krijgen een naam
        // De object refence variabele zijn zwembad1 & zwembad2
        // Dat is de ingang/sleutel/leash van het object
        zwembad1.naamZwembad = "Merwestein";
        zwembad2.naamZwembad = "Dompelaar";

        // printen van de namen van de zwembaden
        System.out.println("Nieuwe naam zwembad = " + zwembad1.naamZwembad);
        System.out.println("Nieuwe naam zwembad = " + zwembad2.naamZwembad);

        // Derde object reference variabele die verwijst naar het 1e zwembad
        Zwembad piet = zwembad1;
        // naam van het zwembad via piet aanpassen
        piet.naamZwembad = "Happy water";
        // printen via originele orv (object reference variabele)
        System.out.println("Nieuwe Naam Zwembad = " + zwembad1.naamZwembad);
    }
}

