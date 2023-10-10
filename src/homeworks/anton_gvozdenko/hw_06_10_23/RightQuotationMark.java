package homeworks.anton_gvozdenko.hw_06_10_23;

public class RightQuotationMark implements Printable {
    private Printable printable;
    public RightQuotationMark(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        printable.print();
        System.out.print("\"");

    }
}
