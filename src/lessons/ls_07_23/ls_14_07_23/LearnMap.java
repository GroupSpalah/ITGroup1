package lessons.ls_07_23.ls_14_07_23;

import java.util.*;

public class LearnMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        Map<Integer, List<String>> map1 = new HashMap<>();
        Map<Integer, Set<String>> map2 = new HashMap<>();
        Map<Integer, Queue<String>> map3 = new HashMap<>();

        map.put(1, "One");//key and value are converting to Node object
        map.put(2, "Two");
//        map.put(1, "Three");

        String valueOne = map.get(1);

//        System.out.println(valueOne);

        Set<Integer> keys = map.keySet();

//        System.out.println(keys);

        Collection<String> values = map.values();

//        System.out.println(values);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
        }
    }
}
