package lessons.inheritance.ls_23_05_23;

public class Human {
    public void print() {
        System.out.println("Human");
    }

    public void print(int a) {
        System.out.println("Human");
    }

    public void print(double a) {
        System.out.println("Human");
    }
}

class Worker extends Human {
    public void print() {
        System.out.println("Worker");
    }

    /*public void action(double a) {
        System.out.println("Human");
    }*/
}

class TestPolymorphism {
    public static void main(String[] args) {
        Human human = new Worker();//new Human

        human.print();
    }
}
