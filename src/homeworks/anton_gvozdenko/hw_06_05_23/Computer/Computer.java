package homeworks.anton_gvozdenko.hw_06_05_23.Computer;

import java.util.concurrent.Callable;

interface Able {
    int makePrice(int CPU, int numbCores, int memorySize, int HDD);

    boolean controlSuitability(int CPU, int numbCores, int memorySize, int HDD);

    void watchInfo();

}

public class Computer implements Able {

    private int CPU;
    private int numbCores;
    private int memorySize;
    private int HDD;


    public Computer(int CPU, int numbCores, int memorySize, int HDD) {
        this.CPU = CPU;
        this.numbCores = numbCores;
        this.memorySize = memorySize;
        this.HDD = HDD;
    }

    @Override

    public int makePrice(int CPU, int numbCores, int memorySize, int HDD) {
        int price = (CPU * numbCores / 100) + (memorySize / 80) + (HDD / 20);
        return price;
    }

    @Override
    public boolean controlSuitability(int CPU, int numbCores, int memorySize, int HDD) {
        if (CPU > 2000 && numbCores > 2 && memorySize > 2048 && HDD > 320) {
            return true;
        } else {
            System.out.println("Choose other computer");
        }
        return false;
    }

    public void watchInfo() {
        System.out.println(CPU + numbCores + memorySize + HDD);
    }

    public int getCPU() {
        return CPU;
    }

    public int getNumbCores() {
        return numbCores;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public int getHDD() {
        return HDD;
    }
}

class NoteBook extends Computer {
    private float workTime;

    public NoteBook(int CPU, int numbCores, int memorySize, int HDD, float workTime) {
        super(CPU, numbCores, memorySize, HDD);
        this.workTime = workTime;
    }

    public float makePrice(int CPU, int numbCores, int memorySize, int HDD, float workTime) {
        float price = (CPU * numbCores / 100) + (memorySize / 80) + (HDD / 20) + workTime / 10;
        return price;
    }

    public boolean controlSuitability(int CPU, int numbCores, int memorySize, int HDD, float workTime) {
        if (CPU > 2000 && numbCores > 2 && memorySize > 2048 && HDD > 320 && workTime > 60) {
            return true;
        } else {
            return false;
        }
    }

    public void watchInfo(int CPU, int numbCores, int memorySize, int HDD, float workTime) {
        System.out.println(CPU + numbCores + memorySize + HDD + workTime);
    }
}

class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer(20, 2, 44, 250);
        NoteBook book = new NoteBook(23, 4, 30, 400, 70);
        computer.watchInfo();
        book.watchInfo();


    }
}