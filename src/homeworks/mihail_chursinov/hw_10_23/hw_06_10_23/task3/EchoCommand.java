package homeworks.mihail_chursinov.hw_10_23.hw_06_10_23.task3;

public class EchoCommand implements Command {
    @Override
    public void execute(String args) {
        System.out.println(args);
    }
}
