package lessons.ls_07_23.ls_11_07_23;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class RemoveElements {
    public static void main(String[] args) {
        List<Integer> lList = new LinkedList<>();

        lList.add(5);
        lList.add(8);
        lList.add(10);
        lList.add(11);

        lList.remove(1);

//        System.out.println(lList);

        /*for (Integer value : lList) {
            lList.remove(1);
        }*/

        Iterator<Integer> iterator = lList.iterator();

        while (iterator.hasNext()) {
            Integer element = iterator.next();

            if (element == 10) {
                iterator.remove();
            }
        }

//        new CopyOnWriteArrayList()

    }
}
