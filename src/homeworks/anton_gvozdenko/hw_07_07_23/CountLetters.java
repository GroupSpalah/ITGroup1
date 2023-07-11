package lessons.homeworks.anton_gvozdenko.hw_07_07_23;

import java.util.List;

public class CountLetters {
    public static void main(String[] args) {
        List<String> countries = List.of("Ukraine", "Brunei", "China", "USA");
        for (String country : countries) {
            int length = country.length();
            if (length > 5) {
                System.out.println(country);
            }
        }
    }
}
