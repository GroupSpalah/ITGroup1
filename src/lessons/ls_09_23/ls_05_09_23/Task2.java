package lessons.ls_09_23.ls_05_09_23;

import java.util.Map;
import java.util.stream.Stream;

/**
 * Let the key of Map is project name and value contains list of participants.
 * Create a Stream<String> nameList(Map<String, Stream<String>> map) method of
 * the MyUtils class to build sorted stream of all participants without duplication.
 * Please ignore null or empty strings, extra spaces and case sensitivity.
 * Throw NullPointerException if map is null.
 * For example, for a given map
 * {"Desktop"=[" iVan", "PeTro ", " Ira "], "Web"=["STepan", "ira ", " Andriy ", "an na"], "Spring"=["Ivan", "Anna"]}
 * you should get
 * ["Andriy", "Anna", "Ira", "Ivan", "Petro ", "Stepan"]
 */
public class Task2 {
    public static void main(String[] args) {
        Map<String, Stream<String>> map = Map.of(
                "Desktop", Stream.of(" iVan", "PeTro ", " Ira "),
                "Web", Stream.of("STepan", "ira ", " Andriy ", "an na"),
                "Spring", Stream.of("Ivan", "Anna")
        );

        map
                .values()
                .stream()
                .flatMap(value -> value)//Stream<String>
                .map(str -> {
                    String temp = str.toLowerCase().replaceAll(" ", "");

                    String firstSymbol = String.valueOf(temp.charAt(0)).toUpperCase();

                    String otherStr = temp.substring(1);

                    return firstSymbol.concat(otherStr);
                })
                .distinct()
                .forEach(System.out::println);

    }
}
