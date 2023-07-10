package lessons.ls_02_23.ls_25_02_23;

public class Person {
//    public, private - access modifiers

    //    public int age;//field age type int
    private int age;//field age type int
    private int weight;//field age type int
    private float height;//field height type float
//    public float height;//field height type float

    public Person(int newAge, float newHeight) {//incoming params, newAge = 25, newHeight = 170
        if (newAge < 0) {
            age = 1;
        } else {
            age = newAge;
        }
        height = newHeight;
//        weight = newWeight;
    }
}

class TestPerson {
    public static void main(String[] args) {
//        datatype(class_name) name_reference = new datatype(params or absent);
        Person john = new Person(-25, 170);

        /*
         john.age = -25;
        john.height = 170;
        */

        Person ben = new Person(35, 180);

       /* ben.age = 35;
        ben.height = 180;*/
    }
}
