package lessons.ls_04_23.ls_25_04_23.learn_interfaces;

public class Worker implements Actionable {

    public void doSomething() {
        print();
        System.out.println("Do smth");
    }

    @Override
    public void action() {
        System.out.println("Hello from Worker");
    }
}

class TestInterface {
    public static void main(String[] args) {
        Worker worker = new Worker();
//        Actionable worker = new Worker();
       // worker.

//        Actionable.stMethod();
    }
}
