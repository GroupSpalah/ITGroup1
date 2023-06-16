package homeworks.mihail_chursinov.hw_16_05_23.task1;

/**
 * 1) Create class Person with fields firstName(String), lastName(String), age(int), gender(enum Gender), phoneNumber(int),
 * and five overloaded methods.
 * Create class that will be use instance of class Person and his methods.
 */

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
    private int phoneNumber;

    public Person(String firstName, String lastName, int age, Gender gender, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public void print(String firstName) {
        System.out.println("First overloaded method!");
    }

    public void print(String firstName, String lastName) {
        System.out.println("Second overloaded method!");
    }

    public void print(String firstName, String lastName, int age) {
        System.out.println("Third overloaded method!");
    }

    public void print(String firstName, String lastName, int age, Gender gender) {
        System.out.println("Fourth overloaded method!");
    }

    public void print(String firstName, String lastName, int age, Gender gender, int phoneNumber) {
        System.out.println("Fifth overloaded method!");
    }
}