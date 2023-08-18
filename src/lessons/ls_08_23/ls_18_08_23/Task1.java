package lessons.ls_08_23.ls_18_08_23;

import java.util.function.Predicate;
import java.util.stream.Stream;

//6.1
public class Task1 {
    public static void main(String[] args) {
        Integer[] array = {4, 7, 8, 9};

        long count = getCount(array, e -> e > 5);
    }

    public static long getCount(Integer[] array, Predicate<Integer> predicate) {
        return Stream
                .of(array)
                .filter(predicate)
                .count();

    }
}
