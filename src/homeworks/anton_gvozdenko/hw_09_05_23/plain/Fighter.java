package homeworks.anton_gvozdenko.hw_09_05_23.plain;

public class Fighter extends Plain {
    public Fighter(String brand, String model, int maxSpeed, int maxHeight, int createPrice) {
        super(brand, model, maxSpeed, maxHeight);
    }

    @Override
    public int createPrice() {
        return (getMaxSpeed() * 100 + getMaxHeight() * 100) * 3;
    }
}
