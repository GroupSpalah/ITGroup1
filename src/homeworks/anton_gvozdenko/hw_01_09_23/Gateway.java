package homeworks.anton_gvozdenko.hw_01_09_23;

import java.util.List;

public record Gateway(
        Manufacturer manufacturer,
        String address,
        List<SmartLights> smartLights,
        List<SmartWasteBins> smartWasteBins) {
}

