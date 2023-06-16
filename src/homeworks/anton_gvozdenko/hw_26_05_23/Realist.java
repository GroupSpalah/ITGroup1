package homeworks.anton_gvozdenko.hw_26_05_23;

public class Realist extends Person {

    public String sayHello(Person person) {
        int age = person.getAge();
        String name = person.getName();
        if (age <= age + 5) {
            return "Hi " + name + "!";
        } else {
             return "Hello\t " + name + "!";
        }
    }
    public void tellAboutMyself() {
        System.out.println("My name is " + getName() + "\tI am " +
                getAge() + " I am ");
    }
}

