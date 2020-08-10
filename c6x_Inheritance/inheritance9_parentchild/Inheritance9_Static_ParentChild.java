package c6x_Inheritance.inheritance9_parentchild;

class Inheritance9_Static_ParentChild {
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
/* output
Static waarde van de parent class
10
11
We zitten nu in de static methode van de class Parent
We zitten nu in de static methode van de class Child
Wat als we deze methodes via de instanties gaan aanroepen
We zitten nu in de static methode van de class Parent
We zitten nu in de static methode van de class Parent
We zitten nu in de static methode van de class Child
15
class c6x_Inheritance.inheritance9_parentchild.Parent
class c6x_Inheritance.inheritance9_parentchild.Child
Child
 */