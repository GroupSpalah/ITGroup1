package homeworks.anton_gvozdenko.hw_01_09_23;


import java.util.List;

public class PilotProject {
    public static void main(String[] args) {
        SmartLights smartLights = new SmartLights("LampGalogen", 11, Manufacturer.LG
                , ConnectionStatus.ERROR, 2, 150);
        SmartLights smartLights1 = new SmartLights("LampDiod", 2, Manufacturer.APPLE
                , ConnectionStatus.CONNECTED, 3, 200);
        SmartWasteBins smartWasteBins = new SmartWasteBins("Bin", Manufacturer.SAMSUNG, 5,
                5
                , true, ConnectionStatus.WARNING);
List<SmartLights> device= List.of(smartLights,smartLights1);
List<SmartWasteBins> smartWasteBins1 = List.of(smartWasteBins);
        Gateway gateway = new Gateway(Manufacturer.LG, "New York");
        gateway.addSmartBins(smartWasteBins);
        gateway.addSmartLights(smartLights);
        gateway.addSmartLights(smartLights1);
              findDeviceWithError();
    }


    public static void findDeviceWithError(List<Devices> devices){
        devices
                .stream()
                .filter(dev -> dev.smartLights.getConnectionStatus() == ConnectionStatus.ERROR)
                .forEach(System.out::println);
    }
}
