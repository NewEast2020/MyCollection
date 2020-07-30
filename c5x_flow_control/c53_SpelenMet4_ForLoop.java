package c5x_flow_control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class c53_SpelenMet4_ForLoop {

    public static void main(String[] args) {
        List<StringBuilder> woorden = new ArrayList<>(Arrays.asList(new StringBuilder("test"), new StringBuilder("test2")));
        for (StringBuilder woord : woorden) {
            System.out.println(woord + " voor aanpassing");
            woord.append("uitbreiding");
            System.out.println(woord + " na aanpassing");
        }
        System.out.println(woorden);

        System.out.println();
        for (StringBuilder woord : woorden) {
            System.out.println(woord + " voor aanpassing");
            woord = new StringBuilder("Andere tekst");
            System.out.println(woord + " na aanpassing");
        }
        System.out.println(woorden);
    }
}
/* output
test voor aanpassing
testuitbreiding na aanpassing
test2 voor aanpassing
test2uitbreiding na aanpassing
[testuitbreiding, test2uitbreiding]

testuitbreiding voor aanpassing
Andere tekst na aanpassing
test2uitbreiding voor aanpassing
Andere tekst na aanpassing
[testuitbreiding, test2uitbreiding]
 */