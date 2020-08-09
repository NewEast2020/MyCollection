package c6x_Inheritance.inheritance6_computer;

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
/*
De computer start op
De computer start op
De computer start op
 */