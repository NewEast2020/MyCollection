package c2x_operators;

public class B_DecisionConstructs003_switch_vs_nested_if_else {

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
        Character c = 'A';
        switch(c) {
            case 'A':
                System.out.println("Excellent job!");
            case 'B':
                System.out.println("Good job!");
                break;
            default:
                System.out.println("Decent job!");
        }
    }
    static void Oef002(){
        int days = 0, month = 6;
        switch(month){
            case 1: case 3: case 5: case 6: case 7:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            default:
                days = 30;
        }
        System.out.println(days);
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


