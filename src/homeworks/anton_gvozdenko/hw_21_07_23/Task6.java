package homeworks.anton_gvozdenko.hw_21_07_23;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task6 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        if (map.containsValue("and") && map.containsValue("this") && map.containsValue("that")) {
            String andValue = String.valueOf(map.containsValue("and"));
            String thatValue = String.valueOf(map.containsValue("that"));
            String thisValue = String.valueOf(map.containsValue("this"));
            map.put(andValue.length(), andValue);
            map.put(thatValue.length(), thatValue);
            map.put(thisValue.length(), thisValue);
        }
    }
    }

