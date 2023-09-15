package homeworks.anton_gvozdenko.hw_05_09_23;

public class Patient {
    private String name;
    private int idNumber;

    private boolean isLoyalty;

    public Patient(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public void setLoyalty(boolean loyalty) {
        isLoyalty = loyalty;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void add(Patient patient) {
        patient.add(patient);
    }
}

