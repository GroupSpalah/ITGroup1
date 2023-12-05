package homeworks.anton_gvozdenko.hw_01_12_23;

import java.util.Date;

public class NoteBook {
    private String model;
    private String manufacturer;
    private String date;
    private int ram;
    private  int ssd;
    private String cpu;
    private int id;

    public NoteBook(String model, String manufacturer, String date, int ram, int ssd, String cpu, int id) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.date = date;
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDate() {
        return date;
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public String getCpu() {
        return cpu;
    }

    public int getId() {
        return id;
    }
}
