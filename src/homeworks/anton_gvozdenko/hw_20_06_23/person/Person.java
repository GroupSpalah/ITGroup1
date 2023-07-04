package homeworks.anton_gvozdenko.hw_20_06_23.person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void checkAge(int age) throws InvalidAgeException {
        try {
            if (age < 1 || age > 120) {
                throw new InvalidAgeException("age out of range 1-120");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InvalidAgeException {
        checkAge(-1);
    }
}
