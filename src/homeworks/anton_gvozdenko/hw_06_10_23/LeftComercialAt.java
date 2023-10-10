package homeworks.anton_gvozdenko.hw_06_10_23;

class LeftCommercialAt implements Printable {
    private Printable printable;
    public LeftCommercialAt (Printable printable){
      this.printable = printable;
    }

    @Override
    public void print() {
        System.out.print("@");
        printable.print();
    }
}
