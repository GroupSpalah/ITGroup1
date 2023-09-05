package homeworks.anton_gvozdenko.hw_01_09_23;

public class SmartWasteBins {
    private String name;
    private Manufacturer manufacturer;
    private int serialNumber;
    private int warrantyMonths;
    private boolean isHasCompactor;
    private ConnectionStatus connectionStatus;

    public SmartWasteBins(String name, Manufacturer manufacturer, int serialNumber,
                          int warrantyMonths, boolean isHasCompactor, ConnectionStatus connectionStatus) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.warrantyMonths = warrantyMonths;
        this.isHasCompactor = isHasCompactor;
        this.connectionStatus = connectionStatus;
    }

    public String getName() {
        return name;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public boolean isHasCompactor() {
        return isHasCompactor;
    }

    public ConnectionStatus getConnectionStatus() {
        return connectionStatus;
    }
}
