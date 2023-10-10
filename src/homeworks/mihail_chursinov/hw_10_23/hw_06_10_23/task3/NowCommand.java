package homeworks.mihail_chursinov.hw_10_23.hw_06_10_23.task3;

public class NowCommand implements Command{
    @Override
    public void execute(String args) {
        long time = System.currentTimeMillis();
        System.out.println(time);

    }
}
