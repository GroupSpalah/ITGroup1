package homeworks.anton_gvozdenko.hw_04_04_23.studentsInformation;

public class Group {
    private String groupName;
    private int sumOfStudents;

    public Group(String groupNames) {
        this.groupName= groupNames;
    }

    public String getGroupName() {
        return groupName;
    }

    public void showInfo() {
        System.out.println(groupName);
    }
}
