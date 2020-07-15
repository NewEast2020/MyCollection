package ziekenhuis;

public class SpelenMetExceptions {
    public static void main(String[] args) throws Throwable{
        Ziekenhuis hetKuchje = new Ziekenhuis();
        bezoekZiekenhuis(hetKuchje, 1800);
        bezoekZiekenhuis(hetKuchje, 1600);
        bezoekZiekenhuis(hetKuchje, 1300);
        bezoekZiekenhuis(hetKuchje, 2300);
        bezoekZiekenhuis(hetKuchje, 300);
        bezoek(hetKuchje);
    }

    static void bezoek(Ziekenhuis ziekenhuis) throws Throwable {
        bezoekNogEenKeer(ziekenhuis);
    }

    private static void bezoekNogEenKeer(Ziekenhuis ziekenhuis) throws BuitenBezoekTijdenException {
        bezoekNogMaarEenKeer(ziekenhuis);
    }

    private static void bezoekNogMaarEenKeer(Ziekenhuis ziekenhuis) throws ExtremeBuitenBezoekTijdenException, BuitenBezoekTijdenException {
        ziekenhuis.bezoeken(300);
    }

    static void bezoekZiekenhuis(Ziekenhuis ziekenhuis, int bezoektijd) {
        try {
            ziekenhuis.bezoeken(bezoektijd);
            System.out.println("Ik ga naar binnen");
        } catch (ExtremeBuitenBezoekTijdenException e) {
            System.out.println("Het is midden in de nacht. Denk dat ik maar ga slapen.....");
        } catch (BuitenBezoekTijdenException e) {
            System.out.println("Ziekenhuis is gesloten voor bezoek, ik probeer het later nog een keer.");
        }
    }
}

