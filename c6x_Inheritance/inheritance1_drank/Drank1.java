package c6x_Inheritance.inheritance1_drank;

abstract class Drank1 {
    abstract void drinken(); // default
    // overriding & zichtbaarheid
    // een private methode kun je niet overriden, want die heb je alleen voor jezelf
    // private (default, wordt ook wel package private), protected, public
    // overriden methodes MOETEN dezelfde zichtbaarheid of een grotere zichtbaarheid hebben.
}
