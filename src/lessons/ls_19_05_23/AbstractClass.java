package lessons.ls_19_05_23;

public abstract class AbstractClass {
    abstract void method1();

    public final void fMethod(final int a) {
//        a = 10;
        final int b = 10;

//        b = 20;
    }
}

abstract class Child extends AbstractClass {

    /*public final void fMethod() {

    }*/
}

interface Actionable1 {
    int COUNT = 5;

    public static void stMethod() {

    }

    private void prMethod() {

    }
}

class TestAbstractClass {
    public static void main(String[] args) {
    }
}
