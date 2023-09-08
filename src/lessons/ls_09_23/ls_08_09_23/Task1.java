package lessons.ls_09_23.ls_08_09_23;

import java.util.Comparator;
import java.util.Map;

/**
 * Create a Map that will store Employee name and salary.
 * Write a logic to retrieve an employee who gets the highest salary.
 * Output should be in the below format John Smith=$100000
 */
public class Task1 {
    public static void main(String[] args) {
        Map<String, Float> map = Map.of(
                "John", 500f,
                "Ben",  700f,
                "Anna", 800f,
                "Tom",  900f
        );

        Comparator<Map.Entry<String, Float>> comparator = (e1, e2) -> Float.compare(e1.getValue(), e2.getValue());

        Map.Entry<String, Float> entry = map
                .entrySet()
                .stream()
                .max(comparator)
                .get();

        System.out.println(entry);
    }
}
