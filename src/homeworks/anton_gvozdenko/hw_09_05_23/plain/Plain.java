package homeworks.anton_gvozdenko.hw_09_05_23.plain;

public class Plain {

    private String brand;
    private String model;
    private int maxSpeed;
    private int maxHeight;

    public Plain(String brand, String model, int maxSpeed, int maxHeight) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxHeight = maxHeight;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int createPrice() {
        return maxSpeed * 100 + maxHeight * 100;
    }

    public void showInfo() {
        System.out.println("Brand = " + brand + "\tModel = " + model + "\tSpeed = " + maxSpeed + "\tHeight = " + maxHeight
                + "\tPrice = " + createPrice());
    }
}
