package lessons.ls_09_23.ls_29_09_23.patterns.behavoiral;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Strategy {
    public static void main(String[] args) {
        Sortable right = new RightSorting();
        Sortable reverse = new ReverseSorting();

        StrategyClient strategyClient = new StrategyClient(reverse);

        List<Integer> list = new LinkedList<>(List.of(4, -9, 6, -3, 2));

        strategyClient.executeSorting(list);
    }
}

class StrategyClient {
    private Sortable sortable;

    public StrategyClient(Sortable sortable) {
        this.sortable = sortable;
    }

    public void executeSorting(List<Integer> values) {
        sortable.sort(values);
        System.out.println(values);
    }
}

interface Sortable {
    void sort(List<Integer> values);
}

record RightSorting() implements Sortable {
    @Override
    public void sort(List<Integer> values) {
        Collections.sort(values);
    }
}

record ReverseSorting() implements Sortable {
    @Override
    public void sort(List<Integer> values) {
        Comparator<Integer> comparator = Integer::compare;
        values.sort(comparator.reversed());
    }
}
