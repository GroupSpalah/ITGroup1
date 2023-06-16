package homeworks.mihail_chursinov.hw_26_05_23;

import java.util.Random;

public abstract class Person {
    private String name;
    private int age;
    public static final Random RANDOM = new Random();
    public static final String[] NAMES = {"Alexander", "Andrey", "Anastasia", "Irina", "Natalya", "Pavel", "Roman",
            "Svetlana", "Sergei", "Tatyana"};

    public Person() {
        int index = RANDOM.nextInt(NAMES.length);
        this.name = NAMES[index];
        this.age = RANDOM.nextInt(20,40);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public abstract String sayHello (Person person);

}
