package lessons.ls_01_23.ls_28_01_23.conditional_operator;

public class ConditionalOperator {
    public static void main(String[] args) {
        int a = 12;
        int b = 0;

        boolean result = a > 10;

       /* if (a > 10) {
            System.out.println("a > 10");
        } else {
            System.out.println("a <= 10");
        }*/

       /* if (a > 10) {
            System.out.println("a > 10");
        } else if (a == 10) {
            System.out.println("a == 10");
        } else {
            System.out.println("a < 10");
        }*/

        /*if (a >= 10) {
            b = 15;
        } else {
            b = 25;
        }*/

        //ternary operator
//        condition ? statement if condition is true : statement if condition is false;

        b = a >= 10 ? 15 : 25;
//        b = a >= 10 ? (a == 12 ? 20 : 30) : 25;

        System.out.println(b);
    }
}
