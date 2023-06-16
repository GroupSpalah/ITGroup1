package lessons.ls_01_23.ls_31_01_23.loops;

public class Loops {
    public static void main(String[] args) {
        /*
        * for
        * for(foreach)
        * while - loop with precondition
        * do-while - loop with postcondition
        * */

        for (int i = 0; i <= 5; ++i) {
//            System.out.println("10 jumps");
        }

        int i = 5;

        while (i < 5) {
//            System.out.println("10 jumps");
            ++i;
        }

        int a = 5;

        do {
            System.out.println("10 jumps");
            ++a;
        } while (a < 5);

        /*while (true) {

        }*/

        for(;;);
    }
}
