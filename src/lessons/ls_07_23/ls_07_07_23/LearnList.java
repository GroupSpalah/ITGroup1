package lessons.ls_07_23.ls_07_07_23;

import java.util.*;

public class LearnList {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();

        values.add(5);
        values.add(7);
        values.add(9);

//        values.remove(0);

//        System.out.println(values);

        List<Integer> lList = new LinkedList<>();

        lList.add(5);//Node
        lList.add(8);
        lList.add(10);

//        System.out.println(lList);

        for (int i = 0; i < values.size(); i++) {
            Integer element = values.get(i);

//            System.out.println(element);
        }

        for (Integer value : values) {
//            System.out.println(value);
        }

        Iterator<Integer> iterator = values.iterator();

        while (iterator.hasNext()) {
//            Integer value = iterator.next();
        }

        Integer[] array = {4, 7, 9};

        List<Integer> list = Arrays.asList(array);

    }
}
