package homeworks.mihail_chursinov.hw_07_23.hw_21_07_23;

import java.util.HashMap;
import java.util.Map;

/**
 Modify and return the given map as follows: if
 exactly one of the
 keys "a" or "b" has a value in the map (but not both),
 set the other to have that same value in the map.
 */

public class Task3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        } else if (!map.containsKey("a") && map.containsKey("b")) {
            map.put("a", map.get("b"));
        }
    }
}
