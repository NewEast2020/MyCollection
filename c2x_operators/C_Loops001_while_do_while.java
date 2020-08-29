package c2x_operators;

public class C_Loops001_while_do_while {

    public static void main(String[] args) {
//        Oef001();
//        Oef002();
//        Oef003();
//        Oef004();
        Oef005();
//        Oef006();
//        Oef007();
//        Oef008();
//        Oef009();
//        Oef010();
    }
    // loop are another type of decision construct

    // simple while loop
    static void Oef001() {
        int count = 0;
        while (count < 10) {
            System.out.println(count + 1 + " " + "Hello world!");
            count++;
        }
    }

    // loopvariable count: zero, continues as long as count is less than 10
    // count is incremented at the end of each iteration
    // there are 10 different count values: 0 to 9
    // loop body will be executed 10 times
    // resulting in 10 hello world

    // output
    // 1 Hello world!
    // 2 Hello world!
    // 3 Hello world!
    // 4 Hello world!
    // 5 Hello world!
    // 6 Hello world!
    // 7 Hello world!
    // 8 Hello world!
    // 9 Hello world!
    // 10 Hello world!

    // do while loop is similair to while loop
    // convert while loop in do while loop
    // difference with while loop :
    // do-while loop executes loop body at least once
    // because loop condition is checked after each iteration

    // move count definition inside the body, what will happen ?
    static void Oef002() {
/*
        do{
            int count = 0; // temp comment else compile error
                           // move count variable outside of the loop
            System.out.println(count+1 + " (2) " + "Hello World!");
        } while(count++ < 10);
*/
    }

    // move count out of the loop, what will happen ?
    static void Oef003() {
        int count = 0;  // count variable outside of the loop
        do {
            System.out.println(count + 1 + " (3) " + "Hello World!");
        } while (count++ < 10);
    }
    // Hello world is printed 11 times
    // postincrement
    // output
    // 1 (3) Hello World!
    // 2 (3) Hello World!
    // 3 (3) Hello World!
    // 4 (3) Hello World!
    // 5 (3) Hello World!
    // 6 (3) Hello World!
    // 7 (3) Hello World!
    // 8 (3) Hello World!
    // 9 (3) Hello World!
    // 10 (3) Hello World!
    // 11 (3) Hello World!

    static void Oef004() {
        int count = 0;  // count variable outside of the loop
        do {
            System.out.println(count + 1 + " (4) " + "Hello World!");
        } while (++count < 10);
    }
    // Hello world is printed 10 times
    // preincrement
    // output
    // 1 (4) Hello World!
    // 2 (4) Hello World!
    // 3 (4) Hello World!
    // 4 (4) Hello World!
    // 5 (4) Hello World!
    // 6 (4) Hello World!
    // 7 (4) Hello World!
    // 8 (4) Hello World!
    // 9 (4) Hello World!
    // 10 (4) Hello World!

    static void Oef005() {
        int count = 0;
        do {
            System.out.println(count + 1 + " (5) " + "Hello World!");
            count++;
        } while (count < 10);
    }
// output ok
//  1 (5) Hello World!
//  2 (5) Hello World!
//  3 (5) Hello World!
//  4 (5) Hello World!
//  5 (5) Hello World!
//  6 (5) Hello World!
//  7 (5) Hello World!
//  8 (5) Hello World!
//  9 (5) Hello World!
//  10 (5) Hello World!


    static void Oef008() {

    }

    static void Oef009() {

    }

    static void Oef010() {

    }
}


