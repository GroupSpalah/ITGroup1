package homeworks.mihail_chursinov.hw_07_23.hw_21_07_23;

import java.util.HashMap;
import java.util.Map;

/**
 Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value,
 set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".
 */

public class Task5 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        if (map.containsKey("potato")) {
            String valueA = map.get("potato");
            map.put("fries", valueA);
        }
        if (map.containsKey("salad")) {
            String valueB = map.get("salad");
            map.put("spinach", valueB);
        }
    }
}
