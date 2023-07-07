package homeworks.anton_gvozdenko.hw_04_07_23.task2;

class Array<T> {
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

public class ArrayUtil {
    public static <T extends Number> int showAverageValue(Array e) {
        double sum = 0;
        for (int i = 0; i < e.length(); i++) {
            if (e[i + 1] < e.length()) {
                sum += e[i];
            }

            double result = sum / e.length();
        }
        return 0;
    }
}

class Test {
    public static void main(String[] args) {

        Array<Integer> integerArray = new Array<>(new Integer[]{1, 2, 3, 4});
        double averageValue = ArrayUtil.showAverageValue(integerArray);
    }
}