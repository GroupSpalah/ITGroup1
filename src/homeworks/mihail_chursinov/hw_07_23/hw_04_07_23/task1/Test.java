package homeworks.mihail_chursinov.hw_07_23.hw_04_07_23.task1;

public class Test {
    public static void main(String[] args) {
        Integer[] arrayI = {3, 5, 9};
        Double[] arrayD = {3.2, 5.0, 5.0};
        ArrayWorker<Integer> arrayWorkerI = new ArrayWorker<>(arrayI);
        ArrayWorker<Double> arrayWorkerD = new ArrayWorker<>(arrayD);
        int countI = arrayWorkerI.countElement(5);
        int countD = arrayWorkerD.countElement(4.6);
        System.out.println(countI);
        System.out.println(countD);


    }
}
