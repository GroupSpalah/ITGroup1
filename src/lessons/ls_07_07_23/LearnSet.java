package lessons.ls_07_07_23;

import java.util.*;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(5);
        set.add(7);
        set.add(8);
        set.add(5);

//        System.out.println(set);

        Set<Integer> lSet = new LinkedHashSet<>();

        List<Integer> values = new ArrayList<>();

        values.add(5);
        values.add(7);
        values.add(9);
        values.add(5);
        values.add(1);
        values.add(5);

        List<Integer> listWithoutDuplications = new ArrayList<>();

        for (Integer value : values) {
            if (!listWithoutDuplications.contains(value)) {
                listWithoutDuplications.add(value);
            }
        }

//        System.out.println(listWithoutDuplications);

        Set<Integer> newSet = new LinkedHashSet<>();

        for (Integer value : values) {
            newSet.add(value);
        }

//        System.out.println(newSet);

        Set<Integer> set2 = new HashSet<>(values);

        System.out.println(set2);
    }
}
