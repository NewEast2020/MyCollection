package c31_5_scope_variables;

class TestClass {
    int waarde = 15;  // instance variabele is een globale variabele
                      // gedeclareerd binnen de class, maar buiten de methode

    void vulWaarde(int waarde) { // methode variabele (is ook lokaal) => shadowing!!
        System.out.println(waarde); // Dit is de variabele die het dichtsbij te vinden is.
        System.out.println(this.waarde); // Dit is de instance variabele, dus 15
        this.waarde = waarde; // Nu wordt de instance variabele gevuld met 12
        System.out.println(this.waarde); // 12
    }

    void vulWaarde() {  // pssst, dit is overloading
//        System.out.println(getal);
        System.out.println(waarde);  // Nu is waarde de instance variabele
        System.out.println(this.waarde);

        {
            System.out.println("Introductie van lokale variabele met dezelfde naam binnen een code block");
            int waarde = 100;
            int nogEenGetal = 10;
            System.out.println(waarde);
            System.out.println("Alleen bestaat deze na dit code block niet meer!!");
        } // waarde en nogEenGetal bestaan nu niet meer. Beperkte scope
//        System.out.println(nogEenGetal);

        System.out.println("Introductie van lokale variabele met dezelfde naam");
        int waarde = 12; // gedeclareerd binnen een methode => lokale variabele
        int getal = 10; // Deze variabele bestaat pas vanaf deze regel
        System.out.println(waarde); // door de introductie van de lokale variabele is waarde nu de lokale variabele (shadowing)
        System.out.println(this.waarde); // this verwijst naar de instantie van het object en via this. kun je de instantie members
//        TestClass test = new TestClass(); // Dit is een lokale variabele!!!!!
    } // Nu zijn alle lokale variabelen dood.=> einde scope
}
/*
15
15
Introductie van lokale variabele met dezelfde naam binnen een code block
100
Alleen bestaat deze na dit code block niet meer!!
Introductie van lokale variabele met dezelfde naam
12
15
*/