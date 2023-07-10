package lessons.ls_07_23.ls_07_07_23;

import java.util.ArrayList;
import java.util.List;

/**
 * В коллекции храним числа. Увеличить каждый элемент на 5
 */
public class Task2 {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();

        values.add(5);
        values.add(7);
        values.add(9);

        for (int i = 0; i < values.size(); i++) {
            Integer element = values.get(i);

            int newValue = element + 5;

            values.set(i, newValue);
        }

        System.out.println(values);
    }
}
