package homeworks.mihail_chursinov.hw_09_23.hw_05_09_23;

public class Patient {
    private String name;
    private int ID;
    private boolean isLoyalty;

    public Patient(String name, int ID, boolean isLoyalty) {
        this.name = name;
        this.ID = ID;
        this.isLoyalty = isLoyalty;
    }

    public void setLoyalty(boolean loyalty) {
        isLoyalty = loyalty;
    }
}
