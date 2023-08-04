package homeworks.anton_gvozdenko.hw_21_07_23;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        if (map.containsKey("ice cream")){
            String valueA = map.get("ice cream");
            map.put("yogurt",valueA);
        } if (map.containsKey("spinach")){
            map.put("spinach","nuts");
        }
    }
}
