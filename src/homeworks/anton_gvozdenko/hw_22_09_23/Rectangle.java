package homeworks.anton_gvozdenko.hw_22_09_23;

import java.io.Serializable;

public class Rectangle implements Serializable {
    private int length;
    private  int  width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void calculatePerimeter(int length, int width){
        int perimeter = 2 * (length + width);
        System.out.println(perimeter);
    }
    public void calculateArea(int length,int width){
        int area = length*width;
        System.out.println(area);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
