package homeworks.mihail_chursinov.hw_10_23.hw_03_10_23.task1;

public abstract class AbstractFigure {
    private void createRectangle() {
        System.out.println(" \n" +
                "          *\n" +
                "         ***\n" +
                "        *****\n" +
                "       *******\n" +
                "      *********");
    }

    public abstract void createAnotherFigure();

    public final void createFigure() {
        createRectangle();
        createAnotherFigure();
        createRectangle();
    }
}
