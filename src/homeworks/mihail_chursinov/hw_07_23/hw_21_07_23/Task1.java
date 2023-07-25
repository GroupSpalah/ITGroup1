package homeworks.mihail_chursinov.hw_07_23.hw_21_07_23;

import java.util.HashMap;
import java.util.Map;

/**
 * Modify and return the given map as follows: if the key "a" has a value,
 * set the key "b" to have that same value.
 * In all cases remove the key "c", leaving the rest of the map unchanged
 */

public class Task1 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        if (map.containsKey("a")) {

            String valueA = map.get("a");

            map.put("b", valueA);
        }
        map.remove("c");
    }
}
