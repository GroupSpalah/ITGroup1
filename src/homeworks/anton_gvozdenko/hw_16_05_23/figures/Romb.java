package homeworks.anton_gvozdenko.hw_16_05_23.figures;

public class Romb extends Figure {
    public Romb(float length, float height) {
        super(length, height);
    }

    @Override
    public double calculateSquare() {
        return getHeight() * getLength();
    }

    @Override
    public void print() {
        System.out.println("Rhombus");
    }
}
