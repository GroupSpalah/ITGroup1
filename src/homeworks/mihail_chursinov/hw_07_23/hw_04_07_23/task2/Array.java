package homeworks.mihail_chursinov.hw_07_23.hw_04_07_23.task2;

public class Array<T extends Number> {
    private T[] array;

    public Array(T[] array) {
        this.array = array;
    }

    public T get(int index) {
        return array[index];
    }

    public int length() {
        return array.length;
    }
}
