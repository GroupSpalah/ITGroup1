package homeworks.mihail_chursinov.hw_06_23.hw_20_06_23.task3;

/**
 * Create a method for calculation an area a rectangle
 * int squareRectangle(int a, int b), which should throw an IllegalArgumentException ia at least one of its arguments is
 * not positive. Create trySquareRectangle method which takes two parameters and calls squareRectangle to evaluate
 * an area of rectangle. Catch exceptions that can be generated. trySquareRectangle shouldn't generate any exceptions.
 * In case when one or two parameters are not positive the method should return -1.
 */

public class Rectangle {
    private int a;
    private int b;

    public int calculationRectangle(int a, int b) {
        try {
            if (a < 0 || b < 0) {
                throw new IllegalArgumentException("");
            }
        } catch (IllegalArgumentException e) {
            //    throw new RuntimeException(e);
        }
        return a * b;
    }

    public int trySquareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        return calculationRectangle(a, b);
    }
}

