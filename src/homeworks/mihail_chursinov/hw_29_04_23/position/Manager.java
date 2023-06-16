package homeworks.mihail_chursinov.hw_29_04_23.position;

public class Manager extends Position{
    private boolean isTop;

    public Manager(int age, String lastName, String firstName, String middleName, boolean isTop) {
        super(age, lastName, firstName, middleName);
        this.isTop = isTop;
    }
}
