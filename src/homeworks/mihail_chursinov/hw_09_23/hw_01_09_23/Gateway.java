package homeworks.mihail_chursinov.hw_09_23.hw_01_09_23;

import java.util.List;

public record Gateway(Manufacturer manufacturer, String address, List<SmartLight> smartLights,
        List<SmartWasteBins> smartWasteBins) {
}

