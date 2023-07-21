package lessons.ls_07_23.ls_21_07_23;

import java.util.HashMap;
import java.util.Map;

/**
 *
 Given a map of food keys and topping values, modify and return the map as follows:
 if the key "ice cream" is present,
 set its value to "cherry". In all cases, set the key "bread"
 to have the value "butter".
 */
public class Task1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }

        map.put("bread", "butter");
    }
}


