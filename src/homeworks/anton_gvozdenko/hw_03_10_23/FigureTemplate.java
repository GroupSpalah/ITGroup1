package homeworks.anton_gvozdenko.hw_03_10_23;

public abstract class FigureTemplate {
    private void addFirstFigure() {
        System.out.println(
                "    *\n" +
                        "   ***\n" +
                        "  *****\n" +
                        " *******\n" +
                        "*********");
    }

    private void addSecondFigure() {
        System.out.println(
                "    *\n" +
                        "   ***\n" +
                        "  *****\n" +
                        " *******\n" +
                        "*********");
        System.out.println();
    }

    public abstract void addNewFigure();

    public final void createFigure() {
        addFirstFigure();
        System.out.println();
        addNewFigure();
        System.out.println();
        addSecondFigure();
        System.out.println("Figure is created");
    }
}

class Triangle extends FigureTemplate {
    @Override
    public void addNewFigure() {
        System.out.println("*********");
    }
}

class Square extends FigureTemplate {
    @Override
    public void addNewFigure() {
        System.out.println(" *******\n" +
                " *******\n" +
                " *******\n" +
                " *******");
    }
}

class Rectangle extends FigureTemplate {

    @Override
    public void addNewFigure() {
        System.out.println("   ***\n" +
                "   ***\n" +
                "**********\n" +
                "**********\n" +
                "   ***\n" +
                "   ***");
    }
}

class Test {
    public static void main(String[] args) {
        FigureTemplate triangle = new Triangle();
        FigureTemplate rectangle = new Rectangle();
        FigureTemplate square = new Square();
        triangle.createFigure();
        square.createFigure();
        rectangle.createFigure();
    }
}
