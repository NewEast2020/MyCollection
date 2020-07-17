package c32_dinosaurus;

public class SpelenMetLeashes {
    public static void main(String[] args) {

        Dinosaurus t_rex = new Dinosaurus();
        System.out.println("t_rex = " + t_rex);

        // via de leash/variable kan ik onderdelen van de Dino aanspreken, bijvoorbeeld soort
        t_rex.soort = "Tyrannosaurus rex";
        System.out.println("t_rex.soort = " + t_rex.soort);


        Dinosaurus velo = new Dinosaurus();
        System.out.println("velo = " + velo);
        velo.soort = "Velociraptor";
        System.out.println("velo.soort = " + velo.soort);

        t_rex.aantalPoten = 3;
        System.out.println("t_rex.aantalPoten = " + t_rex.aantalPoten);
        System.out.println("velo.aantalPoten = " + velo.aantalPoten);

        System.out.println("Dino: " + "velo.soort: " + velo.soort + " velo.aantalPoten: " + velo.aantalPoten);
        System.out.println("Dino: " + "t_rex.soort: " + t_rex.soort + " t_rex.aantalPoten: " + t_rex.aantalPoten);

        Dinosaurus t_rex_leash2 = t_rex;  // gelijk aan int a = 5; int b = a; kopieert de inhoud van a naar b
                                          // LET OP!!! Geen kopie van het object, alleen kopie van de verwijzing
        t_rex_leash2.aantalPoten = 100;
        System.out.println("t_rex.aantalPoten = " + t_rex.aantalPoten);
        System.out.println("t_rex_leash2: " + t_rex_leash2);

        t_rex = new Dinosaurus();
        t_rex.soort = "T-rex enhanced";
        System.out.println("t_rex = " + t_rex);
        System.out.println("t_rex_leash2 = " + t_rex_leash2);
        t_rex_leash2 = null; // na regel 36 heb ik GEEN leash meer naar mijn oorspronkelijke "Tyrannosaurus rex".
        // Het object zit nog wel in het geheugen, maar is eligable for garbage collection.

        // vreemde situatie om de leashes niet op te vangen
        new Dinosaurus().maaktGeluid();  // de leash wordt NIET opgeslagen, dus deze dino is meteen uitgestorven
        new Dinosaurus().aantalPoten = 100; // de leash wordt NIET opgeslagen, dus deze dino is meteen uitgestorven
        // opvangen is: Dinosaurus dino = new ....
    }
}

