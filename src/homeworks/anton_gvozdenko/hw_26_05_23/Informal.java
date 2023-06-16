package homeworks.anton_gvozdenko.hw_26_05_23;

public class Informal extends Person {
    public String sayHello(Person person){
        return "Hi " + person.getName() +"!";
    }
    public void tellAboutMyself(){
        System.out.println("My name is " + getName() + "\tI am " +
                getAge()  + " I am ");
    }
}
