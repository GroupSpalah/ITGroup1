package homeworks.anton_gvozdenko.hw_06_10_23;

class RightCommercialAt implements Printable {
    private Printable printable;
    public RightCommercialAt (Printable printable){
        this.printable = printable;
    }

    @Override
    public void print() {
        printable.print();
        System.out.print("@");
    }
}
