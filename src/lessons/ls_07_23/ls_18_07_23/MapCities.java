package lessons.ls_07_23.ls_18_07_23;

import java.util.Map;
import java.util.Set;

/**
 *  В Map<String, Integer> хранить данные(Город, количество улиц) вывести на печать(в отдельных методах):
 *       - названия городов, в которых больше 10 улиц.
 *       - названия городов длина которых больше 5.
 *       - названия городов, которые заканчиваются на определенную букву и количество улиц больше 15.
 */
public class MapCities {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "Kiev", 5,
                "Odessa", 15,
                "Kharkiv", 25
        );

        show3(map);
    }

    /**
     *  *       - названия городов длина которых больше 5.
     */
    public static void show1(Map<String, Integer> map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getKey().length() > 5) {
                System.out.println(entry);
            }
        }
    }

    /**
     *   названия городов, которые заканчиваются на определенную букву и количество улиц больше 15.
     */
    public static void show3(Map<String, Integer> map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getKey().endsWith("v") && entry.getValue() > 15) {
                System.out.println(entry);
            }
        }
    }

    /**
     * - названия городов, в которых больше 10 улиц
     */
    public static void show2(Map<String, Integer> map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > 10) {
                System.out.println(entry);
            }
        }
    }
}
