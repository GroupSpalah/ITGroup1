package homeworks.anton_gvozdenko.hw_21_07_23;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String,String>  map = new HashMap<>();
        if (map.containsKey("a") && map.containsKey("b") && map.containsKey("c")){
            String valueA = map.get("a");
            map.put("b",valueA);
            map.remove("c");
        }
    }
}
