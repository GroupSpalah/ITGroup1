package homeworks.anton_gvozdenko.hw_04_07_23;

public class ArrayWorker {
    public static void main(String[] args) {

        Integer[] arrayInt = {1, 4, 7};
        Double[] arrayDouble = {2.2, 5.4, 6.6};

        int count = ArrayGeneric.countNumb(arrayInt, 3);
        double countD = ArrayWorkers.countValue(arrayDouble, 1.4);
        System.out.println(count);
        System.out.println(countD);
    }
}

class ArrayGeneric {
    public static <T extends Number> int countNumb(T[] array, T maxElem) {
        int count = 0;
        for (T i : array) {
            if (i.intValue() > maxElem.intValue()) {
                count++;
            }
        }
        return count;
    }

}

class ArrayWorkers {
    public static <F extends Number> double countValue(F[] arrayDouble, F maxValue) {
        double countD = 0;
        for (F f : arrayDouble) {
            if (f.doubleValue() > maxValue.doubleValue()) {
                countD++;
            }
        }
        return countD;
    }
}