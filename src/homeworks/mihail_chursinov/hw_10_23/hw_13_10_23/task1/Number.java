package homeworks.mihail_chursinov.hw_10_23.hw_13_10_23.task1;

public class Number extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
