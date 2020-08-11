package c7x_exception_handling.exception4_ininitializer;

public class Exception4_ExceptionInInitializer {

    static {
        if (true)
            throw new RuntimeException("blabla");  // geeft geen RuntimeException maar vormt dit om naar een => ExceptionInInitializerError
        /* /1 vindt plaats als er een RuntimeException optredt in static initializer block
         *  /2 fout optreedt bij initializatie van static variabele
         *  /3 fout optreedt bij uitvoering van een method in static block
         */
    }

    public static void main(String[] args) {
        System.out.println("voer programma uit");
    }
}
