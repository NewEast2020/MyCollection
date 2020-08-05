package c6x_Inheritance.inheritance5;

import c6x_Inheritance.inheritance4.*;

import java.util.ArrayList;
import java.util.List;

class DemoInheritancePolymorphisme5 {
    public static void main(String[] args) {
        Drank4 whiskey = new Whiskey4();
        Drank4 fanta = new Fanta4();
        Drank4 cola = new Cola4();
        List<Drank4> drankLijst = geefDrankLijst();
        for (Drank4 drank : drankLijst) {
            System.out.println(drank.getClass());
//            if (drank instanceof Bier) { // past dit object in een orv van het type Bier
//                System.out.println("biertje!");
//            }
//            if (drank instanceof AlcoholischeDrank) { // past dit in AlcoholischeDrank
//                System.out.println("Drank bevat alcohol");
//            }
//            if (drank instanceof NonAlcoholischeDrank) {
//                System.out.println("Frisje");
//            }
//            if (drank instanceof Cola) {
//                System.out.println("En een cola...");
//            }
//            if (drank instanceof Drank) {
//                System.out.println("Drank!");
//            }

            if (drank instanceof AlcoholischeDrank4) {
                System.out.println("Alcohol percentage: " + ((AlcoholischeDrank4)drank).alcoholPercentage);
            } else if (drank instanceof NonAlcoholischeDrank4) {
                System.out.println("Suikerpercentage:   " + ((NonAlcoholischeDrank4)drank).suikerPercentage);
            } else {
                System.out.println("Valt buiten de alcoholische en non alcoholische dranken"); // binnen ons model kan dit op dit moment NIET voorkomen.
            }
        }
    }

    private static List<Drank4> geefDrankLijst() {
        List<Drank4> drankjes = new ArrayList<>();
        drankjes.add(new Bier4());
        drankjes.add(new Whiskey4());
        drankjes.add(new Cola4());
        drankjes.add(new Fanta4());
        drankjes.add(new Bier4());
        drankjes.add(new Bier4());
        drankjes.add(new Bier4());
        drankjes.add(new Bier4());
        return drankjes;
    }
}
/* output
class c6x_Inheritance.demo4.Bier4
Alcohol percentage: 10
class c6x_Inheritance.demo4.Whiskey4
Alcohol percentage: 10
class c6x_Inheritance.demo4.Cola4
Suikerpercentage:   30
class c6x_Inheritance.demo4.Fanta4
Suikerpercentage:   30
class c6x_Inheritance.demo4.Bier4
Alcohol percentage: 10
class c6x_Inheritance.demo4.Bier4
Alcohol percentage: 10
class c6x_Inheritance.demo4.Bier4
Alcohol percentage: 10
class c6x_Inheritance.demo4.Bier4
Alcohol percentage: 10
 */