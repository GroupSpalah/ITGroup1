package homeworks.anton_gvozdenko.hw_26_05_23;

import java.util.Random;

public abstract class Person {
    private String name;
    private int age;

    public static final Random RANDOM = new Random();

    public static final String[] NAMES = {
            "Pavel",
            "Igor",
            "Alex",
            "Andrew",
            "Miha",
            "Antonio"
    };

    public Person() {

        int index = RANDOM.nextInt(NAMES.length);//0-2

        this.name = NAMES[index];
        this.age = RANDOM.nextInt(20, 40);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String sayHello(Person person);

}
