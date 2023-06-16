package lessons.inheritance.ls_29_04_23.vehicle;

public class Driver extends Person {
    private int experience;

    public Driver(String lastName, String firstName, String middleName, int age, int experience) {
        super(lastName, firstName, middleName, age);
        this.experience = experience;
    }
}
