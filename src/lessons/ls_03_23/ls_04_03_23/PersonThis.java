package lessons.ls_03_23.ls_04_03_23;

public class PersonThis {
    private int age;
    private int height;

    private int sum;

    public PersonThis(int age, int newHeight) {//12
        this.age = age;//age = 12;
        this.height = newHeight;
    }

    public int setAndGetAge(int age) {
        this.age = age;

        return age;
    }

    public void setAge(int newAge) {
        int a = 10;

        a = a;

        if (1 == 1) {
            int b = 45;
        }

//        b = 10;
        age = newAge;
    }

    public int getAge() {
        return this.age;
    }

    public PersonThis actionOne() {
        return this;
    }

    public PersonThis actionTwo() {
        return this;
    }

    public PersonThis add(int value) {
        sum += value;
        return this;
    }

    public int getSum() {
        return sum;
    }
}

class TestPerson {
    public static void main(String[] args) {
        PersonThis john = new PersonThis(12, 100);

//        john.setAge(25);

//        System.out.println(john.getAge());

        PersonThis ben = new PersonThis(22, 200);

//        ben.setAge(35);

        john.actionTwo();
        john.actionOne();

        john.actionTwo()//this -> john
                .actionOne()
                .actionTwo()
                .actionOne();

        john
                .add(5)
                .add(8);

        System.out.println(john.getSum());


    }
}
