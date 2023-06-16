package homeworks.mihail_chursinov.hw_28_02_23;

public class Sum {

    public int sumOfNumbers(int a, int b) {
        int c = 0;
        if (a > -1000 && b < 1000) {
            c = a + b;
        }
        return c;
    }

}
class TestSum{
    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println("Sum = " + sum.sumOfNumbers(-900, 700));

    }

}
