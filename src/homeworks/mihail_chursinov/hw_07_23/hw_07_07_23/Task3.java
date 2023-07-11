package homeworks.mihail_chursinov.hw_07_23.hw_07_07_23;
/**
 * В коллекции храним список стран. Вывести страны, в которых больше 5 букв
 */

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> countries = List.of("Argentina", "Ukraine", "USA");
        for (String country : countries) {
            if (country.length() > 5) {
                System.out.println(country);
            }
        }
    }
}
