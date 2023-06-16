package homeworks.anton_gvozdenko.hw_04_03_23;

public class Figures {
    public int sum(int triangleCorner, int rhombusCorner) {
        if (triangleCorner > 0 && rhombusCorner < 10000) {
        }
        return triangleCorner * 3 + (rhombusCorner * 4);
    }

}

class FiguresResult {
    public static void main(String[] args) {
        Figures figure = new Figures();
        System.out.println(figure.sum(5, 10));

    }

}





