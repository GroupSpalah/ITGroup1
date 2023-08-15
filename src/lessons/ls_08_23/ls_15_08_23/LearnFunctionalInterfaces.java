package lessons.ls_08_23.ls_15_08_23;

import java.util.stream.IntStream;

public class LearnFunctionalInterfaces {
    public static void main(String[] args) {
        Actionable actionable = (String str) -> System.out.println(str);

//        actionable.action("Hello");

        actionable = str -> System.out.println(str + "World");

//        actionable.action("Hello");

        Convertable<String, Integer> convertable = str -> {
            return Integer.parseInt(str);
        };

//        System.out.println(convertable.convert("45") + 5);

        IntStream
                .range(0, 10)
                .forEach(v -> System.out.println(v));
    }
}

@FunctionalInterface
interface Actionable {
    void action(String str);
}

@FunctionalInterface
interface Convertable<T,F> {
    F convert(T t);
}
