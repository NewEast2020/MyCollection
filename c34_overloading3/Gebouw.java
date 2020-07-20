package c34_overloading3;

class Gebouw {
    private final String toegangscode = "123456";
    boolean open = false;

    boolean openen(String sleutel) {
        if (toegangscode.equals(sleutel)) {
            return true;
        } // mag de else neerzetten, maar hoeft niet
        return false;
    }

    boolean openen() { // methode met dezelfde naam, maar andere parameterlijst
        return open;
    }
}
