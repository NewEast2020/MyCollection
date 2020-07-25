package c25_237_wrapper_classes3;

public class Create_Object_Parse_Retrieve_primitive_value3 {
    public static void main(String ...ditMagOok) { // geldige psvm
        creating_Objects_Of_Wrapper_classes_using_valueOf_static_method252();

        parsing_a_String_value_to_a_primitive_type254();

        parsing_to_a_primitive_value_and_autoboxing_to_an_object_of_corresponding_wrapper_class257();

        create_Object_of_wrapper_class_and_unboxing_to_primitive_type257();

        creating_Objects_Of_Wrapper_classes_using_constructors_that_accept_a_primitve_value252();

        creating_Objects_Of_Wrapper_classes_using_assignment_of_a_primitve_value_and_autoboxing_to_an_object_of_corresponsding_wrapper_classes252();

        create_Object_of_wrapper_class_by_autoboxing_a_primitive_value_and_unboxing_to_a_primitive_value257();

        retrieve_primitve_value_by_intValue_from_the_wrapper_class_self253();

//        System.out.println(Integer.toHexString(15678234)); // Hoef je niet te weten voor je OCA
    }

    private static void retrieve_primitve_value_by_intValue_from_the_wrapper_class_self253() {
        Integer getal = 10;
        int waarde = getal.intValue(); // unboxing

        //Zelf uitpakken kan ook
        Integer zelfUitpakken = 61;
        int uitgepakt = zelfUitpakken.intValue(); // nu pak ik hem zelf uit en
        // maak ik er een int van.
    }

    private static void create_Object_of_wrapper_class_by_autoboxing_a_primitive_value_and_unboxing_to_a_primitive_value257() {
        int getal100 = new Integer(100); // hele omslachtige manier, maar het mag.
        // Eerst boxing en daarna unboxing.
    }

    private static void creating_Objects_Of_Wrapper_classes_using_assignment_of_a_primitve_value_and_autoboxing_to_an_object_of_corresponsding_wrapper_classes252() {
        Integer getal1 = 100 ; // autoboxing van een primitive value
    }

    private static void creating_Objects_Of_Wrapper_classes_using_constructors_that_accept_a_primitve_value252() {
        Integer getal10 = new Integer(100); // constructor accepts a primitive value
        // Eerst boxing en daarna unboxing.
    }

    private static void create_Object_of_wrapper_class_and_unboxing_to_primitive_type257() {
        int evenTestenAlsPrimitive = Integer.valueOf(12); // Dit mag!! valueOf geeft altijd een instantie
        // van de bijbehorende Wrapper class
        // Deze wordt daarna meteen uitgepakt.
        // Dit heet unboxing
    }

    private static void parsing_to_a_primitive_value_and_autoboxing_to_an_object_of_corresponding_wrapper_class257() {
        Integer evenTesten = Integer.parseInt("12");   // Dit mag!! parseInt geeft een primitive en die
                                                          // wordt omgezet naar een Integer (autoboxing)
    }

    private static void parsing_a_String_value_to_a_primitive_type254() {
        int getalAlsPrimitive = Integer.parseInt("123"); // parse methodes geven een primitive terug en
                                                            // GEEN instantie van de bijbehorende wrapper class
    }

    private static void creating_Objects_Of_Wrapper_classes_using_valueOf_static_method252() {
        Integer getal4 = Integer.valueOf("1234");
        System.out.println("getal = " + getal4);

        Double dgetal = Double.valueOf("1234e12"); // valueOf methodes geven altijd een wrapper terug.
                                                   // Double geeft een Double en
                                                   // Integer een Integer!
        System.out.println("dgetal = " + dgetal);
    }
}
/*
getal = 1234
dgetal = 1.234E15
*/