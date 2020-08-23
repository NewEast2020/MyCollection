package c2x_operators;

public class C_Loops003_break_continue_optional_label {

    public static void main(String[] args) {
        Oef001();
        Oef002();
        Oef003();
        Oef004();
        Oef005();
        Oef006();
        Oef007();
        Oef008();
        Oef009();
        Oef010();
    }

    static void Oef001(){
        int[][] array = {{1, 2, 3}, {4, 0, 5}, {6, 7, 8}};

        end:
        for(int row=0; row<array.length; row++){
            for(int col=0; col<array[row].length; col++){
                if(array[row][col] == 0){
                    break end;
                }
                System.out.println(array[row][col]);
            }
        }
    }
    static void Oef002(){

    }
    static void Oef003(){

    }
    static void Oef004(){

    }
    static void Oef005(){

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


