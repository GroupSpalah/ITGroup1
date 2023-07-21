package lessons.ls_07_23.ls_21_07_23;

import java.util.HashMap;
import java.util.Map;

/**
 Modify and return the given map as follows:
 if the keys "a" and "b" are both in the map and have equal values, remove them both.
 */
public class Task3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        if (map.containsKey("a") && map.containsKey("b")) {

            String valueA = map.get("a");
            String valueB = map.get("b");

            if (valueB.equals(valueA)) {
                map.remove("a");
                map.remove("b");
            }
        }
    }
}


