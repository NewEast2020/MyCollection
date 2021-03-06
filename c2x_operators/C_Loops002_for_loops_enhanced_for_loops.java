package c2x_operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C_Loops002_for_loops_enhanced_for_loops {

    public static void main(String[] args) {
//        Oef001();
//        Oef002();
//        Oef003();
//        Oef004();
//        Oef005();
//        Oef006();
//        Oef007();
        Oef008();
    }
// another loop type is the for loop
// the for loop is controlled by condition
// which usually involves a loopvariable
// difference is that the syntax of the for loop has designated places for
// the initialisation of the loop variable
// the loop condition
// and the variable update
// the variable initialisation happens once at the beginning of the loop
// the loop condition is checked before each iteration of the loop
// the update is performed after each iteration

    // simple for loop
    static void Oef001() {
        for (int i = 0; i < 5; i = i++) {
            System.out.println((i + 1) + " (1) " + "Hello world!");
        }
    }
// output
// 1 (1) Hello world!
// 1 (1) Hello world!
// 1 (1) Hello world!
// 1 (1) Hello world!
// 1 (1) Hello world!
// 1 (1) Hello world!
// 1 (1) Hello world!
// 1 (1) Hello world!
// 1 (1) Hello world!
// 1 (1) Hello world!
// 1 (1) Hello world!
// 1 (1) Hello world!
// 1 (1) Hello world!
// 1 (1) Hello world!
// never ends....

    static void Oef002() {
        for (int i = 0; i < 5; i = ++i) {
            System.out.println((i + 1) + " (2) " + "Hello world!");
        }
    }
// output
// 1 (2) Hello world!
// 2 (2) Hello world!
// 3 (2) Hello world!
// 4 (2) Hello world!
// 5 (2) Hello world!

    static void Oef003() {
        int i = 0;
        i = i++;
        System.out.println("(3) i = " + i);
    }
// output
// (3) i = 0

    static void Oef004() {
        int i = 0;
        i = ++i;
        System.out.println("(4) i = " + i);
    }
// output
// (4) i = 1

    // collection of things for example an array or an arraylist
    static void Oef005() {
        List<Character> list = new ArrayList<>(Arrays.asList('A', 'B', 'C'));

        System.out.println("(5) list: " + list);

        // for loop is used to iterate over the list
        // using the indices of the elements
        // each of the element of the arraylist is printed
        // in the order in which they appear in the araylist
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(" + i + ") : " + list.get(i));
        }
/*
    for(Character item : list){
      System.out.println(item);
      list.remove(item);
    }
*/
        //System.out.println(list);
    }

    static void Oef006() {
        List<Character> list = new ArrayList<>(Arrays.asList('A', 'B', 'C'));

        System.out.println("(6) list = " + list);
        // enhanced for loop offers a simpler way to step to all elements in a collection with
        // no use of a loop variable
        // no initialise of the variable
        // no update of the variable
        // no out of bound errors
        // no of by one error

        // output
        // (6) list = [A, B, C]
        // A
        // B
        // C

        for (Character item : list) {
            System.out.println(item);
        }
    }

    static void Oef007() {
        List<Character> list = new ArrayList<>(Arrays.asList('A', 'B', 'C'));

        System.out.println("(7) list = " + list);

        // for loops
        // enhanced for loops
        // can be used interchangeably mostly, not always equivalent
        // traverse the list and remove each element right after the element is visited
        for (Character item : list) {
            System.out.println(item);
            list.remove(item);
        }
    }
    // code compile ok
    // code will throw an exception
    // the enhanced for loop does not allow code in the loop body to make any structural changes
    // to the underlying structure

    // output
    // (7) list = [A, B, C]
    // A
    // Exception in thread "main" java.util.ConcurrentModificationException
    //	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
    //	at java.util.ArrayList$Itr.next(ArrayList.java:851)
    //	at c2x_operators.C_Loops002_for_loops_enhanced_for_loops.Oef007(C_Loops002_for_loops_enhanced_for_loops.java:131)
    //	at c2x_operators.C_Loops002_for_loops_enhanced_for_loops.main(C_Loops002_for_loops_enhanced_for_loops.java:16)

    static void Oef008() {
        List<Character> list = new ArrayList<>(Arrays.asList('A', 'B', 'C'));

        System.out.println("(8a) list = " + list);

        // in for loops structural changes are allowed
        // loopbody causes structural changes in the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(" + i + ") : " + list.get(i));
            list.remove(i);
            System.out.println("(8b) list = " + list);

        }
    }
// output
// (8) list = [A, B, C]
// A
// C

// output2
// (8a) list = [A, B, C]
// list.get(0) : A
// (8b) list = [B, C]
// list.get(1) : C
// (8b) list = [B]

}


