package c6x_Inheritance;

class DemoInheritanceMetFields1 {
    public static void main(String[] args) {
        Meubelair1 meubelairMeubilair = new Meubelair1();
        Meubelair1 meubelairTafel = new Tafel1();
        Tafel1 tafelTafel = new Tafel1();
        meubelairMeubilair.aantalPoten = 4;
        meubelairTafel.aantalPoten = 6;
        tafelTafel.aantalPoten = 10;
        System.out.println(meubelairMeubilair.aantalPoten);
        System.out.println(meubelairTafel.aantalPoten);
        System.out.println(tafelTafel.aantalPoten);

        System.out.println();
        Tafel1 tafel = new Tafel1();  // links van het type Tafel en er zit een tafel in
        Meubelair1 mTafel = tafel;   // links van het type Meubilair en er zit een tafel in.
        System.out.println(tafel.aantalPoten); // links van het type Tafel, dus het field van Tafel wordt gebruikt => dus 11
        System.out.println(mTafel.aantalPoten); // links van het type Meubilair, dus het field van Meubilair wordt gebruikt => dus 7
        // Beide orv verwijzen naar HETZELFDE object, maar het type van de orv bepaalt welk field er gebruikt wordt!!!!!!

        // met casting kan ik naar de andere variabele
        System.out.println("Nu met casten");
        System.out.println( ((Meubelair1)tafel).aantalPoten); // Er zit een tafel in en dat is Meubilair, dus casten Tafel naar Meubilair kan en mag.
        System.out.println( ((Tafel1)mTafel).aantalPoten); // Er zit een tafel in en dat is een Tafel, dus casten van Meubilair naar Tafel kan en mag.
        // Door te casten kan ik altijd bij de andere variabele met dezelfde naam in de parent of child!!
        System.out.println( ((Meubelair1)(Object)(Auto)(Object)(Meubelair1)(Meubelair1)(Tafel1)(Tafel1)(Tafel1)mTafel).aantalPoten); // Er zit een tafel in en dat is een Tafel, dus casten van Meubilair naar Tafel kan en mag.
        // ClassCastException, want een Tafel is geen Auto (we hebben het veld aantalPoten aan Auto toegevoegd om de code te laten compileren)
        // Je loog tegen mij alsof ik een kind was... => Exception
        // De compiler kijkt alleen van cast naar cast of dit kan, niet naar de keten in zijn geheel.
        // cast van Tafel direct naar Auto compileert niet, want er is geen erfrelatie. Via Object compileert het wel
        // (Auto)(Tafel) => compileert niet
    }
}
