package homeworks.mihail_chursinov.hw_07_23.hw_04_07_23.task2;

public class Test {
    public static void main(String[] args) {
        Double[] doubleArray = {2.0, 3.1, 2.8};
        Array<Double> array = new Array<>(doubleArray);
        double average = ArrayUtil.averageValue(array);
        System.out.println(average);
    }
}
