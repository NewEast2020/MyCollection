package c70_ziekenhuis;

class Ziekenhuis {
    private int beginBezoek = 1300;
    private int eindeBezoek = 1600;
    private int eindeDag = 2300;
    private int beginDag = 500;

    void bezoeken(int bezoektijd) throws BuitenBezoekTijdenException, ExtremeBuitenBezoekTijdenException {
        if (bezoektijd >= eindeDag || bezoektijd < beginDag) { // buiten openingstijden
            System.out.println("     Kom op zeg, het is midden in de nacht. Gaat naar huis of de SH");
            throw new ExtremeBuitenBezoekTijdenException();
        }
        if  ( !(bezoektijd >= beginBezoek && bezoektijd < eindeBezoek) ) { // vanaf 1300 TOT 1600 // buiten bezoektijden
            System.out.println("     We zijn gesloten voor bezoek. Zie de site voor de bezoektijden...");
            throw new BuitenBezoekTijdenException();
        }
        System.out.println("     Welkom");
    }
}
