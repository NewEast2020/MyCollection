package c6x_Inheritance.inheritance9_parentchild;

class Child extends Parent {
    static int staticWaardeVanChildClass = 20;
    //    @Override // geen override, geen polymorphisme. Dat geldt alleen bij niet statische methodes. Daar komen we nog uitgebreid op terug.
    static void staticMethode() {
        System.out.println("We zitten nu in de static methode van de class Child");
    }
}
