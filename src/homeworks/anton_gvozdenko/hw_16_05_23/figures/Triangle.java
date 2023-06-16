package homeworks.anton_gvozdenko.hw_16_05_23.figures;

public class Triangle extends Figure {
    public Triangle(float length, float height) {
        super(length, height);
    }

    @Override
    public double calculateSquare() {
        return 0.5 * getLength() * getHeight();
    }

    @Override
    public void print() {
        System.out.println("Triangle");
    }
}
