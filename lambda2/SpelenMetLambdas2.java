package lambda2;

import java.util.function.Consumer;
import java.util.function.Predicate;
//import java.util.function.*; // Ook geldig, maar dan importeer ik in principe alles uit function
//import java.util.*; // dit is te weinig voor de import voor java.util.function.*, dus geen subpackages!!
//import java.util.*.*; // Dit compileert niet.

public class SpelenMetLambdas2 {
    public static void main(String[] args) {
        System.out.println("call 1 : Consumer<Integer> keerDrie = SpelenMetConsumerFunctionalInterface();");
        Consumer<Integer> keerDrie = SpelenMetConsumerFunctionalInterface();

        System.out.println("call 2 : verwerk(keerDrie, 45); ");
        verwerk(keerDrie, 45);

        System.out.println("call 3 : verwerk(getal -> System.out.println(Het getal is + getal), 500); Zelf gemaakte lambda, waarmee ik de Consumer implementeer.");
        verwerk(getal -> System.out.println("Het getal is " + getal), 500);
        // Zelf gemaakte lambda, waarmee ik de Consumer implementeer.

        System.out.println("call 4 : verwerk(maakConsumer(), 500); Dit mag, maar maakt de methode wat groot/complex");
        verwerk(maakConsumer(), 500);
        // Dit mag, maar maakt de methode wat groot/complex

        System.out.println("call 5 : verwerk(getal -> specifiekeBewerking(getal), 500); dit kom je vaker tegen, dan geef je echt de methode mee als argument");
        verwerk(getal -> specifiekeBewerking(getal), 500);
        // dit kom je vaker tegen, dan geef je echt de methode mee als argument

        System.out.println("call 6 :  verwerk(new Bewerking(), 35); gebruikt class Bewerking");
        verwerk(new Bewerking(), 35);
        // Dit mag, maar dan heb ik een extra class nodig (Bewerking) en ben ik niet flexibel

        System.out.println("call 7 : SpelenMetPredicateFunctionalInterface() === ");
        SpelenMetPredicateFunctionalInterface();
    }

    private static void SpelenMetPredicateFunctionalInterface() {
        Predicate<String> test = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        };
        Predicate<Integer> groterDanTien = getal -> getal > 10;
        System.out.println("     test = " + groterDanTien.test(9) + " getal 9 > 10;");
        System.out.println("     test = " + groterDanTien.test(11) + " getal 11 > 10;");
    }

    private static Consumer<Integer> SpelenMetConsumerFunctionalInterface() {
        System.out.println("      === 1 SpelenMetConsumerFunctionalInterface() === ");
        Consumer<Integer> plusTwee = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("      " +  integer + " + 2 = " + (integer + 2));
            }
        };
        Consumer<Integer> keerDrie = integer -> System.out.println("      " + integer + " * 3 = " + (integer * 3));
        // Directe implementatie van Consumer interface door gebruik te maken van een lambda
        keerDrie.accept(5);

        Consumer<String> eersteKarakter = tekst -> System.out.println("      " + tekst.charAt(0));
        eersteKarakter.accept("Even kijken of het werkt");

        Consumer<String> csmString = (s) -> System.out.println("      " + s.toLowerCase());
        csmString.accept("Hello Consumer With Lambda8");
        return keerDrie;
    }

    private static Consumer<Integer> maakConsumer() {
        System.out.println("      === 2 maakConsumer() === ");
        return getal -> System.out.println("     Het getal is " + getal);
    }

    private static void specifiekeBewerking(Integer getal) {
        System.out.println("      === 3 specifiekeBewerking(getal) === " + getal );
        System.out.println("     Het getal is " + getal);
    }

    private static void verwerk(Consumer<Integer> consumer, Integer teVerwerkenData) {
        System.out.println("      === 4 verwerk consumer teVerwerkenData === " + "consumer: " + consumer  + " teVerwerkenData: " + teVerwerkenData);
        consumer.accept(teVerwerkenData);
    }
}
/* output
call 1 : Consumer<Integer> keerDrie = SpelenMetConsumerFunctionalInterface();
      === 1 SpelenMetConsumerFunctionalInterface() ===
      5 * 3 = 15
      E
      hello consumer with lambda8
call 2 : verwerk(keerDrie, 45);
      === 4 verwerk consumer teVerwerkenData === consumer: lambda2.SpelenMetLambdas2$$Lambda$1/295530567@404b9385 teVerwerkenData: 45
      45 * 3 = 135
call 3 : verwerk(getal -> System.out.println(Het getal is + getal), 500); Zelf gemaakte lambda, waarmee ik de Consumer implementeer.
      === 4 verwerk consumer teVerwerkenData === consumer: lambda2.SpelenMetLambdas2$$Lambda$4/1831932724@682a0b20 teVerwerkenData: 500
Het getal is 500
call 4 : verwerk(maakConsumer(), 500); Dit mag, maar maakt de methode wat groot/complex
      === 2 maakConsumer() ===
      === 4 verwerk consumer teVerwerkenData === consumer: lambda2.SpelenMetLambdas2$$Lambda$5/1023892928@214c265e teVerwerkenData: 500
     Het getal is 500
call 5 : verwerk(getal -> specifiekeBewerking(getal), 500); dit kom je vaker tegen, dan geef je echt de methode mee als argument
      === 4 verwerk consumer teVerwerkenData === consumer: lambda2.SpelenMetLambdas2$$Lambda$6/1149319664@7cca494b teVerwerkenData: 500
      === 3 specifiekeBewerking(getal) === 500
     Het getal is 500
call 6 :  verwerk(new Bewerking(), 35); gebruikt class Bewerking
      === 4 verwerk consumer teVerwerkenData === consumer: lambda2.Bewerking@7ba4f24f teVerwerkenData: 35
call 7 : SpelenMetPredicateFunctionalInterface() ===
     test = false getal 9 > 10;
     test = true getal 11 > 10;
*/



