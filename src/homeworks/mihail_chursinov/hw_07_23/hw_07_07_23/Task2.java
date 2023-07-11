package homeworks.mihail_chursinov.hw_07_23.hw_07_07_23;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> countries = List.of("Argentina", "Ukraine", "Greece");
        for (String country : countries) {
            if (country.contains("a")) {
                System.out.println(country);
            }
        }
    }
}
