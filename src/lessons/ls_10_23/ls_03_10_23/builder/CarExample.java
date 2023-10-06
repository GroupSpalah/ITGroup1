package lessons.ls_10_23.ls_03_10_23.builder;

public class CarExample {
    private int field1;
    private long field2;
    private char field3;
    private short field4;
    private byte field5;

    public CarExample(int field1, int field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public CarExample(int field1, long field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public CarExample(int field1, char field3) {
        this.field1 = field1;
        this.field3 = field3;
    }

    public CarExample(int field1, long field2, char field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }
}
