package lessons.ls_02_23.ls_28_02_23;

public class Tree {
    private int age;
    private int height;

    public Tree() {
        age = 20;
        height = 150;
    }

    public Tree(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class TestTree {
    public static void main(String[] args) {
        Tree tree = new Tree();

//        tree = new Tree(25);

        Tree oak = null;

        oak.setAge(23);

        oak = new Tree(30);

        int a = 0;

//        a = 15;

        Human liz = new Human(25, 165);

        liz.setAge(-30);

    }
}
