package lessons.homeworks.anton_gvozdenko.hw_20_06_23.Area;

public class Area {
    public static int squareRectangle(int a, int b) throws IllegalArgumentException {

        try {
            if (a < 1 || b < 1) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return a * b;
    }

    public static int trySquareRectangle(int a, int b) {
        if (a < 1 || b < 1) {
            System.out.println(-1);
        } else System.out.println(squareRectangle(a, b));
        return 0;
    }

    public static void main(String[] args) throws IllegalArgumentException {
        squareRectangle(-1, 3);
        trySquareRectangle(-1, 2);
    }
}





