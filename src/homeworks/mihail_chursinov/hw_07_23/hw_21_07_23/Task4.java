package homeworks.mihail_chursinov.hw_07_23.hw_21_07_23;

import java.util.HashMap;
import java.util.Map;

/**
 * Modify and return the given map as follows: for this problem
 * the map may or may not contain the "a" and "b" keys.
 * If both keys are present, append their 2 string values together
 * and store the result under the key "ab"
 */

public class Task4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        if (map.containsKey("a") && map.containsKey("b")) {
            String value = map.get("a") + map.get("b");
            map.put("ab", value);
        }
    }
}
