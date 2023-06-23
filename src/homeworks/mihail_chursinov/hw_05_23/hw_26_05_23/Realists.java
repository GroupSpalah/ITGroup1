package homeworks.mihail_chursinov.hw_05_23.hw_26_05_23;

/**
 * Реалисты) Если возраст собеседника меньше или равен или больше не
 * более чем на 5 лет, говорит «Привет, <имя>!», иначе «Здравствуй,
 * <имя>».
 */

public class Realists extends Person {
    public String sayHello(Person person) {
        int age = person.getAge();
        String name = person.getName();
        if (age <= age + 5) {
            return "Hello, " + name;
        } else {
            return "Good afternoon, " + name;
        }
    }

    public void tellHimself() {
        System.out.println("Hello, my name is " + getName() + "\tI am " + getAge() + "\tyears old");
    }
}
