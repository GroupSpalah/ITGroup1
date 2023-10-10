package lessons.ls_10_23.ls_10_10_23;

public class Fabric {
    public static void main(String[] args) {
        CarCreator carCreator = new ItalyCarCreator();
    }
}

interface SomeCar {
    String getModel();
}

interface CarCreator {
    SomeCar getCar(String model);
}

class RealCarCreator implements CarCreator {
    @Override
    public SomeCar getCar(String model) {
        return switch (model) {
            case "Bmw" -> new Bmw();
            case "Mercedes" -> new Mercedes();
            default -> new Bmw();
        };
    }
}

class ItalyCarCreator implements CarCreator {
    @Override
    public SomeCar getCar(String model) {
        return switch (model) {
            case "Bmw" -> new Bmw();
            case "Mercedes" -> new Mercedes();
            default -> new Bmw();
        };
    }
}

class Bmw implements SomeCar {
    @Override
    public String getModel() {
        return "Bmw";
    }
}

class Mercedes implements SomeCar {
    @Override
    public String getModel() {
        return "Mercedes";
    }
}
