package homeworks.anton_gvozdenko.hw_01_09_23;

public class SmartLights {
    private String name;
    private int serialNumber;
    private  Manufacturer manufacturer;
    private ConnectionStatus connectionStatus;
  private int   warrantyMonths;
    private int power;

    public SmartLights(String name, int serialNumber, Manufacturer manufacturer,
                       ConnectionStatus connectionStatus, int warrantyMonths, int power) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.connectionStatus = connectionStatus;
        this.warrantyMonths = warrantyMonths;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public ConnectionStatus getConnectionStatus() {
        return connectionStatus;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public int getPower() {
        return power;
    }
}
