package homeworks.anton_gvozdenko.hw_05_12_23;

public class Truck {
    private String model;
    private String date;
    private int id;

    public Truck(String model, String date, int id) {
        this.model = model;
        this.date = date;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public String getDate() {
        return date;
    }

    public int getId() {
        return id;
    }
}
