package homeworks.anton_gvozdenko.hw_26_05_23;

public class Formalist extends Person {

    public String sayHello(Person people){
        return "Hello " + people.getName() + "!";
    }
    public void tellAboutMyself(){
        System.out.println("My name is " + getName()
                + " I am " + getAge() + " I am ");

    }
}
