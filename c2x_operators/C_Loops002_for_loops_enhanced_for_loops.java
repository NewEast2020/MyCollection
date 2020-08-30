package c2x_operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C_Loops002_for_loops_enhanced_for_loops {

    public static void main(String[] args) {
//        Oef001();
        Oef001b();
//        Oef002();
//        Oef003();
//        Oef004();
//        Oef005();
//        Oef006();
//        Oef007();
//        Oef008();
//        Oef009();
//        Oef010();
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
    static void Oef001(){
        for (int i = 0; i < 5; i = i++){
            System.out.println( (i+1) + " (1) " + "Hello world!");
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

    static void Oef001b(){
        for (int i = 0; i < 5; i = ++i){
            System.out.println( (i+1) + " (1b) " + "Hello world!");
        }
    }
// output
// 1 (1b) Hello world!
// 2 (1b) Hello world!
// 3 (1b) Hello world!
// 4 (1b) Hello world!
// 5 (1b) Hello world!

    static void Oef002(){
        List<Character> list =
                new ArrayList<>(Arrays.asList('A', 'B', 'C'));

        //System.out.println(list);

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
/*
    for(Character item : list){
      System.out.println(item);
      list.remove(item);
    }
*/
        //System.out.println(list);
    }
    static void Oef003(){
        List<Character> list =
                new ArrayList<>(Arrays.asList('A', 'B', 'C'));

        for(Character item : list){
            System.out.println(item);
        }
    }
    static void Oef004(){
        List<Character> list =
                new ArrayList<>(Arrays.asList('A', 'B', 'C'));

        for(Character item : list){
            System.out.println(item);
            list.remove(item);
        }
    }
    static void Oef005(){
        List<Character> list =
                new ArrayList<>(Arrays.asList('A', 'B', 'C'));

        //System.out.println(list);

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
            list.remove(i);
        }
    }
    static void Oef006(){

    }
    static void Oef007(){

    }
    static void Oef008(){

    }
    static void Oef009(){

    }
    static void Oef010(){

    }
}


