package homeworks.mihail_chursinov.hw_10_23.hw_06_10_23.task3;

public class Test {
    public static void main(String[] args) {
        Command command = new HelpCommand();
        Command command1 = new EchoCommand();
        Command command2 = new NowCommand();
        Command command3 = new ExitCommand();

        command.execute(null);
        command1.execute("echo Hello World");
        command2.execute(null);
        command3.execute(null);
    }
}
