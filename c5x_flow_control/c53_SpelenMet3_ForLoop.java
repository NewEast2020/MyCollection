package c5x_flow_control;

class c53_SpelenMet3_ForLoop {

    public static void main(String[] args) {
        int[] getallen = {1, 23, 45, 123, 2};
        for (int i = 0; i < getallen.length; i++) {
            System.out.println("Originele waarde " + getallen[i]);
            getallen[i] = getallen[i] * 2;
            System.out.println("Nieuwe waarde " + getallen[i]);
        }

        for (int getal : getallen) {
            getal = getal + 1000;
            System.out.println("Ik denk nu de waarde in de array aan te passen: " + getal);
        }

        // Dit is wat de enhanced for loop eigenlijk doet:
        for (int i = 0; i < getallen.length; i++) {
            int getal = getallen[i];
            getal = getal + 1000; // Hiermee pas ik getallen[i] dus NIET aan
        }
        int a = 100;  // te vergelijken met getallen[i]
        int b = a;
        b = 200;
        System.out.println(a); // a is nog steeds 100!!!

        for (int i = 0; i < getallen.length; i++) {
            System.out.println("Controle waarde in de array " + getallen[i]);
        }
    }
}
/* output
Originele waarde 1
Nieuwe waarde 2
Originele waarde 23
Nieuwe waarde 46
Originele waarde 45
Nieuwe waarde 90
Originele waarde 123
Nieuwe waarde 246
Originele waarde 2
Nieuwe waarde 4
Ik denk nu de waarde in de array aan te passen: 1002
Ik denk nu de waarde in de array aan te passen: 1046
Ik denk nu de waarde in de array aan te passen: 1090
Ik denk nu de waarde in de array aan te passen: 1246
Ik denk nu de waarde in de array aan te passen: 1004
100
Controle waarde in de array 2
Controle waarde in de array 46
Controle waarde in de array 90
Controle waarde in de array 246
Controle waarde in de array 4
 */