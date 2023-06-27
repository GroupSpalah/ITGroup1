package homeworks.mihail_chursinov.hw_06_23.hw_20_06_23.task1;

/**
 * 1) Create class Person with fields firstName(of String type), lastName(String), age(int).
 * Create InvalidAgeException class that is subclass of Exception.
 * App should throw InvalidAgeException when age out of range 1-120 in constructor.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void showAge(int age) {

        try {
            if (age < 1 || age > 120) {
                throw new InvalidAgeException("InvalidAgeException!");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
