package lessons.ls_08_23.ls_15_08_23;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LearnStreams {
    public static void main(String[] args) {
        List<Integer> integers = List.of(7, 8, 5, 3, 6);

        Predicate<Integer> predicate = value -> value > 5;
        Consumer<Integer> consumer = value -> System.out.println(value);

        integers
                .stream()//Stream<Integer>
                .filter(predicate)//Stream<Integer>, where value > 5
                .forEach(consumer);
    }

}
