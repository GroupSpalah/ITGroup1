package homeworks.anton_gvozdenko.hw_16_05_23.person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("John", "Johnson", 22, Gender.MALE, 1234);
        person.print(22);
        person.print(Gender.FEMALE);
        person.print("John");
        person.print("Johnson", "John", 30);
    }
}
