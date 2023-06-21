package homeworks.mihail_chursinov.hw_05_23.hw_26_05_23;

/**
 * (Неформалы) Со всеми здороваются: «Привет, <имя>!»
 */

public class Informals extends Person {
    public String sayHello(Person person){
        return "Hello, " + getName();
    }
    public void tellHimself(){
        System.out.println("Hello, my name is " + getName() + "\tI am " + getAge() + "\tyears old");
    }

}
