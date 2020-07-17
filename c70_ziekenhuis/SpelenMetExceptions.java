package c70_ziekenhuis;

public class SpelenMetExceptions {
    public static void main(String[] args) throws Throwable{
        Ziekenhuis hetKuchje = new Ziekenhuis();

        System.out.println("call bezoekZiekenhuis(hetKuchje, 1800);" );
        bezoekZiekenhuis(hetKuchje, 1800);

        System.out.println("call bezoekZiekenhuis(hetKuchje, 1600);" );
        bezoekZiekenhuis(hetKuchje, 1600);

        System.out.println("call bezoekZiekenhuis(hetKuchje, 1300);" );
        bezoekZiekenhuis(hetKuchje, 1300);

        System.out.println("call bezoekZiekenhuis(hetKuchje, 2300);" );
        bezoekZiekenhuis(hetKuchje, 2300);

        System.out.println("call bezoekZiekenhuis(hetKuchje, 300);" );
        bezoekZiekenhuis(hetKuchje, 300);

        System.out.println("call bezoek(hetKuchje);" );
        bezoek(hetKuchje);
    }

    static void bezoek(Ziekenhuis ziekenhuis) throws Throwable {
        System.out.println(" === 2 bezoek : ziekenhuis = " + ziekenhuis);
        bezoekNogEenKeer(ziekenhuis);
    }

    private static void bezoekNogEenKeer(Ziekenhuis ziekenhuis) throws BuitenBezoekTijdenException {
        System.out.println(" === 3 bezoekNogEenKeer : ziekenhuis = " + ziekenhuis);
        bezoekNogMaarEenKeer(ziekenhuis);
    }

    private static void bezoekNogMaarEenKeer(Ziekenhuis ziekenhuis) throws ExtremeBuitenBezoekTijdenException, BuitenBezoekTijdenException {
        System.out.println(" === 4 bezoekNogMaarEenKeer : ziekenhuis = " + ziekenhuis);
        ziekenhuis.bezoeken(300);
    }

    static void bezoekZiekenhuis(Ziekenhuis ziekenhuis, int bezoektijd) {
        System.out.println(" === 1 bezoekZiekenhuis : ziekenhuis = " + ziekenhuis + ", bezoektijd = " + bezoektijd);
        try {
            ziekenhuis.bezoeken(bezoektijd);
            System.out.println("     Ik ga naar binnen");
        } catch (ExtremeBuitenBezoekTijdenException e) {
            System.out.println("     Het is midden in de nacht. Denk dat ik maar ga slapen.....");
        } catch (BuitenBezoekTijdenException e) {
            System.out.println("     Ziekenhuis is gesloten voor bezoek, ik probeer het later nog een keer.");
        }
    }
}
/* output
call bezoekZiekenhuis(hetKuchje, 1800);
 === 1 bezoekZiekenhuis : ziekenhuis = ziekenhuis.Ziekenhuis@28d93b30, bezoektijd = 1800
     We zijn gesloten voor bezoek. Zie de site voor de bezoektijden...
     Ziekenhuis is gesloten voor bezoek, ik probeer het later nog een keer.
call bezoekZiekenhuis(hetKuchje, 1600);
 === 1 bezoekZiekenhuis : ziekenhuis = ziekenhuis.Ziekenhuis@28d93b30, bezoektijd = 1600
     We zijn gesloten voor bezoek. Zie de site voor de bezoektijden...
     Ziekenhuis is gesloten voor bezoek, ik probeer het later nog een keer.
call bezoekZiekenhuis(hetKuchje, 1300);
 === 1 bezoekZiekenhuis : ziekenhuis = ziekenhuis.Ziekenhuis@28d93b30, bezoektijd = 1300
     Welkom
     Ik ga naar binnen
call bezoekZiekenhuis(hetKuchje, 2300);
 === 1 bezoekZiekenhuis : ziekenhuis = ziekenhuis.Ziekenhuis@28d93b30, bezoektijd = 2300
     Kom op zeg, het is midden in de nacht. Gaat naar huis of de SH
     Het is midden in de nacht. Denk dat ik maar ga slapen.....
call bezoekZiekenhuis(hetKuchje, 300);
 === 1 bezoekZiekenhuis : ziekenhuis = ziekenhuis.Ziekenhuis@28d93b30, bezoektijd = 300
     Kom op zeg, het is midden in de nacht. Gaat naar huis of de SH
     Het is midden in de nacht. Denk dat ik maar ga slapen.....
call bezoek(hetKuchje);
 === 2 bezoek : ziekenhuis = ziekenhuis.Ziekenhuis@28d93b30
 === 3 bezoekNogEenKeer : ziekenhuis = ziekenhuis.Ziekenhuis@28d93b30
 === 4 bezoekNogMaarEenKeer : ziekenhuis = ziekenhuis.Ziekenhuis@28d93b30
     Kom op zeg, het is midden in de nacht. Gaat naar huis of de SH
Exception in thread "main" ziekenhuis.ExtremeBuitenBezoekTijdenException
	at ziekenhuis.Ziekenhuis.bezoeken(Ziekenhuis.java:12)
	at ziekenhuis.SpelenMetExceptions.bezoekNogMaarEenKeer(SpelenMetExceptions.java:38)
	at ziekenhuis.SpelenMetExceptions.bezoekNogEenKeer(SpelenMetExceptions.java:33)
	at ziekenhuis.SpelenMetExceptions.bezoek(SpelenMetExceptions.java:28)
	at ziekenhuis.SpelenMetExceptions.main(SpelenMetExceptions.java:23)
 */
