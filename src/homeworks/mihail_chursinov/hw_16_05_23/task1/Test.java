package homeworks.mihail_chursinov.hw_16_05_23.task1;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Michael", "Jordan", 60, Gender.MALE, 5681378);
        person.print("Michael");
        person.print("Michael", "Jordan");
        person.print("Michael", "Jordan", 60);
        person.print("Michael", "Jordan", 60, Gender.MALE);
        person.print("Michael", "Jordan", 60, Gender.MALE, 5681378);
    }
}
