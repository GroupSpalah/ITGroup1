package lessons.ls_25_04_23.learn_interfaces;

public interface Actionable {
    public abstract void action();

    default void print() {
        prMethod();
        System.out.println("Default");
    }

    public static void stMethod() {

    }

    private void prMethod() {

    }
}
