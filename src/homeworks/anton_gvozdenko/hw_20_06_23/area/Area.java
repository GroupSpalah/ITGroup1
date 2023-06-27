package homeworks.anton_gvozdenko.hw_20_06_23.area;

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
            return -1;
        } else {
            return squareRectangle(a, b);
        }
    }

    public static void main(String[] args) throws IllegalArgumentException {
        trySquareRectangle(-1, 2);
    }
}





