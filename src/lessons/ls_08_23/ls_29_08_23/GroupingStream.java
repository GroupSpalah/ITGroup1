package lessons.ls_08_23.ls_29_08_23;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingStream {
    public static void main(String[] args) {
        List<SortMan> men = new LinkedList<>(List.of(
                new SortMan(30, "Jack"),
                new SortMan(30, "Jack"),
                new SortMan(21, "Ann"),
                new SortMan(19, "Bob")
        ));

/*        Map<Integer, List<SortMan>> map = men
                .stream()
                .collect(Collectors.groupingBy(m -> m.getAge() % 2));  */

        /*Map<Integer, List<SortMan>> map = men
                .stream()
                .collect(Collectors.groupingBy(m -> m.getAge()));*/

       /* Map<Integer, Long> map = men
                .stream()
                .collect(Collectors.groupingBy(m -> m.getAge(), Collectors.counting()));*/
/*
        Map<GroupMan, List<SortMan>> map = men
                .stream()
                .collect(Collectors.groupingBy(m -> new GroupMan(m.getName(), m.getAge())));*/

        Map<GroupMan, List<SortMan>> map = men
                .stream()
                .collect(Collectors.groupingBy(m -> new GroupMan(m.getName(), m.getAge())));

        map
                        .entrySet()
                                .stream()
                                        .filter(e -> e.getValue().size() > 1)
                                                .forEach(m -> System.out.println(m));

//        System.out.println(map);
    }
}

record GroupMan(String name, int age) {

}
