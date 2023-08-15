package lessons.ls_08_23.ls_15_08_23;

import java.util.List;

/**
 * В коллекции храним список стран. Вывести страны, которые начинаются на 'A'
 */
public class Task1 {
    public static void main(String[] args) {
        List<String> countries = List.of("Africa", "Afganistan", "Uk", "Ukraine");

        countries
                .stream()
                .filter(country -> country.startsWith("A"))
                .forEach(country -> System.out.println(country));
    }
}
