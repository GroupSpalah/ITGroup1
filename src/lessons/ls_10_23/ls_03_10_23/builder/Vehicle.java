package lessons.ls_10_23.ls_03_10_23.builder;

public class Vehicle {
    private Transmission transmission;
    private String name;
    private int maxSpeed;

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "transmission=" + transmission +
                ", name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public static VehicleBuilder getBuilder() {
        return new VehicleBuilder();
    }

    public static class VehicleBuilder {
        private Vehicle vehicle;

        private VehicleBuilder() {
            vehicle = new Vehicle();
        }

        public VehicleBuilder buildName(String name) {
            vehicle.setName(name);
            return this;
        }

        public VehicleBuilder buildMaxSpeed(int maxSpeed) {
            vehicle.setMaxSpeed(maxSpeed);
            return this;
        }

        public VehicleBuilder buildTransmission(Transmission transmission) {
            vehicle.setTransmission(transmission);
            return this;
        }

        public Vehicle build() {
            return vehicle;
        }
    }
}



class TestBuilder {
    public static void main(String[] args) {
        Vehicle bmw = Vehicle.getBuilder()
                .buildName("Bmw")
                .buildTransmission(Transmission.AUTO)
                .buildMaxSpeed(220)
                .build();

        Vehicle bmwShort = Vehicle.getBuilder()
                .buildName("Bmw")
                .buildMaxSpeed(220)
                .build();

        Vehicle bmwShort1 = Vehicle.getBuilder()
                .buildMaxSpeed(220)
                .buildTransmission(Transmission.AUTO)
                .build();
    }
}
