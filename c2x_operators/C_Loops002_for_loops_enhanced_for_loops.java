package c2x_operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C_Loops002_for_loops_enhanced_for_loops {

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
        for (int i=0; i<5; i=i++){
            System.out.println("Hello world!");
        }
    }
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


