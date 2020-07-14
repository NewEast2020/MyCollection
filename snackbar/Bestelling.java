package snackbar;

import java.util.ArrayList;

class Bestelling {
    int totaalprijs;
    ArrayList<Snack> snacks = new ArrayList<>();

    Bestelling() {
        System.out.println("Wat wilt u bestellen?");
    }

    void afleveren(Kassa kassa) {
        berekenPrijsHoogte();
        kassa.omzet += totaalprijs;
        System.out.println("Totale kosten van de bestelling zijn: " + totaalprijs);
        System.out.println("Eet smakelijk en tot de volgende keer!");
    }

    private void berekenPrijsHoogte() {
        for (Snack sn : snacks) {
            totaalprijs += sn.prijs;
        }
    }
}
