package c6x_Inheritance.inheritance6_computer;

abstract class Computer { // Wanneer je een class abstract maakt, kun je er geen instanties meer van maken.
    int geheugenGrootte;
    void booten() { // al mijn kinderen kunnen op dezelfde manier 'booten', maar mogen dit anders invullen.
        System.out.println("De computer start op");
    }
    abstract void werkenMetDevice();  // Dit is een abstracte methode. Deze MOET bij mijn childs geimplementeerd worden.
    // In een abstracte class mogen de methodes (niet static!!!) abstract zijn, maar mogen ook concreet zijn.
//    static abstract void test(); // Dit mag niet! Of abstract of static, nooit beiden. Illegale combinatie
}
