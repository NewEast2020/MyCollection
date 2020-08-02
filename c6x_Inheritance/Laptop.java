package c6x_Inheritance;

class Laptop extends PortableDevice {
    void werkenMetDevice() {
        System.out.println("Met een laptop ga ik heel serieus om. Hij is portable, maar als ik er mee werk, zet ik met toch even neer");
    } // Ik MOET hier de methode werkenMetDevice implementeren, want in mijn parents(Computer en PortableDevice) is de methode abstract en nog niet geïmplementeerd
    // Een child kan hetzelfde als een parent en in een NIET abstrace class komen geen abstracte methodes voor.
//    abstract void test(); abstracte methode kan NIET binnen een niet abstrace class
}
