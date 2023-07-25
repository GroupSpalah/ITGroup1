package homeworks.anton_gvozdenko.hw_21_07_23;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        if (map.containsKey("a") && map.containsKey("b")) {
            String valueA = map.get("a");
            String valueB = map.get("b");
           map.put("ab", valueA + valueB);
        }
    }
}