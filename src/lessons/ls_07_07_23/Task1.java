package lessons.ls_07_07_23;

import java.util.List;

/**
 * В коллекции храним список стран. Вывести страны, которые начинаются на 'U'
 */
public class Task1 {
    public static void main(String[] args) {
        List<String> countries = List.of("Ukraine", "Canada", "USA");

//        countries.add("");

        for (String country : countries) {
            if (country.startsWith("U")) {
                System.out.println(country);
            }
        }
    }
}
