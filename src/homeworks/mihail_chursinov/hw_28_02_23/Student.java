package homeworks.mihail_chursinov.hw_28_02_23;

public class Student {
    /*1) Создать класс Student c полями: кол-во проучившихся лет, возраст, размер стипендии.
Создать методы для изменения и получения полей класса(setter/getter), а также метод вывода в консоль полей. showFields
Организовать проверку на некорректные значения полей.
Создать несколько объектов класса, изменить поля и вывести в консоль.*/

    private int years;
    private int age;
    private int scholarship;

    public Student(int newYears, int newAge, int newScholarship) {
        if (newYears < 0) {
            years = 1;
        } else {
            years = newYears;
        }
        if (newAge < 0) {
            age = 18;
        } else {
            age = newAge;
        }
        if (newScholarship < 0) {
            scholarship = 3000;
        } else {
            scholarship = newScholarship;
        }


    }

    public void setYears(int newYears) {
        if (newYears < 0) {
            years = 1;
        } else {
            years = newYears;
        }

    }

    public int getYears() {
        return years;

    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            age = 18;
        } else {
            age = newAge;
        }

    }

    public int getAge() {
        return age;
    }

    public void setScholarship(int newScholarship) {
        if (newScholarship < 0) {
            scholarship = 3000;
        } else {
            scholarship = newScholarship;
        }
    }

    public int getScholarship() {
        return scholarship;
    }

    public void showFields() {
        System.out.println("Years = " + years + "\tAge = " + age + "\tScholarship = " + scholarship);
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student michael = new Student(3, 20, 3600);
        Student mary = new Student(5, 22, 4200);
        Student tom = new Student(6, 23, 5100);

        michael.setScholarship(3500);
        System.out.print("Michael: " + "\t");
        michael.showFields();

        mary.setYears(4);
        System.out.print("Mary: " + "\t");
        mary.showFields();

        tom.setAge(-24);
        System.out.print("Tom: " + "\t");
        tom.showFields();
    }


}
