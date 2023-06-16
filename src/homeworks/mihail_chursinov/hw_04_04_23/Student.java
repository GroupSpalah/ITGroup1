package homeworks.mihail_chursinov.hw_04_04_23;

public class Student {
    /**
     * Создать класс Student c полями имя, пол(Enum Sex), фамилия, возраст, Group(отдельный класс), University(отдельный класс).
     * Создать класс Group c полями название, кол-во студентов.
     * Создать класс University c полями название, кол-во групп, дата основания(String).
     * <p>
     * Создать несколько студентов:
     * - с одинаковой группой и университетом.
     * - с разными группами в университете.
     * Создать методы позволяющие:
     * - вывести данные о студенте с учетом данных об университете и группе.
     * - проверять группы на одинаковость по названию у двух студентов .
     * - проверять университеты на одинаковость по название у двух студентов.
     * - проверять однофамильцев у двух студентов.
     */
    private String name;
    private String lastName;
    private int age;
    private Sex sex;
    private Group group;
    private University university;

    public Student(String name, String lastName, int age, Sex sex, Group group, University university) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.group = group;
        this.university = university;
    }

    public String getLastName() {
        return lastName;
    }

    public Group getGroup() {
        return group;
    }

    public University getUniversity() {
        return university;
    }

    public void showInfo() {
        System.out.println("First name:" + "\t" + name);
        System.out.println("Last name:" + "\t" + lastName);
        System.out.println("Age:" + "\t" + age);
        sex.showInfoSex();
        group.showInfoGroup();
        university.showInfoUniversity();

    }
}
