package c6x_Inheritance.inheritance8_fields;

class DemoInheritanceMetFields2 {
    public static void main(String[] args) {
        Meubelair2 meubelairMeubilair = new Meubelair2();
        Meubelair2 meubelairTafel = new Tafel2();
        Tafel2 tafelTafel = new Tafel2();
        meubelairMeubilair.aantalPoten = 4; // Dit is het int veld van de class Meubilair
        meubelairTafel.aantalPoten = 6; // Dit is het int veld van de class Meubilair
        tafelTafel.aantalPoten = 10; // Dit is het int veld van de class Tafel
        System.out.println(meubelairMeubilair.aantalPoten);
        System.out.println(meubelairTafel.aantalPoten);
        System.out.println(tafelTafel.aantalPoten);

        System.out.println();
//        meubelairTafel.tafelOppervlakte = 105; // compiler kijkt naar links. Links van het type Meubilair en Meubilair kent dit veld niet.!!!! Dus compile error
        ((Tafel2)meubelairTafel).tafelOppervlakte = 105; // maar gelukkig kunnen we er via casting ALTIJD bij!!!
        tafelTafel.tafelOppervlakte = 80;

    }
}
