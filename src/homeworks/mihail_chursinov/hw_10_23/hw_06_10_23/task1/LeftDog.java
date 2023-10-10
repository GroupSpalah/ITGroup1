package homeworks.mihail_chursinov.hw_10_23.hw_06_10_23.task1;

public class LeftDog implements Printable{
    private Printable printable;

    public LeftDog(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        System.out.print("@");
        printable.print();

    }
}
