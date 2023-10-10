package homeworks.mihail_chursinov.hw_10_23.hw_06_10_23.task1;

public class RealPrinter implements Printable{
    private String text;

    public RealPrinter(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.print(text);

    }
}
