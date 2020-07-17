package c66_voertuig;

import java.util.ArrayList;
import java.util.List;

public class SpelenMetInheritance2 {

    public static void main(String[] args) {
        Voertuig voertuig = new Voertuig();
        voertuig.voortBewegen();

        Trein trein = new Trein();
        trein.voortBewegen();

        Auto auto = new Auto(); // Een kind kan net zoveel als zijn ouder en meer
        auto.voortBewegen();
        auto.aantalWielen = 4;

        Object object = new Object();

        // object.aantalWielen = 5; // aantalWielen is op een lager niveau gedefinieerd. Object kan daar dus niet bij
        // Een parent kan niet bij de onderdelen van zijn/haar kind.

        System.out.println("auto2");
        Voertuig auto2 = new Auto();
        auto2.voortBewegen();

        // Auto test = new Voertuig(); // Dit kan niet, want een voertuig is geen auto. Een auto is een voertuig
        // links is qua verzameling groter of gelijk aan rechts Dus Voertuig auto = new Auto() is correct.

        List<Voertuig> mijnVoertuigen = new ArrayList<>();
        mijnVoertuigen.add(voertuig);
        mijnVoertuigen.add(auto);
        mijnVoertuigen.add(auto2);
        mijnVoertuigen.add(trein);

        System.out.println("Mijn wagenpark gaat bewegen");
        for (Voertuig vt : mijnVoertuigen) {
            vt.voortBewegen();
        }
    }
}
/* output
Voertuig beweegt zich voort. Dit is het algemene gedrag van een voertuig
Trein doet tjoek tjoek
De auto doet vroem vroem
auto2
De auto doet vroem vroem
Mijn wagenpark gaat bewegen
Voertuig beweegt zich voort. Dit is het algemene gedrag van een voertuig
De auto doet vroem vroem
De auto doet vroem vroem
Trein doet tjoek tjoek
 */
