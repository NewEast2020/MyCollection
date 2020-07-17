package c61_plant;

public class SpelenInheritance {
    public static void main(String[] args) {
        Plant fuchsia = new Fuchsia(20);
        Plant klimop = new Klimop(50);

        fuchsia.toonHoogtePlant();
        klimop.toonHoogtePlant();

        fuchsia.waterGeven();
        klimop.waterGeven();

        fuchsia.toonHoogtePlant();
        klimop.toonHoogtePlant();

        fuchsia.praatTegenPlant();
        klimop.praatTegenPlant();

        fuchsia.toonHoogtePlant();
        klimop.toonHoogtePlant();
    }
}
/*
We hebben een Fuchsia gekocht met hoogte 20
De klimop is aangeschaft met hoogte 50. We hadden dus een grote kar nodig.
Fuchsia heeft hoogte 20
Klimop heeft hoogte 50
De Fuchsia krijgt water en ik zie hem groeien.
De Klimop met hoogte 50 krijgt water en begint explosief te groeien.
Fuchsia heeft hoogte 21
Klimop heeft hoogte 60
Er wordt tegen de Fuchsia gepraat en dat vindt hij fijn...
De klimop vindt dit niet zo heel fijn en schrikt ervan. Je ziet hem krimpen van angst
Fuchsia heeft hoogte 21
Klimop heeft hoogte 59
 */
