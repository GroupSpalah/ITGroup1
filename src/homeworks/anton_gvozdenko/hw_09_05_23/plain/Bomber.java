package homeworks.anton_gvozdenko.hw_09_05_23.plain;

public class Bomber extends Plain {
    public Bomber(String brand, String model, int maxSpeed, int maxHeight, int createPrice) {
        super(brand, model, maxSpeed, maxHeight);

    }

    @Override
    public int createPrice() {
        return (getMaxSpeed() * 100 + getMaxHeight() * 100) * 2;
    }


}
