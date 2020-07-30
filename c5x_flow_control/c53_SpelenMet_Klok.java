package c5x_flow_control;

import java.util.concurrent.TimeUnit;

class c53_SpelenMet_Klok {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("i " + i);
//            TimeUnit.MILLISECONDS.sleep(100);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
/*
i 0
i 1
i 2
i 3
i 4
i 5
i 6
i 7
i 8
i 9
 */