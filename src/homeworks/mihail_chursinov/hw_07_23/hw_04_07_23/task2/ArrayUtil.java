package homeworks.mihail_chursinov.hw_07_23.hw_04_07_23.task2;

/**
 * In the class ArrayUtill write static method named "averageValue()"
 * that takes an object of Array type as input. and returns the average value its elements.
 * The given method should return value of double type and take any array, whose elements extends Number type.
 */

public class ArrayUtil {
    public static double averageValue(Array array) {
        double sum = 0.0;
        int count = array.length();

        for (int i = 0; i < count; i++) {
            sum += array.getArray(i).doubleValue();
        }

        return sum / count;

    }
}
