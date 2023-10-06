package lessons.ls_10_23.ls_06_10_23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Decorator {
    public static void main(String[] args) throws FileNotFoundException {//["Hello!"]
        Printable realPrinter = new RealPrinter("Hello!");
        Printable rightBracket = new RightBracket(realPrinter);
        Printable leftBracket = new LeftBracket(rightBracket);

//        leftBracket.print();

        new LeftBracket(new LeftReshetka(new RightBracket(new RealPrinter("Hello!")))).print();

//        new BufferedReader(new FileReader(""));
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
        System.out.print(text);//Hello!
    }
}

class LeftBracket implements Printable {
    private Printable printable;

    public LeftBracket(Printable printable) {//RightBracket
        this.printable = printable;
    }

    @Override
    public void print() {
        System.out.print("[");
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
        printable.print();//Hello!]
        System.out.print("]");
    }
}

class LeftReshetka implements Printable {
    private Printable printable;

    public LeftReshetka(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        System.out.print("#");
        printable.print();
    }
}
