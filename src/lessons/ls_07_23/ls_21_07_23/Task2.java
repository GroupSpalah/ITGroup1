package lessons.ls_07_23.ls_21_07_23;

import java.util.HashMap;
import java.util.Map;

/**
 Modify and return the given map as follows: if the key "a" has a value,
 set the key "b" to have that value, and set the key "a" to have the value "".
 Basically "b" is a bully, taking the value and replacing it with the empty string.
 */
public class Task2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        if (map.containsKey("a")) {

            String valueA = map.get("a");

            map.put("b", valueA);
            map.put("a", "");

        }

    }
}


