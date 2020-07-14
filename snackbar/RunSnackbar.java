package snackbar;

class RunSnackbar {
    Kassa kassa = new Kassa();
    Bank mijnBankRekening;

    public void openen() {
        System.out.println("We zijn open!!");
        Bestelling bestelling = new Bestelling();
        bestelling.snacks.add(new Kroket());
        bestelling.snacks.add(new Frikandel());
        bestelling.snacks.add(new Kroket());
        bestelling.afleveren(kassa);
        printKassaInhoud();
        geldwagenKomtLangs();
        mijnRekeningChecken();
    }

    private void mijnRekeningChecken() {
        System.out.println("In mijn kluis in de bank zit : " + mijnBankRekening.kluisHoogte);
    }

    private void geldwagenKomtLangs() {
        Geldwagen gw = new Geldwagen();
        gw.omzetOphalen(kassa);
        System.out.println("De geldwagen is langs geweest!");
        System.out.println("Inhoud van de kassa : " + kassa.omzet);
        System.out.println("In de geldwagen     : " + gw.geldVoorraad);
        mijnBankRekening = gw.getBank();
    }

    private void printKassaInhoud() {
        System.out.println("In de kassa zit de volgende omzet: " + kassa.omzet);
    }
}
