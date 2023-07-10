package lessons.ls_04_23.ls_04_04_23.man_position;

/**
 * Создать класс Man c полями имя, пол(использовать Enum) фамилия, возраст, должность.
 * Для должности создать отдельный класс с полем название должности.
 *
 * Создать несколько людей с одинаковой и разными должностями.
 * Создать методы позволяющие:
 *  - вывести данные о человеке.
 *  - проверять должности по названии на одинаковость у двух людей.
 *  - проверять однофамильцев у двух людей.
 */
public class Man {
    private int age;
    private String firstName;
    private String lastName;
    private Gender gender;
    private Position position;

    public Man(int age, String firstName, String lastName, Gender gender, Position position) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.position = position;
    }

    public String getLastName() {
        return lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void showInfo() {
        System.out.println("First name = " + firstName);//all fields of man
        position.showInfo();//all fields of position
    }
}
