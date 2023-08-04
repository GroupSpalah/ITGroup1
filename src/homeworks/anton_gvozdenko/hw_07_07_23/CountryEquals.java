package homeworks.anton_gvozdenko.hw_07_07_23;

import java.util.List;

public class CountryEquals {
    public static void main(String[] args) {
        List<String> countries = List.of("Ukraine", "Brunei", "China");
        for (String country : countries) {
            if (country.contains("a")) {
                System.out.println(country);
            }
        }
    }
}
