package homeworks.anton_gvozdenko.hw_06_10_23;

import java.io.FileNotFoundException;

public class Decorator {
    public static void main(String[] args) throws FileNotFoundException {
        Printable realPrinter = new RealPrinter("Hello");
        Printable rightComAt = new LeftCommercialAt(realPrinter);
        Printable leftCommercialAt = new RightCommercialAt(rightComAt);
        Printable rightBracket = new RightBracket(realPrinter);
        Printable leftBracket = new LeftBracket(rightBracket);

        new LeftCommercialAt(new LeftBracket(new LeftQuotationMark(new RightCommercialAt(
                (new RightBracket(new RightQuotationMark(
                        (new RealPrinter("Hello"))))))))).print();
    }
}

interface Printable {
    void print();
}

class RealPrinter implements Printable {
    private String text;
    public RealPrinter(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.print(text);
    }
}

class LeftBracket implements Printable {
    private Printable printable;

    public LeftBracket(Printable printable) {
        this.printable = printable;
    }
    @Override
    public void print() {
        System.out.print("{");
        printable.print();
    }
}

class RightBracket implements Printable {
    private Printable printable;
    public RightBracket(Printable printable) {//RealPrinter
        this.printable = printable;
    }

    @Override
    public void print() {
        printable.print();
        System.out.print("}");
    }
}

class LeftQuotationMark implements Printable {
    private Printable printable;

    public LeftQuotationMark(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        System.out.print("\"");
        printable.print();

    }
}
