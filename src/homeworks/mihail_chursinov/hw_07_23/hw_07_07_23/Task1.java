package homeworks.mihail_chursinov.hw_07_23.hw_07_07_23;

import java.util.List;

/**
 * 1) В коллекции храним список стран. Вывести страны, которые заканчиваются на 'A'
 */

public class Task1 {
    public static void main(String[] args) {
        List<String> countries = List.of("Argentina", "Ukraine", "Canada");
        for (String country : countries) {
            if (country.endsWith("a")) {
                System.out.println(country);
            }
        }
    }
}
