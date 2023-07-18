package lessons.ls_07_23.ls_18_07_23;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearnRecord {
    public static void main(String[] args) {
        Human john = new Human("John", 23);
        Human ben = new Human("Ben", 28);
        Human ann = new Human("Ann", 31);

        Map<Human, Integer> map = Map.of(
                john, 10,
                ben, 14,
                ann, 45
        );

        Set<Map.Entry<Human, Integer>> entries = map.entrySet();

        for (Map.Entry<Human, Integer> entry : entries) {
            Human human = entry.getKey();
//            System.out.println(human.age() + "\t" + human.name() + "\t" + entry.getValue());
        }

        Company it = new Company("IT");

        Man man = new Man("John", 23, it);

        System.out.println(man.age() + "\t" + man.company().name());
    }
}

record Human(String name, int age) {}
record Man(String name, int age, Company company) {}
record Company(String name) {}

class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
