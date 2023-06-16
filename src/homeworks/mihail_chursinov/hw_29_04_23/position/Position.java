package homeworks.mihail_chursinov.hw_29_04_23.position;

/**
 * Создать классы Manager(поля возраст, ФИО, (ТОП менеджер или нет)) и Secretary(поля возраст, ФИО, (стажер или нет)).
 * Создать класс Position(super-class) и вынести общие поля в родительский класс. Создать конструкторы во всех классах.
 * Создать интерфейс Salary с абстрактным методом calculateSalary(). Класс Position должен реализовать интерфейс Salary.
 * Создать объекты потомков, чтобы ссылка интерфейса ссылалась на объект потомка.
 */

public class Position implements Salary {
    private int age;
    private String lastName;
    private String firstName;
    private String middleName;

    public Position(int age, String lastName, String firstName, String middleName) {
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    @Override
    public void calculateSalary() {
        System.out.println("2000$");

    }
}
