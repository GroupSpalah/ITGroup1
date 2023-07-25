package homeworks.anton_gvozdenko.hw_21_07_23;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        if (map.containsKey("potato") && map.containsKey("fries")){
            String valuePotato = map.get("potato");
            map.put("fries",valuePotato);
        } if (map.containsKey("salad") && map.containsKey("spinach")){
            String valueSalad = map.get("salad");
            map.put("spinach",valueSalad);
        }
    }
}
