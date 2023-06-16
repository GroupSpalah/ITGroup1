package homeworks.anton_gvozdenko.hw_16_05_23.figures;

public class Test {
    public static void main(String[] args) {
        Romb romb = new Romb(2F, 2.2F);
        Triangle triangle = new Triangle(3F, 4F);
        Parallelogram parallelogram = new Parallelogram(4F, 5F);
        romb.calculateSquare();
        triangle.calculateSquare();
        parallelogram.calculateSquare();
        romb.print();
        triangle.print();
        parallelogram.print();

    }
}
