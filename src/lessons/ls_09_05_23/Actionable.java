package lessons.ls_09_05_23;

public interface Actionable {
    void action();

    default void dMethod() {
        prMethod();
        System.out.println();
    }

    public static void stMethod() {

    }

    private void prMethod() {

    }
}

class Action1 implements Actionable {

    public static final int COUNT_PEOPLE = 5;
    public static final String EXTENSION_TXT = ".txt";

    @Override
    public void action() {

    }

    @Override
    public void dMethod() {
        Actionable.super.dMethod();
    }

    public void someMethod() {
        System.out.println("Hello " + COUNT_PEOPLE + EXTENSION_TXT);
    }
}

class TestAction1 {
    public static void main(String[] args) {
        Action1 action1 = new Action1();

//        action1.

//        Actionable.stMethod();
    }
}
