package homeworks.anton_gvozdenko.hw_16_05_23.figures;

public abstract class Figure implements Calculatable {
    private float length;
    private float height;

    public Figure(float length, float height) {
        this.length = length;
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public float getHeight() {
        return height;
    }
}
