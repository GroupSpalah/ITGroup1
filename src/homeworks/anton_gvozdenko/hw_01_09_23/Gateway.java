package homeworks.anton_gvozdenko.hw_01_09_23;

import java.util.ArrayList;
import java.util.List;

public class Gateway {
    private Manufacturer manufacturer;
    private String address;
    private List<SmartLights> smartLights;
    private List<SmartWasteBins> smartWasteBins;

    public Gateway(Manufacturer manufacturer, String address) {
        this.manufacturer = manufacturer;
        this.address = address;
        smartLights = new ArrayList<>();
        smartWasteBins = new ArrayList<>();
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public String getAddress() {
        return address;
    }
    public void addSmartLights(SmartLights smartLights) {
      if ( smartLights.getManufacturer() == this.manufacturer){
              getSmartLights().add(smartLights);
    }
    }
    public void addSmartBins(SmartWasteBins smartWasteBins) {
        if (smartWasteBins.getManufacturer() == this.manufacturer){
            getSmartWasteBins().add(smartWasteBins);
        }

        }
    public List<SmartLights> getSmartLights() {
        return smartLights;
    }

    public List<SmartWasteBins> getSmartWasteBins() {
        return smartWasteBins;
    }
    }

