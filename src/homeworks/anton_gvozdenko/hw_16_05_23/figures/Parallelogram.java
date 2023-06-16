package homeworks.anton_gvozdenko.hw_16_05_23.figures;

import homeworks.anton_gvozdenko.hw_16_05_23.figures.Figure;

public class Parallelogram extends Figure {
    public Parallelogram(float length, float height) {
        super(length, height);
    }

    @Override
    public double calculateSquare() {
        return getHeight() * getLength();
    }

    @Override
    public void print() {
        System.out.println("Parallelogram");
    }
}
