package c43_kaarten1;

//  Static variant, niet object oriented
public class SpelenMetArrays2_Static {

    static String[] kleuren = {
            "Harten", "Harten", "Harten", "Harten", "Harten", "Harten", "Harten", "Harten", "Harten", "Harten", "Harten", "Harten", "Harten",
            "Ruiten", "Ruiten", "Ruiten", "Ruiten", "Ruiten", "Ruiten", "Ruiten", "Ruiten", "Ruiten", "Ruiten", "Ruiten", "Ruiten", "Ruiten",
            "Schoppen", "Schoppen", "Schoppen", "Schoppen", "Schoppen", "Schoppen", "Schoppen", "Schoppen", "Schoppen", "Schoppen", "Schoppen", "Schoppen", "Schoppen",
            "Klaveren", "Klaveren", "Klaveren", "Klaveren", "Klaveren", "Klaveren", "Klaveren", "Klaveren", "Klaveren", "Klaveren", "Klaveren", "Klaveren", "Klaveren"
    };
    static String[] waarden = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Vrouw", "Heer", "Aas",
            "2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Vrouw", "Heer", "Aas",
            "2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Vrouw", "Heer", "Aas",
            "2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Vrouw", "Heer", "Aas"
    };

    public static void main(String[] args) {
        toonKaarten2();
    }

    private static void toonKaarten2() {
        for (int i = 0; i < kleuren.length; i++) {
            System.out.println(kleuren[i] + " " + waarden[i]);
        }
    }
}
/* output
Harten 2
Harten 3
Harten 4
Harten 5
Harten 6
Harten 7
Harten 8
Harten 9
Harten 10
Harten Boer
Harten Vrouw
Harten Heer
Harten Aas
Ruiten 2
Ruiten 3
Ruiten 4
Ruiten 5
Ruiten 6
Ruiten 7
Ruiten 8
Ruiten 9
Ruiten 10
Ruiten Boer
Ruiten Vrouw
Ruiten Heer
Ruiten Aas
Schoppen 2
Schoppen 3
Schoppen 4
Schoppen 5
Schoppen 6
Schoppen 7
Schoppen 8
Schoppen 9
Schoppen 10
Schoppen Boer
Schoppen Vrouw
Schoppen Heer
Schoppen Aas
Klaveren 2
Klaveren 3
Klaveren 4
Klaveren 5
Klaveren 6
Klaveren 7
Klaveren 8
Klaveren 9
Klaveren 10
Klaveren Boer
Klaveren Vrouw
Klaveren Heer
Klaveren Aas
 */