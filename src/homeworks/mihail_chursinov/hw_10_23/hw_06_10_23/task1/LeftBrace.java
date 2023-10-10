package homeworks.mihail_chursinov.hw_10_23.hw_06_10_23.task1;

public class LeftBrace implements Printable{
    private Printable printable;

    public LeftBrace(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        System.out.print("{");
        printable.print();
    }
}
