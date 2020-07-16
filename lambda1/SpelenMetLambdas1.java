package lambda1;

public class SpelenMetLambdas1 {
    public static void main(String[] args) {
        MyFunctionalInterface multiplyTwee = new MultiplyTwee();
        MyFunctionalInterface multiplyDrie = new MultiplyDrie();

        multiplyTwee.verwerk(25);
        multiplyDrie.verwerk(50);
//        // via een anonymous inner class (geen OCA stof) kan ik ook de methode implementeren.
        // Is net als een losse class wat omslachtig.

        MyFunctionalInterface addHonderd = new MyFunctionalInterface() {
            @Override
            public void verwerk(int getal) {
                System.out.println(" === telErHonderdBijOp anonymous inner class === ");
                System.out.println("     === verwerk getal = " + getal);
                System.out.println("     " +  getal + " + 100 = " + (getal + 100));
            }
        };

        // Via de lambda vorm kan ik in 1 regel een methode definieren en dan meegeven aan een andere methode
        // uiteraard is het altijd een leash naar een object met 1 methode die je doorgeeft
        MyFunctionalInterface addTwintig = getal -> System.out.println("     " +  "addTwintig: " + getal + " + 20 = " + (getal + 20));

        System.out.println("Via methode");
        System.out.println("call 1");
        inputBewerkingWaardeExecute(multiplyDrie, 400);
        System.out.println("call 2");
        inputBewerkingWaardeExecute(addHonderd, 101);
        System.out.println("call 3");
        inputBewerkingWaardeExecute(addTwintig, 40);
        System.out.println("call 4");
        inputBewerkingWaardeExecute(getal -> System.out.println(getal + " / 10 " + (getal/10)), 200);
        System.out.println("call 5");
        inputBewerkingWaardeExecute(getal -> System.out.println(getal/25),200 );
        System.out.println("call 6");
        inputBewerkingWaardeExecute(getal -> System.out.println(3),200 );
        System.out.println("call 7");
        inputBewerkingWaardeExecute(getal -> System.out.println(0), 0);
        System.out.println("call 8");
        inputBewerkingWaardeExecute(getal -> System.out.println("asd"), 0);
    }

    // Deze methode heeft als het ware als argument een methode en een variabele
    // Op deze manier ben ik flexibel in de bewerkingen die ik doorgeef.

    private static void inputBewerkingWaardeExecute(MyFunctionalInterface bewerking, int getal) {
        System.out.println(" === inputBewerkingWaardeExecute methode, variable als argument === ");
        System.out.println("     bewerking = " + bewerking + ", getal = " + getal);
        bewerking.verwerk(getal);
    }
}
/*
 === MultiplyMetTwee implements MyFunctionalInterface ===
     === verwerk getal = 25
     25 * 2 = 50
 === MultiplyMetDrie implements MyFunctionalInterface ===
     === verwerk getal = 50
     50 * 3 = 150
Via methode
call 1
 === inputBewerkingWaardeExecute methode, variable als argument ===
     bewerking = lambda1.MultiplyDrie@41629346, getal = 400
 === MultiplyMetDrie implements MyFunctionalInterface ===
     === verwerk getal = 400
     400 * 3 = 1200
call 2
 === inputBewerkingWaardeExecute methode, variable als argument ===
     bewerking = lambda1.SpelenMetLambdas1$1@404b9385, getal = 101
 === telErHonderdBijOp anonymous inner class ===
     === verwerk getal = 101
     101 + 100 = 201
call 3
 === inputBewerkingWaardeExecute methode, variable als argument ===
     bewerking = lambda1.SpelenMetLambdas1$$Lambda$1/2003749087@6d311334, getal = 40
     addTwintig: 40 + 20 = 60
call 4
 === inputBewerkingWaardeExecute methode, variable als argument ===
     bewerking = lambda1.SpelenMetLambdas1$$Lambda$2/1747585824@3d075dc0, getal = 200
200 / 10 20
call 5
 === inputBewerkingWaardeExecute methode, variable als argument ===
     bewerking = lambda1.SpelenMetLambdas1$$Lambda$3/558638686@448139f0, getal = 200
8
call 6
 === inputBewerkingWaardeExecute methode, variable als argument ===
     bewerking = lambda1.SpelenMetLambdas1$$Lambda$4/2093631819@7ba4f24f, getal = 200
3
call 7
 === inputBewerkingWaardeExecute methode, variable als argument ===
     bewerking = lambda1.SpelenMetLambdas1$$Lambda$5/999966131@7699a589, getal = 0
0
call 8
 === inputBewerkingWaardeExecute methode, variable als argument ===
     bewerking = lambda1.SpelenMetLambdas1$$Lambda$6/1480010240@4dd8dc3, getal = 0
asd
 */