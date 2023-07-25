package homeworks.mihail_chursinov.hw_07_23.hw_21_07_23;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
 * and the value is that string's length.
 */

public class Task6 {
    public static void main(String[] args) {
        String[] strings = new String[5];

        Map<String, Integer> map = new HashMap<>();

        for (String string : strings) {
            map.put(string, string.length());
        }

        System.out.println(map);
    }
}
