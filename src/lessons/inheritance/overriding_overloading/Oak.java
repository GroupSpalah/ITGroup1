package lessons.inheritance.overriding_overloading;

public class Oak extends Tree {
    public Oak(int age) {
        super(age);
    }

    @Override
    public String method1() {
        return "";
    }

    public String method2() {
        return "";
    }

    @Override
    public void grow(int a) {
        System.out.println("Oak is growing");
        System.out.println("Good tree");
    }


}
