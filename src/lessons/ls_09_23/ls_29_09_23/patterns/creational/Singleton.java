package lessons.ls_09_23.ls_29_09_23.patterns.creational;

import java.util.Objects;

public class Singleton {
    public static void main(String[] args) {
        HeavyObject john = HeavyObject.getInstance("John", 23);
        System.out.println(john);

        HeavyObject jack = HeavyObject.getInstance("Jack", 31);
        System.out.println(jack);
    }
}

class HeavyObject {
    private String name;
    private int size;

    private static HeavyObject heavyObject;

    private HeavyObject(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public static HeavyObject getInstance(String name, int size) {
        if (Objects.isNull(heavyObject)) {
            heavyObject = new HeavyObject(name, size);
        }

        return heavyObject;
    }

    @Override
    public String toString() {
        return "HeavyObject{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
