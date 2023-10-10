package homeworks.mihail_chursinov.hw_10_23.hw_06_10_23.task1;

public class Test {
    public static void main(String[] args) {
        Printable realPrintable = new RealPrinter("Hello");
        Printable leftBrace = new LeftBrace(realPrintable);
        Printable rightBrace = new RightBrace(leftBrace);
        Printable leftDog = new LeftDog(rightBrace);
        Printable rightDog = new RightDog(leftDog);

        rightDog.print();

//        new RightDog(new LeftDog(new LeftBrace(new RightBrace(new RealPrinter("Hello"))))).print();
    }
}
