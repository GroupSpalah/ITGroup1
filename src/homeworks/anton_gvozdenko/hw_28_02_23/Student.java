package homeworks.anton_gvozdenko.hw_28_02_23;

import javax.swing.text.View;

public class Student {
    private int age;
    private float stipendsSize;
    private float studyYears;

    public Student(int newAge, float newStipends, float newStudyYears) {
        if (newStudyYears < 0) {
            studyYears = 1;
        } else {
            studyYears = newStudyYears;
        }
        age = newAge;
        stipendsSize = newStipends;
    }

    public Student(int newAGe, float newStipends) {
        if (newAGe < 0) {
            age = 1;
        } else {
            age = newAGe;
        }
        stipendsSize = newStipends;
    }

    public Student(float newStudyYears) {
        if (newStudyYears < 0) {
            studyYears = 1;
        } else {
            studyYears = newStudyYears;
        }
    }

    public void setAge(int humanAge) {
        if (humanAge < 0) {
            age = 1;
        } else {
            age = humanAge;
        }
    }

    public int getAge() {
        return age;
    }

    public void showFields() {
        System.out.println("StudyYears = " + studyYears + " \tStipendsSize = " + stipendsSize);
        viewAge();
    }

    public void viewAge() {
        System.out.println("Age = " + age);
    }
}

class StudentParams {
    public static void main(String[] args) {
        Student john = new Student(18, 2000, 1);
        Student ihor = new Student(19, 1500);
        Student mary = new Student(5);

        john.setAge(22);
        ihor.setAge(17);

        john.viewAge();
        ihor.viewAge();
        int johnAge = john.getAge();
        float ihorAge = ihor.getAge();
        System.out.println("John age = " + johnAge);
        System.out.println("Ihor age = " + ihorAge);
        mary.showFields();
        ihor.showFields();
    }


}