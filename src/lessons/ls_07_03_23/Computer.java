package lessons.ls_07_03_23;

/**
 * 1) Write Computer class, the attributes of this class is
 * serialNumber (of int type), price (of float type),
 * quantityCPU (of int type) and frequencyCPU (of int type).
 *
 * 2) The fields Computer class need to be encapsulated.
 * Use correct access modifiers.
 * 3) Write a program to create array of Computer objects (5 pcs.).
 * Declare array of Computer objects (5 pcs.), create 5 Computer objects and place it to array.
 * 4) Write a program that iterate through array of Computer objects and increases by 10 percent field price.
 * 5) Add to class Computer method void view(){} that prints all fields of object in line.
 * Print all info (fields) of all objects in console.
 */
public class Computer {
    private int serialNumber;
    private int quantityCPU;
    private int frequencyCPU;
    private float price;

    public Computer(int serialNumber, int quantityCPU, int frequencyCPU, float price) {
        this.serialNumber = serialNumber;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void view() {
        System.out.println("SerialNumber = " + serialNumber +
                "\tQuantityCPU = " + quantityCPU +
                "\tPrice = " + price);
    }
}

class TestComputer {
    public static void main(String[] args) {
//        datatype[] name = new datatype[size];
        Computer[] computers = new Computer[5];//5 nulls

        Computer computer1 = new Computer(123, 4, 3200, 12.45f);
        Computer computer2 = new Computer(135, 5, 2200, 86.17f);
        Computer computer3 = new Computer(289, 6, 1200, 83.27f);

        computers[0] = computer1;
        computers[1] = computer2;
        computers[2] = computer3;

//        3 non nulls, 2 nulls

        for (Computer computer : computers) {
            if (computer != null) {
                float price = computer.getPrice();

                price += price * 0.1f;

                computer.setPrice(price);

                computer.view();
            }
        }
    }
}
