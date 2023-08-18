package lessons.ls_08_23.ls_18_08_23;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LearnStream1 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(7, 8, 5, 3, 6);

        Predicate<Integer> predicate = value -> value > 5;
        Consumer<Integer> consumer = value -> System.out.println(value);

        /*System.out.println(integers
                .stream()
                .allMatch(predicate));*/
    /*
        System.out.println(integers
                .stream()
                .anyMatch(predicate));*/

        List<RMan> rmen = List.of(
                new RMan("John", 23),
                new RMan("Ben", 25),
                new RMan("Ann", 37)
        );

        Function<RMan, RPerson> function = m -> new RPerson(m.name(), m.age());
/*
        rmen
                .stream()//Stream<RMen>
                .map(function)//Stream<RPerson>
                .forEach(p -> System.out.println(p));*/

        int sum = rmen
                .stream()
                .mapToInt(m -> m.age())
                .sum();

//        System.out.println(sum);

        IntStream
                .range(0, 10)
                .forEach(index -> System.out.println(index));

        Integer[] array = {4, 7, 8, 2, 6};

//        Arrays.stream(array)

        List<Integer> list = Arrays.asList(array);

//        Stream.of(array)

        IntStream
                .range(0, array.length)
                .forEach(index -> System.out.println(array[index]));


    }
}

record RMan(String name, int age) {
}

record RPerson(String name, int age) {
}
