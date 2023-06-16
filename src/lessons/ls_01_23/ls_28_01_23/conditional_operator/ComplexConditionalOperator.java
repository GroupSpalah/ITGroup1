package lessons.ls_01_23.ls_28_01_23.conditional_operator;

public class ComplexConditionalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        if (a == 10 && b == 15) {//logical operator AND, strictly operator
            System.out.println("a == 10 and b == 15");
        }

        if (a == 10 || b == 15) {//logical operator OR, not strictly operator
            System.out.println("a == 10 or b == 15");
        }

    }
}

/**
 * For AND:
 * true && false = false
 * true && true = true
 * false && false = false
 * <p>
 * For OR:
 * true || false = true
 * true || true = true
 * false || false = false
 */
