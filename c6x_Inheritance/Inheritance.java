package c6x_Inheritance;

public class Inheritance {
    public static void main(String[] args) {

    }
}
//=============
//        Inheritance met STATIC members
//        =============


class DemoInheritanceStatic {
    public static void main(String[] args) {
        Object objectParent = new Parent(); //  Dit mag een instantie van Parent past in een orv v/h type Object (Links is gelijk of groter dan rechts)

        Parent parentParent = new Parent(); // Dit mag een instantie van Parent past in een orv v/h type Parent
        Parent parentChild = new Child();
        Child childChild = new Child();
//        Child childParent = new Parent();  // Dag mag NIET, want een instantie van Parent past niet in een orv v/h type Child. Een gebouw is geen flat (een flat is een gebouw)
        // Links is kleiner dan rechts, dus compileert de code niet

        System.out.println("Static waarde van de parent class");
        System.out.println(Parent.staticWaardeVanParentClass); // De manier om static members te benaderen
        Child.staticWaardeVanParentClass = 11;
        System.out.println(Child.staticWaardeVanParentClass); // Een kind kan alles wat zijn ouder kan en heeft alles wat zijn ouder heeft.
//        System.out.println(Object.staticWaardeVanParentClass);  // Een ouder kan niet bij de members van zijn kind
//        Parent.staticWaardeVanChildClass = 30; // Parent kan NIET bij de member van zijn kinderen.

//        Object.staticMethode(); // Compileert niet om dezelfde reden. Object kan niet bij de members van zijn/haar childs
        Parent.staticMethode();
        Child.staticMethode();
        System.out.println("Wat als we deze methodes via de instanties gaan aanroepen");
        parentParent.staticMethode(); // Type: Parent  instantie: Parent
        parentChild.staticMethode();  // Type: Parent  instantie: Child
        childChild.staticMethode();   // Type: Child   instantie: Child
        // Altijd worden de static methodes van het type van de orv aangeroepen. Java kijkt dus NIET naar de instantie waarnaar verwezen wordt. Let wel dit gaat om de static members!!

//        parentParent.staticWaardeVanChildClass = 15;  // Compileert niet, want links is hij v/h type Parent en Parent kent deze member niet
//        parentChild.staticWaardeVanChildClass = 15;   // Compileert niet, want links is hij v/h type Parent en Parent kent deze member niet. Ook al zit er een instantie van Child in!!!
        childChild.staticWaardeVanChildClass = 15;    // Compileert wel, want links is hij v/h type Child en Child kent deze member.

        // Ja, kan er wel bij (parentChild.staticWaardeVanChildClass), maar dan moet ik gaan casten.
        ((Child)parentChild).staticWaardeVanChildClass = 15; // Heel erg wennen, hoe je de haakjes moet zetten. Kwestie van veel oefenen.
        System.out.println(Child.staticWaardeVanChildClass);

//        ((Child)parentParent).staticWaardeVanChildClass = 21;  // Je loog tegen mij alsof ik een kind was... => ClassCastException.
        // Links bepaalt waar je bij kunt!

        System.out.println(parentParent.getClass());
        System.out.println(parentChild.getClass());
        System.out.println(childChild.getClass().getSimpleName());

        Child child = new Child(); // links van het type Child
        Parent parent = child;  // links van het type Parent en daar past een child in
        Object object = child;
        object = parent;

    }
}

class Parent { // extends Object
    static int staticWaardeVanParentClass = 10;
    static void staticMethode() {
        System.out.println("We zitten nu in de static methode van de class Parent");
    }
}

class Child extends Parent {
    static int staticWaardeVanChildClass = 20;
    //    @Override // geen override, geen polymorphisme. Dat geldt alleen bij niet statische methodes. Daar komen we nog uitgebreid op terug.
    static void staticMethode() {
        System.out.println("We zitten nu in de static methode van de class Child");
    }
}
// 
//        ============
//        Inheritance met fields (object variabelen, niet static variabelen
//        =================

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
        System.out.println( ((Meubelair)tafel).aantalPoten); // Er zit een tafel in en dat is Meubilair, dus casten Tafel naar Meubilair kan en mag.
        System.out.println( ((Tafel)mTafel).aantalPoten); // Er zit een tafel in en dat is een Tafel, dus casten van Meubilair naar Tafel kan en mag.
        // Door te casten kan ik altijd bij de andere variabele met dezelfde naam in de parent of child!!
        System.out.println( ((Meubelair)(Object)(Auto)(Object)(Meubelair)(Meubelair)(Tafel)(Tafel)(Tafel)mTafel).aantalPoten); // Er zit een tafel in en dat is een Tafel, dus casten van Meubilair naar Tafel kan en mag.
        // ClassCastException, want een Tafel is geen Auto (we hebben het veld aantalPoten aan Auto toegevoegd om de code te laten compileren)
        // Je loog tegen mij alsof ik een kind was... => Exception
        // De compiler kijkt alleen van cast naar cast of dit kan, niet naar de keten in zijn geheel.
        // cast van Tafel direct naar Auto compileert niet, want er is geen erfrelatie. Via Object compileert het wel
        // (Auto)(Tafel) => compileert niet
    }
}

class Meubelair1 extends Object {
    int aantalPoten = 7;
}

class Tafel1 extends Meubelair1 { // is een kind van
    int aantalPoten = 11;
}

class Stoel1 extends Meubelair1 {

}

//============
//        vervolg Nu met field alleen bij Tafel (Child) // werkt hetzelfde als bij de static voorbeelden
//        =========

public class DemoInheritanceMetFields2 {
    public static void main(String[] args) {
        Meubelair meubelairMeubilair = new Meubelair();
        Meubelair meubelairTafel = new Tafel();
        Tafel tafelTafel = new Tafel();
        meubelairMeubilair.aantalPoten = 4; // Dit is het int veld van de class Meubilair
        meubelairTafel.aantalPoten = 6; // Dit is het int veld van de class Meubilair
        tafelTafel.aantalPoten = 10; // Dit is het int veld van de class Tafel
        System.out.println(meubelairMeubilair.aantalPoten);
        System.out.println(meubelairTafel.aantalPoten);
        System.out.println(tafelTafel.aantalPoten);

        System.out.println();
//        meubelairTafel.tafelOppervlakte = 105; // compiler kijkt naar links. Links van het type Meubilair en Meubilair kent dit veld niet.!!!! Dus compile error
        ((Tafel)meubelairTafel).tafelOppervlakte = 105; // maar gelukkig kunnen we er via casting ALTIJD bij!!!
        tafelTafel.tafelOppervlakte = 80;

    }
}

class Meubelair2 extends Object {
    int aantalPoten = 7;
}

class Tafel2 extends Meubelair2 { // is een kind van
    int aantalPoten = 11;
    int tafelOppervlakte = 100;
}

class Stoel2 extends Meubelair2 {
    int aantalArmleuningen;

}

//
// 
//        ==========
//abstract en final
//============

class DemoInheritanceMetComputers {
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        laptop.booten();
//        Computer server = new Computer(); // Dit compileert niet, want Computer is abstract => geen instanties, new Computer() mag dus niet!!
        Computer server = new Server();
        server.booten();
        PortableDevice tablet = new Tablet();
        tablet.booten();
        tablet.touchScreen = true;
        ((PortableDevice)laptop).touchScreen = false; // casten naar een abstracte class mag, want je mag zeggen PortableDevice device = new Laptop(); (PD is abstract)
    }
}

abstract class Computer { // Wanneer je een class abstract maakt, kun je er geen instanties meer van maken.
    int geheugenGrootte;
    void booten() { // al mijn kinderen kunnen op dezelfde manier 'booten', maar mogen dit anders invullen.
        System.out.println("De computer start op");
    }
    abstract void werkenMetDevice();  // Dit is een abstracte methode. Deze MOET bij mijn childs geimplementeerd worden.
    // In een abstracte class mogen de methodes (niet static!!!) abstract zijn, maar mogen ook concreet zijn.
//    static abstract void test(); // Dit mag niet! Of abstract of static, nooit beiden. Illegale combinatie
}

abstract class PortableDevice extends Computer {
    boolean touchScreen = true;
}

abstract class NonPortableDevice extends Computer {
    void werkenMetDevice() {
        System.out.println("Zo werk je met een NonPortableDevice");
    }
}

class Laptop extends PortableDevice {
    void werkenMetDevice() {
        System.out.println("Met een laptop ga ik heel serieus om. Hij is portable, maar als ik er mee werk, zet ik met toch even neer");
    } // Ik MOET hier de methode werkenMetDevice implementeren, want in mijn parents(Computer en PortableDevice) is de methode abstract en nog niet geïmplementeerd
    // Een child kan hetzelfde als een parent en in een NIET abstrace class komen geen abstracte methodes voor.
//    abstract void test(); abstracte methode kan NIET binnen een niet abstrace class
}

class Tablet extends PortableDevice {
    void werkenMetDevice() {
        System.out.println("Een tablet is een stuk lichter en deze kan ik bedienen terwijl ik loop. Of dat verstandig is.... Leg dat mijn kinderen maar eens uit...");
    }
}

class Server extends NonPortableDevice {
    // De methode werkenMetDevice MAG hier geïmplementeerd worden, hoeft niet, want deze is al concreet bij NonPortableDevice
}

final class Desktop extends NonPortableDevice { // final is het tegenovergesteld van abstract

}

//class MiniDesktop extends Desktop { // Dit gaat NOOIT compileren, want Desktop is final
//
//}

//class SuperString extends String { // String
//
//}

// 
//        ===========
//        Intro polymorphisme (geldt ALLEEN voor niet statische methodes!!)
//        ==========

class DemoInheritancePolymorphisme1 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(new Object());
        System.out.println(new String("tekst"));
        System.out.println(new Card("Klaveren", 4));
        System.out.println(new Card("Schoppen", 2));
    }
}

class Card{
    int waarde;
    String kleur;

    Card(String kleur, int waarde) {
        this.kleur = kleur;
        this.waarde = waarde;
    }

    @Override
    public String toString() {
        return kleur + " " + waarde;
    }
}



// 
//        ========

class DemoInheritancePolymorphisme2 {
    public static void main(String[] args) {
        Drank bier = new Bier();
        Drank whiskey = new Whiskey();
        Drank fanta = new Fanta();
        Drank cola = new Cola();
        bier.drinken();
        whiskey.drinken();
        fanta.drinken();
        cola.drinken();
    }
}

abstract class Drank1 {
    abstract void drinken(); // default
    // overriding & zichtbaarheid
    // een private methode kun je niet overriden, want die heb je alleen voor jezelf
    // private (default, wordt ook wel package private), protected, public
    // overriden methodes MOETEN dezelfde zichtbaarheid of een grotere zichtbaarheid hebben.
}

abstract class AlcoholischeDrank1 extends Drank1 {
// default
}

class Bier1 extends AlcoholischeDrank1 {
    @Override
    protected void drinken() { // protected is een grotere zichtbaarheid, dan default, dus dat mag
        System.out.println("Bier drink je met grote slokken. Klok, klok... Leeg");
    }
}

class Whiskey1 extends AlcoholischeDrank1 {
    @Override
    void drinken() {
        System.out.println("De mensen die dit drinken, drinken dit met kleine slokken, maar David heeft aan 1 slok genoeg.");
    }
}

abstract class NonAlcoholischeDrank1 extends Drank1 {
    protected void drinken() { // dit mag, want protected is groter dan default
        System.out.println(this.getClass().getSimpleName() + ", lekker fris op voor op een warme dag, wanneer het zonnetje schijnt.");
    }
}

class Cola1 extends NonAlcoholischeDrank1 {
    public void drinken() { // Doordat bij NonAlcoholisch de methode protected is gemaakt, moet deze protected of public zijn!!
        System.out.println(this.getClass().getSimpleName() + ", is het lekkerst met een ijsklontje en met prik. Zonder prik is het niet te zuipen.");
    }
}

class Fanta1 extends NonAlcoholischeDrank1 {
    // Hier is de methode gewoon protected qua zichtbaarheid
}

// 
//        ===========
//        Vervolg
//        ========

class DemoInheritancePolymorphisme3 {
    public static void main(String[] args) {
        Drank bier = new Bier();
        Drank whiskey = new Whiskey();
        Drank fanta = new Fanta();
        Drank cola = new Cola();
        bier.drinken();
        whiskey.drinken();
        fanta.drinken();
        cola.drinken();

        ((Bier)bier).alcoholPercentage = 5; // Casten naar NonAlcoholDranken had ook gemogen
        AlcoholischeDrank whiskey2 = (Whiskey)whiskey;
        whiskey2.alcoholPercentage = 40;
        System.out.println(((Bier)bier).alcoholPercentage);
        ((Bier)bier).toonAlcoholPercentage();
        whiskey2.toonAlcoholPercentage();
    }
}

abstract class Drank2 {
    abstract void drinken(); // default
    // overriding & zichtbaarheid
    // een private methode kun je niet overriden, want die heb je alleen voor jezelf
    // private (default, wordt ook wel package private), protected, public
    // overriden methodes MOETEN dezelfde zichtbaarheid of een grotere zichtbaarheid hebben.
}

abstract class AlcoholischeDrank2 extends Drank2 {
    // default abstract void drinken();
    int alcoholPercentage;
    void toonAlcoholPercentage() {
        System.out.println(this.getClass().getSimpleName() + " heeft een alcoholpercentage van " + alcoholPercentage + "%.");
    }
}

class Bier2 extends AlcoholischeDrank2 {
    @Override
    protected void drinken() { // protected is een grotere zichtbaarheid, dan default, dus dat mag
        System.out.println("Bier drink je met grote slokken. Klok, klok... Leeg");
    }
}

class Whiskey2 extends AlcoholischeDrank2 {
    @Override
    void drinken() {
        System.out.println("De mensen die dit drinken, drinken dit met kleine slokken, maar David heeft aan 1 slok genoeg.");
    }
}

abstract class NonAlcoholischeDrank2 extends Drank2 {
    int suikerPercentage;
    protected void drinken() { // dit mag, want protected is groter dan default
        System.out.println(this.getClass().getSimpleName() + ", lekker fris op voor op een warme dag, wanneer het zonnetje schijnt.");
    }
}

class Cola2 extends NonAlcoholischeDrank2 {
    public void drinken() { // Doordat bij NonAlcoholisch de methode protected is gemaakt, moet deze protected of public zijn!!
        System.out.println(this.getClass().getSimpleName() + ", is het lekkerst met een ijsklontje en met prik. Zonder prik is het niet te zuipen.");
    }
}

class Fanta2 extends NonAlcoholischeDrank2 {
    // Hier is de methode gewoon protected qua zichtbaarheid
}

//
//===============
//        Vervolg
//        ==========

class DemoInheritancePolymorphisme4 {
    public static void main(String[] args) {
        Drank whiskey = new Whiskey();
        Drank fanta = new Fanta();
        Drank cola = new Cola();
        whiskey.drinken();
        fanta.drinken();
        cola.drinken();

        AlcoholischeDrank whiskey2 = (Whiskey)whiskey;
        whiskey2.alcoholPercentage = 40;
        whiskey2.toonAlcoholPercentage();

        Drank bier = new Bier();
        bier.drinken();
        System.out.println();
        // veld alcoholpercentage is nu dubbel. DUS: kijk naar het type van links (of naar de Cast, dat heeft hetzelfde effect
        ((AlcoholischeDrank)bier).alcoholPercentage = 8;  // links AlcoholischeDrank, dus int veld van class AlcoholischeDrank
        System.out.println("int veld bij Alc Drank: " + ((AlcoholischeDrank)bier).alcoholPercentage);
        ((Bier)bier).alcoholPercentage = 5; // links Bier, dus int veld van class Bier
        System.out.println("int veld bij Bier     : " + ((Bier)bier).alcoholPercentage);
        ((AlcoholischeDrank)bier).toonAlcoholPercentage();  // hier treedt polymorphisme op, want links Alc.Drank, maar gedrag is overriden, dus methode van Bier uitvoeren.
        ((Bier)bier).toonAlcoholPercentage();
//        bier.toonAlcoholPercentage(); // Zo kom ik er niet bij want we verwijzen naar de instantie van bier vanuit een orv van het type Drank en deze kent die methode niet.
    }
}

abstract class Drank3 {
    abstract void drinken(); // default
    // overriding & zichtbaarheid
    // een private methode kun je niet overriden, want die heb je alleen voor jezelf
    // private (default, wordt ook wel package private), protected, public
    // overriden methodes MOETEN dezelfde zichtbaarheid of een grotere zichtbaarheid hebben.
}

abstract class AlcoholischeDrank3 extends Drank3 {
    // default abstract void drinken();
    int alcoholPercentage; // 8%
    void toonAlcoholPercentage() {
        System.out.println(this.getClass().getSimpleName() + " heeft een alcoholpercentage van " + alcoholPercentage + "%.");
    }
}

class Bier3 extends AlcoholischeDrank3 {
    int alcoholPercentage; // 5%
    @Override
    protected void drinken() { // protected is een grotere zichtbaarheid, dan default, dus dat mag
        System.out.println("Bier drink je met grote slokken. Klok, klok... Leeg");
    }
    void toonAlcoholPercentage() {
        System.out.println("Let op: de methode toonAlcoholPercentage gaan we nu overriden!!!!");
        System.out.println(this.getClass().getSimpleName() + " heeft een alcoholpercentage van " + alcoholPercentage + "%."); // veld dat het dichtsbij is.
        System.out.println("In de parent (AlcoholischeDrank staat dit veld ook:" + super.alcoholPercentage);
        System.out.println("roep super.toonAlcoholPercentage aan");
        super.toonAlcoholPercentage();
        System.out.println("--- einde methode ----");
    }
}

class Whiskey3 extends AlcoholischeDrank3 {
    @Override
    void drinken() {
        System.out.println("De mensen die dit drinken, drinken dit met kleine slokken, maar David heeft aan 1 slok genoeg.");
    }
}

abstract class NonAlcoholischeDrank3 extends Drank3 {
    int suikerPercentage;
    protected void drinken() { // dit mag, want protected is groter dan default
        System.out.println(this.getClass().getSimpleName() + ", lekker fris op voor op een warme dag, wanneer het zonnetje schijnt.");
    }
}

class Cola3 extends NonAlcoholischeDrank3 {
    public void drinken() { // Doordat bij NonAlcoholisch de methode protected is gemaakt, moet deze protected of public zijn!!
        System.out.println(this.getClass().getSimpleName() + ", is het lekkerst met een ijsklontje en met prik. Zonder prik is het niet te zuipen.");
    }
}

class Fanta3 extends NonAlcoholischeDrank3 {
    // Hier is de methode gewoon protected qua zichtbaarheid
}
// 
//        =======
//        instanceof (niet te gebruiken in de switch, want dit levert een boolean op)
//        =========

class DemoInheritancePolymorphisme5 {
    public static void main(String[] args) {
        Drank whiskey = new Whiskey();
        Drank fanta = new Fanta();
        Drank cola = new Cola();
        List<Drank> drankLijst = geefDrankLijst();
        for (Drank drank : drankLijst) {
            System.out.println(drank.getClass());
//            if (drank instanceof Bier) { // past dit object in een orv van het type Bier
//                System.out.println("biertje!");
//            }
//            if (drank instanceof AlcoholischeDrank) { // past dit in AlcoholischeDrank
//                System.out.println("Drank bevat alcohol");
//            }
//            if (drank instanceof NonAlcoholischeDrank) {
//                System.out.println("Frisje");
//            }
//            if (drank instanceof Cola) {
//                System.out.println("En een cola...");
//            }
//            if (drank instanceof Drank) {
//                System.out.println("Drank!");
//            }

            if (drank instanceof AlcoholischeDrank) {
                System.out.println("Alcohol percentage: " + ((AlcoholischeDrank)drank).alcoholPercentage);
            } else if (drank instanceof NonAlcoholischeDrank) {
                System.out.println("Suikerpercentage:   " + ((NonAlcoholischeDrank)drank).suikerPercentage);
            } else {
                System.out.println("Valt buiten de alcoholische en non alcoholische dranken"); // binnen ons model kan dit op dit moment NIET voorkomen.
            }
        }
    }

    private static List<Drank> geefDrankLijst() {
        List<Drank> drankjes = new ArrayList<>();
        drankjes.add(new Bier());
        drankjes.add(new Whiskey());
        drankjes.add(new Cola());
        drankjes.add(new Fanta());
        drankjes.add(new Bier());
        drankjes.add(new Bier());
        drankjes.add(new Bier());
        drankjes.add(new Bier());
        return drankjes;
    }
}

abstract class Drank4 {
    abstract void drinken(); // default
}

abstract class AlcoholischeDrank4 extends Drank4 {
    int alcoholPercentage = 10;
}

class Bier4 extends AlcoholischeDrank4 {
    protected void drinken() { // protected is een grotere zichtbaarheid, dan default, dus dat mag
        System.out.println("Bier drink je met grote slokken. Klok, klok... Leeg");
    }
}

class Whiskey4 extends AlcoholischeDrank4 {
    @Override
    void drinken() {
        System.out.println("De mensen die dit drinken, drinken dit met kleine slokken, maar David heeft aan 1 slok genoeg.");
    }
}

abstract class NonAlcoholischeDrank4 extends Drank4 {
    int suikerPercentage = 30;
    protected void drinken() { // dit mag, want protected is groter dan default
        System.out.println(this.getClass().getSimpleName() + ", lekker fris op voor op een warme dag, wanneer het zonnetje schijnt.");
    }
}

class Cola4 extends NonAlcoholischeDrank4 {
    public void drinken() { // Doordat bij NonAlcoholisch de methode protected is gemaakt, moet deze protected of public zijn!!
        System.out.println(this.getClass().getSimpleName() + ", is het lekkerst met een ijsklontje en met prik. Zonder prik is het niet te zuipen.");
    }
}

class Fanta4 extends NonAlcoholischeDrank4 {
    // Hier is de methode gewoon protected qua zichtbaarheid
}


