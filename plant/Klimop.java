package plant;

class Klimop extends Plant {
    Klimop(int hoogte) {
        this.hoogte = hoogte;
        System.out.println("De klimop is aangeschaft met hoogte " + hoogte +
                           ". We hadden dus een grote kar nodig.");
    }

    void waterGeven() {
        System.out.println("De Klimop met hoogte " + hoogte +
                           " krijgt water en begint explosief te groeien.");
        hoogte += 10;
    }
    void praatTegenPlant() {
        System.out.println("De klimop vindt dit niet zo heel fijn en schrikt ervan. Je ziet hem krimpen van angst");
        hoogte--;
    }
}
