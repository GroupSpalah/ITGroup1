package homeworks.anton_gvozdenko.hw_05_09_23;

public class Patient {
    private String name;
    private int idNumber;

    public Patient(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }
}
