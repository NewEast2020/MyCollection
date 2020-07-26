package c43_arrays2;

public class SpelenMetArrays2 {

    public static void main(String... arg) {
        array_1_Dimensionaal();
        array_2_Dimensionaal();
        array_Allocatie433();
        array_Assymetrisch436();
        array_Testen();
    }

    private static void array_Testen() {
        // beredeneer en begrijp output voor gegeven array indices
        System.out.println("SpelenMetArrays2.array_Testen");
        int[][][] order = {{{0, 1}, {2, 3, 4}}, {{5, 6, 7}, {8, 9}}, {{11}, {22}, {33, 44}, {55}}, {{66, 77, 88, 99}}};
        System.out.println("order[2][1][0] :" + order[2][1][0]);
        System.out.println("order[1][0][1] :" + order[1][0][1]);
        System.out.println("order[3][1][1] :" + order[3][1][1]);

        // type[] arrayNaam
        Dinosaurus[] stringVar;
        System.out.println();
    }

    private static void array_Assymetrisch436() {
        // asymmetrische
        System.out.println("SpelenMetArrays2.array_Assymetrisch436");
        int[] arrayNumbers = {1, 4, 6, 7, 9}; // anonymous array; altijd op 1 regel (niet splitsen)

        int[][] array2Numbers = {{3, 4}, {5, 6, 7}, {8, 9, 11, 12}};
        //  i j            i      0000    1111111    222222222222   //
        //    j      0   1   0  1  2    0  1   2   3   //
        System.out.println("array2Numbers[1][2] = " + array2Numbers[1][2]);
        System.out.println();
    }

    private static void array_Allocatie433() {
        // array allocatie
        System.out.println("SpelenMetArrays2.array_Allocatie433");
        int[] ia = new int[3];
        int[][] array2dim = new int[3][4]; // standaard en vaste grootte => symmetrische array
        int[][] array3dim = new int[3][];

        array2dim[1][1] = 345;
        System.out.println("array2dim[2][2]: " + array2dim[2][2]); // ook al is waarde nog niet expliciet toegekend; arrays worden altijd geinitialiseerd met staandaard waarden

        int a = 2, b = 2;
        int[] ib = new int[a + b]; // index is van type: char, byte, short, int
        ib = new int[2 + a + b]; // ib vewijst nu naar nieuwe/ander array met andere grootte
        System.out.println("groote array ib is: " + ib.length); // length: variabele geen methode! ; string.length()

        float[] decGetal = new float[3];
        //decGetal[14] = 12.3f;       // compiler check niet of index binnen grenzen is => runtime array
        System.out.println("decGetal = " + decGetal);
        System.out.println();
    }

    private static void array_2_Dimensionaal() {
        // 2-dimensionele array
        System.out.println("SpelenMetArrays2.array_2_Dimensionaal");
        String[] stringArray[];
        String[][] stringArray2; // VOORKEUR; [] direct achter type aanduiding
        String stringArray3[][];
        // tel gewoon aantal []=paren op => dimensie
        System.out.println();
    }

    private static void array_1_Dimensionaal() {
        // enkelvoudige 1-dim array
        System.out.println("SpelenMetArrays2.array_1_Dimensionaal");
        int[] arrayInt; // [] mogen aansluitend op type <= VOORKEURS NOTATIE
        arrayInt = new int[3];
        arrayInt[0] = 11;
        arrayInt[1] = 22;

        int arrayInt2[]; // [] mogen aansluitend op variabele naam

        // derde mogelijkheid: zie definitie main method String...arg
        // belangrijk: 3 aaneegesloten punten zijn met voor/achteraf al-dan-niet spatie(s)
        // benoeming: 'variable argument list'
        System.out.println();
    }
}
/*
SpelenMetArrays2.array_1_Dimensionaal

SpelenMetArrays2.array_2_Dimensionaal

SpelenMetArrays2.array_Allocatie433
array2dim[2][2]: 0
groote array ib is: 6
decGetal = [F@28d93b30

SpelenMetArrays2.array_Assymetrisch436
array2Numbers[1][2] = 7

SpelenMetArrays2.array_Testen
order[2][1][0] :22
order[1][0][1] :6
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
	at c43_arrays.SpelenMetArrays2.array_Testen(SpelenMetArrays2.java:19)
	at c43_arrays.SpelenMetArrays2.main(SpelenMetArrays2.java:10)
*/
