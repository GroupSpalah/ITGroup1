package homeworks.mihail_chursinov.hw_26_05_23;

/**
 * 1 (Формалисты) Здороваются со всеми так: «Здравствуй, <имя>», где
 * <имя> – имя человека, с которым он здоровается.
 */

public class Formalists extends Person {
    public String sayHello(Person person){
        return "Hello, " + getName();
    }
    public void tellHimself(){
        System.out.println("Hello, my name is " + getName() + "\tI am " + getAge() + "\tyears old");
    }
}
