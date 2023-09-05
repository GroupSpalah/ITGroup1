package homeworks.anton_gvozdenko.hw_01_09_23;


import java.util.ArrayList;
import java.util.List;

public class Devices {
   List< SmartLights> smartLights;
   List< SmartWasteBins> smartWasteBins;

    public Devices(List<SmartLights> smartLights, List<SmartWasteBins> smartWasteBins) {
        this.smartLights = new ArrayList<>();
        this.smartWasteBins = new ArrayList<>();
    }

    public List<SmartLights> getSmartLights() {
        return smartLights;
    }

    public List<SmartWasteBins> getSmartWasteBins() {
        return smartWasteBins;
    }
}


