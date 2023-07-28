package lessons.ls_07_23.ls_28_07_23;

import java.util.*;

public class Notebook {
    public static void main(String[] args) {
        Map<String, String> map = Map.of(
                "067", "Petro",
                "068", "Petro",
                "073", "John",
                "063", "John"
        );

        Map<String, List<String>> notebook = createNotebook(map);

        System.out.println();
    }

    public static Map<String, List<String>> createNotebook(Map<String, String> map) {
        Map<String, List<String>> temp = new HashMap<>();

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getValue();
            String value = entry.getKey();

            if (temp.containsKey(key)) {
                List<String> list = temp.get(key);
                list.add(value);
            } else {
                temp.put(key, new ArrayList<>(List.of(value)));
            }
        }

        return temp;

    }
}
