package lessons.ls_01_23.ls_31_01_23.loops;

public class ComplexLoop {
    public static void main(String[] args) {

        /*for (int i = 0; i < 20; i++) {
            if (i > 10) {
                System.out.print(i + "\t");
            }
        }*/

        for (int i = 0; i < 20; i++) {
            if (i > 10 && i % 2 == 1) {
                System.out.print(i + "\t");
            }
        }
    }
}
