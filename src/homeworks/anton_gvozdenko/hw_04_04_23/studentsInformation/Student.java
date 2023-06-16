package homeworks.anton_gvozdenko.hw_04_04_23.studentsInformation;

import lessons.ls_04_04_23.man_position.Gender;

public class Student {
    private int age;
    private String FirstName;
    private String LastName;
    private Sex sex;
    private Group group;
    private University university;

    public Student(int age, String firstName, String lastName, Sex sex, Group group, University university) {
        this.age = age;
        FirstName = firstName;
        LastName = lastName;
        this.sex = sex;
        this.group = group;
        this.university = university;
    }

    public String getLastName() {
        return LastName;
    }

    public Group getGroup() {
        return group;
    }

    public University getUniversity() {
        return university;
    }

    public void showInfo() {
        System.out.println("Sex = " + sex);
        System.out.println(LastName);
        group.showInfo();
        university.showInfo();

    }
}