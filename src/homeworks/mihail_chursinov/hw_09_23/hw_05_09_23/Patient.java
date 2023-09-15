package homeworks.mihail_chursinov.hw_09_23.hw_05_09_23;

public class Patient {
    private String name;
    private int id;
    private boolean isLoyalty;

    public Patient(String name, int id, boolean isLoyalty) {
        this.name = name;
        this.id = id;
        this.isLoyalty = isLoyalty;
    }

    public void setLoyalty(boolean loyalty) {
        isLoyalty = loyalty;
    }
}
