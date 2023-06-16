package homeworks.mihail_chursinov.hw_04_04_23;

public class Group {
    private String nameGroup;
    private int amountStudent;

    public Group(String nameGroup, int amountStudent) {
        this.nameGroup = nameGroup;
        this.amountStudent = amountStudent;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public int getAmountStudent() {
        return amountStudent;
    }

    public void showInfoGroup() {
        System.out.println("Name of group:" + "\t" + nameGroup + "," + "\tamount of students:" + "\t" + amountStudent);
    }
}
