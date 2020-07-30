package c15_3_phone;

class Phone2 { // class is 1e niveau
    // class members: of methodes, of variabelen (globale variabelen)
    // Bij de methodes en variabelen heb ik twee smaakjes: static en niet static (door woord static NIET te gebruiken wordt het niet static)
    static boolean touchscreen = false; // default waarde van boolean is false!!
    boolean keypad = false;
    static int staticGetal = 10;
    int nietStaticGetal = 15;

    public static void main(String[] args) {
        System.out.println("-------------");
        toonWaarde();
        System.out.println(staticGetal);
        System.out.println(Phone2.staticGetal); // Buiten de class MOET ik de class naam gebruiken. Binnen de class MAG het.

//        System.out.println(nietStaticGetal); // Dit zal NOOIT compileren, want niet static variabelen spreek je ALTIJD aan via een instantie
        // of kun je binnen een niet static methode gebruiken.
        // Heel goed! Niet static variabelen kun je in een static methode ALLEEN via een instantie (aangemaakt object) (leash) benaderen
        Phone2 phone01 = new Phone2(); // instantie of object is hetzelfde, net als instance variabele of object variabelen of fields
        System.out.println("phone01: " + phone01.nietStaticGetal); // via de instantie prima te benaderen
        phone01.nietStaticGetal = 25;
        System.out.println("phone01: " + phone01.nietStaticGetal); // via de instantie prima te benaderen

        phone01.keypad = true;    //via de linkerkant => via de stack variabele kom ik dan op de heap. Dan ken ik de variabele keypad
        phone01.touchscreen = true;
        Phone2 phone02 = new Phone2();
        phone02.touchscreen = true;
        System.out.println("phone02: " + phone02.nietStaticGetal); // elke instantie krijgt zijn eigen niet static variabelen/methodes.

        System.out.println("static getal: " + staticGetal);
        System.out.println("static getal via phone01: " + phone01.staticGetal);
        staticGetal = 30;
        System.out.println("static getal: " + staticGetal);
        System.out.println("static getal via phone01: " + phone01.staticGetal);
        Screen.mijnMethode();
        System.out.println("-------------");
        toonWaarde(); // Hier 30

        System.out.println("aanroepen vanuit phone01");
        phone01.printWaarde();
        System.out.println("aanroepen vanuit phone02");
        phone02.printWaarde();


        touchscreen = true;
//        keypad = true;
        Phone2 phone1 = new Phone2();
        Phone2 phone2 = null;
        Phone2.touchscreen = false;
        phone1.touchscreen = true;
//        System.out.println(phone1.touchscreen);
//        System.out.println(phone2.touchscreen);
    }

    static void toonWaarde() {
        System.out.println("static toonWaarde: " + Phone2.staticGetal); // de waarde wordt bekeken op het moment dat deze methode wordt aangeroepen.
//        System.out.println(nietStaticGetal); // Static methode, dus niet static variabelen zijn NIET te bereiken.
    }

    void printWaarde() {
        System.out.println("Binnen een instance methode");
        System.out.println("Static : " + this.staticGetal); // PHone. had ook gemogen
        System.out.println("Niet Static : " + nietStaticGetal); // this.nietStaticGetal, want this is he object waar ik mee bezig ben.
        // Wat bedoel ik daarmee. Als printWaarde wordt aangeroepen vanuit phone02, dan is this de leash van phone02. Wordt deze vanuit phone01 aangeroepen
        // dan is het de leash van phone01
        System.out.println("Einde methode");
    }
}
/* output
-------------
static toonWaarde: 10
10
10
phone01: 15
phone01: 25
phone02: 15
static getal: 10
static getal via phone01: 10
static getal: 30
static getal via phone01: 30
aanroep static void methode: 30
-------------
static toonWaarde: 30
aanroepen vanuit phone01
Binnen een instance methode
Static : 30
Niet Static : 25
Einde methode
aanroepen vanuit phone02
Binnen een instance methode
Static : 30
Niet Static : 15
Einde methode

 */