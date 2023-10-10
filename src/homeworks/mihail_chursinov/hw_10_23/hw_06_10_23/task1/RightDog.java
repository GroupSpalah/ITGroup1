package homeworks.mihail_chursinov.hw_10_23.hw_06_10_23.task1;

public class RightDog implements Printable{
    private Printable printable;

    public RightDog(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        printable.print();
        System.out.print("@");
    }
}
