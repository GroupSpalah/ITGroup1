package lessons.ls_28_02_23;

public class Human {
    private int age;
    private int height;
    private int weight;

    public Human() {
    }

    public Human(int newAge, int newHeight, int newWeght) {
        /*age = newAge;
        height = newHeight;*/
        this(newAge, newHeight);
        weight = newWeght;
    }

    public Human(int newAge, int newHeight) {
        if (newAge < 0) {
            age = 1;
        } else {
            age = newAge;
        }
        height = newHeight;
    }

    /*public Human(int newAge, int newWeight) {
        age = newAge;
        weight = newWeight;
    }*/

    public Human(int newAge) {
        age = newAge;
    }

//    access_modifier void(return type) name(verb) (incoming params or absent) {body}

    public void setAge(int otherAge) {
        age = otherAge;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void showFields() {
        System.out.println("Age = " + age + "\tHeight = " + height);
        viewWeight();
    }

    public void viewWeight() {
        System.out.println("Weight = " + weight);
    }

}

class TestHuman {
    public static void main(String[] args) {
        Human john = new Human(23, 180, 85);
        Human ben = new Human(25, 165, 75);
        Human jack = new Human();

        //3 calls setters

        int lizAge = 25;

        Human liz = new Human(lizAge, 165);

        liz.setAge(-30);

        liz.setWeight(90);

//        john.setAge(24);

//        john.getAge();//24
        int johnAge = john.getAge();//24

//        System.out.println(johnAge);

//        john.showFields();
//        ben.showFields();

        ben.viewWeight();
    }
}
