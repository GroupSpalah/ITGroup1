package lessons.homeworks.anton_gvozdenko.hw_07_07_23;

import java.util.List;

public class CountryList {
    public static void main(String[] args) {
        List<String> countries = List.of("Ukraine", "Moldova", "China");
        for (String country : countries) {
            if (country.endsWith("a")) {
                System.out.println(country);
            }
        }
    }
}
