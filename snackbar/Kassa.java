package snackbar;

class Kassa implements iContant {
    int omzet;

    public int leegschudden() {
        System.out.println("Geld wordt opgehaald uit de kassa.");
        int tempOmzet = omzet;
        omzet = 0;
        return tempOmzet;
    }
}
