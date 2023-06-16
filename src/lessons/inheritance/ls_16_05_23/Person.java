package lessons.inheritance.ls_16_05_23;

public abstract class Person implements Workable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void aMethod();

    public void print(int a, float b) {

    }

    public void print(float b, int a) {

    }
}

interface Workable {
    void work();
}

abstract class Secretary extends Person {
    private boolean isEducation;

    public Secretary(String name, int age, boolean isEducation) {
        super(name, age);
        this.isEducation = isEducation;
    }


}
