package homeworks.anton_gvozdenko.hw_04_04_23.studentsInformation;

public class University {
    private String univerName;
    private int sumOfGroup;
    private String foundingDate;

    public University(String univerName) {
        this.univerName = univerName;
    }

    public String getUnName() {
        return univerName;
    }

    public void showInfo() {
        System.out.println("Name of University = " + univerName);

    }
}
