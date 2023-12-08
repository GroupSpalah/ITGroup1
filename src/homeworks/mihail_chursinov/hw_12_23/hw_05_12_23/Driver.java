package homeworks.mihail_chursinov.hw_12_23.hw_05_12_23;

import java.util.List;

public class Driver {
    int id;
    String firstName;
    String lastName;
    int age;
    String qualification;
    List<Truck> trucks;

    public Driver(int id, String firstName, String lastName, int age, String qualification, List<Truck> trucks) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.qualification = qualification;
        this.trucks = trucks;
    }

    public Driver(int id, String firstName, String lastName, int age, String qualification) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.qualification = qualification;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getQualification() {
        return qualification;
    }

    public List<Truck> getTrucks() {
        return trucks;
    }
}
