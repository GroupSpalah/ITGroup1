package homeworks.mihail_chursinov.hw_09_23.hw_22_09_23;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Rectangle implements Serializable {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateSquare() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
