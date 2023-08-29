package lessons.ls_08_23.ls_29_08_23;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LearnStream2 {
    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>(List.of(7, 8, 5, 3, 6));

        /*integers
                .stream()
                .sorted()
                .forEach(v -> System.out.println(v));*/

        Comparator<Integer> comparator = (v1, v2) -> Integer.compare(v1, v2);

    /*    integers
                .stream()
                .sorted(comparator.reversed())
                .forEach(v -> System.out.println(v));*/

        List<SortMan> men = new LinkedList<>(List.of(
                new SortMan(32, "Jack"),
                new SortMan(30, "Jack"),
                new SortMan(21, "Ann"),
                new SortMan(19, "Bob")
        ));

        Comparator<SortMan> comparatorName = (m1, m2) -> m1.getName().compareTo(m2.getName());
        Comparator<SortMan> comparatorAge = (m1, m2) -> Integer.compare(m1.getAge(), m2.getAge());

   /*     men
                .stream()
                .sorted(comparatorName.thenComparing(comparatorAge))
                .forEach(m -> System.out.println(m));*/

     /*   men
                .stream()
                .forEach(m -> {
                    m.setName(m.getName().concat("Hello"));
                    System.out.println(m);
                });*/

        men
                .stream()
                .peek(m -> m.setName(m.getName().concat("Hello")))
                .forEach(m -> System.out.println(m));


    }
}

class SortMan implements Comparable<SortMan> {

    private String name;
    private int age;

    public SortMan(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SortMan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(SortMan o) {
        return Integer.compare(o.age, this.age);
//        return name.compareTo(o.name);
//        return Integer.compare(name.length(), o.name.length());
    }
}
