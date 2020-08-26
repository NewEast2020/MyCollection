package c3x_methods;

public class A_Methods001_arguments_and_return_values {

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

    static void Oef001() {
        int[] args = {1, 2, 3, 4};
        print("test 1", 1, 2, 3, 4);
        print("test 2", new int[]{1, 2, 3, 4});
        print("test 3", args);
        //print("test 4", {1, 2, 3, 4}); // temp comment
    }
    static void print(String label, int... data){
        System.out.print(label+":");
        for(int item: data){
            System.out.print(item);
        }
        System.out.println();
    }
    static void Oef002() {
        A_Methods001_arguments_and_return_values m = new A_Methods001_arguments_and_return_values();
        m.method1();
        m.method2();
        m.method3();
        m.method4();
    }
    public void method1(){}

    public void method2(){
        return;
    }

    public Float method3(){
        //return 12.3; // temp comment
        return 12.3f; // temp inserted
    }

    public Float method4(){
        return 12.3f;
    }
    static void Oef003() {

    }

    static void Oef004() {

    }

    static void Oef005() {

    }

    static void Oef006() {

    }

    static void Oef007() {

    }

    static void Oef008() {

    }

    static void Oef009() {

    }

    static void Oef010() {

    }
}


