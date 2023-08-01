package homeworks.mihail_chursinov.hw_05_23.hw_06_05_23.task1.task2;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer(320, 2048, 2, 320);
        Laptop laptop = new Laptop(320, 2048, 2, 320, 70);

        String testComputer = computer.showInfo();
        String testLaptop = laptop.showInfo();
        System.out.println(testComputer);
        System.out.println(testLaptop);

    }
}
