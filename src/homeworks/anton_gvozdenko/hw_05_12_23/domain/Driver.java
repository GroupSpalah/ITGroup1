package homeworks.anton_gvozdenko.hw_05_12_23.domain;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private Qualification qualification;
    List<Truck> trucks;

    public Driver(int id, String firstName, String lastName, int age, Qualification qualification) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.qualification = qualification;
        this.trucks = new ArrayList<>();
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

    public Qualification getQualification() {
        return qualification;
    }

    public List<Truck> getTrucks() {
        return trucks;
    }
}
