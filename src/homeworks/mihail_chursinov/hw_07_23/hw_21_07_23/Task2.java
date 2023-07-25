package homeworks.mihail_chursinov.hw_07_23.hw_21_07_23;

import java.util.HashMap;
import java.util.Map;

/**
 Given a map of food keys and their topping values, modify and return the map as follows:
 if the key "ice cream" has a value,
 set that as the value for the key "yogurt" also. If the key "spinach" has a value,
 change that value to "nuts"
 */

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        if (map.containsKey("ice cream")) {
            String valueA = map.get("ice cream");
            map.put("yogurt", valueA);
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
    }
}
