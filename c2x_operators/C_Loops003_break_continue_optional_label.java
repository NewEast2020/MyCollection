package c2x_operators;

public class C_Loops003_break_continue_optional_label {

    public static void main(String[] args) {
//        Oef001();
        Oef002();
  }
    // break and continue statements
    // change control flow of loops

    // break statement
    // terminate the loop in which the break statement is defined
    // when an break statement is executed inside the loop
    // the control flow will jump to the first statement after the loop

    // the continue statement on the other hand
    // aborts the current iteration
    // will continue the execution of the loop
    // from the next iteration

    // when een loop is nested
    // not easy way to break out of the outer loop
    // from the inside loop

    // this is when a label is comes into play
    // label is an identifier followed by a colon
    // that marks the beginning of a loop

    // from anywhere in the loop
    // including the nested inner loops
    // we can use the break or continue statement
    // with the label
    // to archieve similair effects on outer loops

    static void Oef001() {
        // 2 dimensional array
        int[][] array = {{1, 2, 3 ,4 , 5}, {4, 0, 5, 6, 7}, {6, 7, 8, 9, 1 }};

        // iterate over a 2-dimensional array
        end:
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == 0) {
                    break end; // jumps to first the statement after the outer loop
                }
                System.out.println("(1) row: " + row + " col: " + col + "  " + array[row][col]);
//                System.out.println(array[row][col]);
            }
        }
    }

// output
//   (1) row: 0 col: 0  1
//   (1) row: 0 col: 1  2
//   (1) row: 0 col: 2  3
//   (1) row: 0 col: 3  4
//   (1) row: 0 col: 4  5
//   (1) row: 1 col: 0  4

    static void Oef002() {
//        int[][] array = {{1, 2, 3}, {4, 0, 5}, {6, 7, 8}};
        int[][] array = {{1, 2, 3 ,4 , 5}, {4, 0, 5, 6, 7}, {6, 7, 8, 9, 1 }};

        end:
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == 0) {
                    continue end; // terminates the iteration of the outer loop
                }
                System.out.println("(2) row: " + row + " col: " + col + "  " + array[row][col]);
            }
        }
    }
// output
//    (2) row: 0 col: 0  1
//    (2) row: 0 col: 1  2
//    (2) row: 0 col: 2  3
//    (2) row: 0 col: 3  4
//    (2) row: 0 col: 4  5
//    (2) row: 1 col: 0  4
//    (2) row: 2 col: 0  6
//    (2) row: 2 col: 1  7
//    (2) row: 2 col: 2  8
//    (2) row: 2 col: 3  9
//    (2) row: 2 col: 4  1
}


