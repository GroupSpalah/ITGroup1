package homeworks.mihail_chursinov.hw_16_05_23.task3;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram(20, 30);
        Triangle triangle = new Triangle(15, 20);
        Romb romb = new Romb(18, 22);

        System.out.println(parallelogram.calculatable());
        System.out.println(triangle.calculatable());
        System.out.println(romb.calculatable());
    }





}
