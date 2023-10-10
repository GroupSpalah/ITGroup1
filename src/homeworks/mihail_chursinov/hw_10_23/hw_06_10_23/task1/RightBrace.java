package homeworks.mihail_chursinov.hw_10_23.hw_06_10_23.task1;

public class RightBrace implements Printable {
    private Printable printable;

    public RightBrace(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        printable.print();
        System.out.print("}");
    }
}
