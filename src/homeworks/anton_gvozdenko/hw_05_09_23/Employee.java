package homeworks.anton_gvozdenko.hw_05_09_23;
`
public class Employee {
    private String name;
    private Specialisation specialisation;

    public Employee(String name, Specialisation specialisation) {
        this.name = name;
        this.specialisation = specialisation;
    }

    public String getName() {
        return name;
    }

    public Specialisation getSpecialisation() {
        return specialisation;
    }
}
