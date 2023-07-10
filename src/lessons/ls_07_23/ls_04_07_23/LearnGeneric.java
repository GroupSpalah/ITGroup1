package lessons.ls_07_23.ls_04_07_23;

public class LearnGeneric {
    public static void main(String[] args) {
        CalculatorGeneric<Integer> cgi = new CalculatorGeneric<>(4, 8);
        CalculatorGeneric<Double> cgd = new CalculatorGeneric<>(7.0, 9.0);

        CalculatorGenericTwo<Integer, Float> genericTwo = new CalculatorGenericTwo<>();

        ClassNotGeneric.print(5);
    }
}

class ClassNotGeneric {

    public static <T extends Number> void print(T t) {

    }
}

class CalculatorGeneric<T extends Number> {
    private T value1;
    private T value2;

    public CalculatorGeneric(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getT() {
        return value1;
    }

    public int sum() {
        return value1.intValue() + value2.intValue();//new Object() + new Object()
    }
}

class CalculatorGenericTwo<T, F extends Comparable<F>> {
    private T value1;
    private F value2;
}

class CalculatorInt {
    private int value1;
    private int value2;
}
class CalculatorDouble {
    private double value1;
    private double value2;
}