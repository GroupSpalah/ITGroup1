package lessons.ls_09_23.ls_05_09_23;

import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Task1 {
    public static void main(String[] args) {

    }
}

class MyUtils {

    public static Predicate<Integer> getPredicateFromSet(Set<Predicate<Integer>> predicates) {
        BiFunction<Predicate<Integer>, Predicate<Integer>, Predicate<Integer>> biFunction = (pr1, pr2) -> pr1.and(pr2);

//        BinaryOperator<Predicate<Integer>> binaryOperator = (pr1, pr2) -> biFunction.apply(pr1, pr2);
        BinaryOperator<Predicate<Integer>> binaryOperator = biFunction::apply;

        Predicate<Integer> predicate = predicates
                .stream()
                .reduce(binaryOperator)
                .get();

        return predicate;
    }
}

/**
 *
 *     pr1, pr2, pr3, pr4 -> pr1 + pr2 -> prTemp
 *     prTemp, pr3, pr4 -> prTemp + pr3 -> prValue
 *     prValue + pr4 -> prResult
 *
 */
