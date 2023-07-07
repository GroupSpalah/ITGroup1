package homeworks.mihail_chursinov.hw_07_23.hw_04_07_23.task1;

/**
 * Create a generic class ArrayWorker with generic array field for working Integer and Double
 * Add code to counts the number of elements in each of arrays that are greater
 * than a specified element.
 */

public class ArrayWorker<T extends Number> {
    private final T[] array;

    public ArrayWorker(T[] array) {
        this.array = array;
    }

    public int countElement(T element) {
        int count = 0;
        for (T t : array) {
            if (t.doubleValue() > element.doubleValue()) {
                ++count;
            }
        }
        return count;
    }
}
