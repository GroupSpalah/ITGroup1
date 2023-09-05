package homeworks.anton_gvozdenko.hw_01_09_23;

import java.util.List;

public class DeviceService {

    private List<Gateway> gateways;

    public DeviceService() {
    }

    public long getSumDevices() {
        long countBins = gateways
                .stream()
                .flatMap(g -> g.smartWasteBins().stream())
                .count();

        long countLights = gateways
                .stream()
                .flatMap(g -> g.smartLights().stream())
                .count();

        return countBins + countLights;

    }

    public long getSumDevicesWithError() {
        long countBins = gateways
                .stream()
                .flatMap(g -> g.smartWasteBins().stream())
                .filter(d -> d.device().status() == ConnectionStatus.ERROR)
                .count();

        long countLights = gateways
                .stream()
                .flatMap(g -> g.smartLights().stream())
                .filter(d -> d.device().status() == ConnectionStatus.ERROR)
                .count();

        return countBins + countLights;

    }

    public long getSumWatt() {

        return gateways
                .stream()
                .flatMap(g -> g.smartLights().stream())
                .mapToInt(SmartLights::power)
                .sum();
    }
}
