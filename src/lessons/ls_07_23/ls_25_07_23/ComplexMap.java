package lessons.ls_07_23.ls_25_07_23;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ComplexMap {
    public static void main(String[] args) {
        PersonM john1 = new PersonM("John", 23);
        PersonM john2 = new PersonM("John", 23);
        Map<PersonM, String> map = new HashMap<>();
        map.put(john1, "One");
        map.put(john2, "Two");
//        map.put(null, "Two");

        System.out.println(map);

        boolean equals = john1.equals(john2);
    }
}

class PersonM {
    private String name;
    private int age;

    public PersonM(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonM personM = (PersonM) o;
        return age == personM.age && Objects.equals(name, personM.name);
    }

    @Override
    public int hashCode() {
//        return Objects.hash(name, age);
        return 5;
    }

    @Override
    public String toString() {
        return "PersonM{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

/**
 * if (e.hash == hash && (e.key == key || key.equals(e.key)))
 * {
 *     V oldValue = e.value;
 *     e.value = value;
 *
 *     return oldValue;
 * }
 *
 * 1) hashCode not override and equals not override - 2 objects
 * 2) hashCode override and equals override - 1 objects
 * 3) hashCode override and equals not override - 2 objects
 * 4) hashCode not override and equals override - 2 objects
 * 5) hashCode override(return constant value) and equals override - 2 objects
 */
