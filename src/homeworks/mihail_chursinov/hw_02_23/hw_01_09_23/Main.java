package homeworks.mihail_chursinov.hw_02_23.hw_01_09_23;
/**
 * Smart city management
 * <p>
 * Following years of analysis, feasibility studies, pre-planning and planning,
 * the mayor's office is ready to start a smart city pilot. You are part of the company that must do the implementation.
 * The pilot is looking to add two types of devices: "smart waste bins" and "smart lights"
 * <p>
 * The devices all come from different manufacturers, have different model names, serial
 * numbers, number of months they are in warranty and a connection status (connected,
 * warning or error). The devices don't connect to the internet directly, but rather through a
 * gateway. The gateway has a manufacturer, an address and a list of devices associated
 * with it. A device can only be associated with a gateway if it is from the same
 * manufacturer.
 * <p>
 * There are two types of smart lights:
 * <p>
 * LED Street Lights, that have a power of 150W
 * <p>
 * Halogen Street Lights, with a power of 200W
 * <p>
 * A waste bin may or may not have a compactor As part of general reporting,
 * the city is also interested in getting the following data:
 * <p>
 * How many devices are installed across all gateways?.
 * What are the devices that have an error in their connection status?
 * Подсчитать кол-во Ватт потребляемых всеми устройствами.
 */

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SmartLight light1 = new SmartLight(new Device("Light 1", 123, Manufacturer.LG,
                Status.CONNECTED, 12), 150);
        SmartLight light2 = new SmartLight(new Device("Light 2", 124, Manufacturer.SAMSUNG,
                Status.ERROR, 10), 200);
        SmartLight light3 = new SmartLight(new Device("Light 3", 22, Manufacturer.APPLE,
                Status.CONNECTED, 11), 120);

        SmartWasteBins bin1 = new SmartWasteBins(new Device("Bin 1", 111,
                Manufacturer.LG, Status.WARNING, 24), true);
        SmartWasteBins bin2 = new SmartWasteBins(new Device("Bin 2", 112,
                Manufacturer.APPLE, Status.ERROR, 15), false);

        Gateway gateway1 = new Gateway(Manufacturer.LG, "Address 1", List.of(light1), List.of(bin2));
        Gateway gateway2 = new Gateway(Manufacturer.SAMSUNG, "Address 2", List.of(light2), List.of(bin1));

        List<Gateway> gateways = List.of(gateway1, gateway2);

        DeviceService deviceService = new DeviceService(gateways);

        long sumDevices = deviceService.getSumDevices();
        long devicesWithError = deviceService.getSumDevicesWithError();
        long totalWatt = deviceService.getSumWatt();

        System.out.println("Total devices: " + sumDevices);
        System.out.println("Devices with error: " + devicesWithError);
        System.out.println("Total watt consumption: " + totalWatt + "W");
    }
}




