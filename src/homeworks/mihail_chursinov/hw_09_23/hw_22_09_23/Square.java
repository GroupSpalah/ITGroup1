package homeworks.mihail_chursinov.hw_09_23.hw_22_09_23;

public class Square extends Rectangle {
    private double side;

    public Square(double length, double width, double side) {
        super(length, width);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public double calculateSquare() {
        return side * side;
    }
}
