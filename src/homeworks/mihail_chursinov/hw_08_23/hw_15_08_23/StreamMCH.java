package homeworks.mihail_chursinov.hw_08_23.hw_15_08_23;

import java.util.List;

/**
 *  коллекции храним список стран. Вывести страны, которые заканчиваются на 'A'
 *
 * В коллекции храним список стран. Вывести страны, которые содержут букву 'A'
 *
 * В коллекции храним список стран. Вывести страны, в которых больше 5 букв
 */

public class StreamMCH {
    public void showCountriesTndWith() {
        List<String> countries = List.of("Ukraine", "Australia", "UK", "Canada");
        countries
                .stream()
                .filter(country -> country.endsWith("a"))
                .forEach(country -> System.out.println(country));
    }

    public void showCountriesWhoContains() {
        List<String> countries = List.of("Ukraine", "Australia", "UK", "Canada");
        countries
                .stream()
                .filter(country -> country.contains("a"))
                .forEach(country -> System.out.println(country));
    }

    public void showCountriesLength() {
        List<String> countries = List.of("Ukraine", "Australia", "UK", "Canada");
        countries
                .stream()
                .filter(country -> country.length() > 5)
                .forEach(country -> System.out.println(country));
    }
}
