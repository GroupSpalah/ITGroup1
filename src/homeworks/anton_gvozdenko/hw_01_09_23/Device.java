package homeworks.anton_gvozdenko.hw_01_09_23;


public record Device(String name,
                     int serialNumber,
                     Manufacturer manufacturer,
                     ConnectionStatus status,
                     int warrantyMonths) {

}


