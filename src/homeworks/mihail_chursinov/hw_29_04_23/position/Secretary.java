package homeworks.mihail_chursinov.hw_29_04_23.position;

public class Secretary extends Position{
    private boolean isTrainee;

    public Secretary(int age, String lastName, String firstName, String middleName, boolean isTrainee) {
        super(age, lastName, firstName, middleName);
        this.isTrainee = isTrainee;
    }
}
