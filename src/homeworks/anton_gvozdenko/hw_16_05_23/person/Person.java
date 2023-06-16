package homeworks.anton_gvozdenko.hw_16_05_23.person;

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
        System.out.println("First name = " + firstName);
    }

    public void print(String firstName, String lastName) {
        System.out.println("First name = " + firstName + "\tLast name = " + lastName);
    }

    public void print(String lastName, String firstName, int age) {
        System.out.println("First name = " + firstName + "\tLast name = " + lastName + "\tAge = " + age);
    }

    public void print(int age) {
        System.out.println("Age = " + age);
    }

    public void print(Gender gender) {
        System.out.println("Gender = " + gender);
    }
}
