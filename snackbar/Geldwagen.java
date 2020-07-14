package snackbar;

class Geldwagen { // gaat geld veiligstellen
    Bank bank = new Bank();
    int geldVoorraad;

    void omzetOphalen(iContant cashDing) {
        geldVoorraad += cashDing.leegschudden();
        System.out.println("In de geldwagen zit nu het bedrag wat we hebben opgehaald : " + geldVoorraad);
        bank.kluisHoogte += geldVoorraad;
        geldVoorraad = 0;
    }

    public Bank getBank() {
        return bank;
    }
}
