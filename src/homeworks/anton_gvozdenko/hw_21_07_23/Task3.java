package homeworks.anton_gvozdenko.hw_21_07_23;


import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        if (map.containsKey("a") && map.containsKey("b")) {
            String value = map.get("a");
            if (map.containsValue(value)) {
                map.put("c", value);
            }

        }
    }
}
