package homeworks.anton_gvozdenko.hw_09_05_23.student;

import homeworks.anton_gvozdenko.hw_09_05_23.plain.Plain;

public class Student {
    private String name;
    private String secondName;
    private String surName;
    private String faculty;
    private int course;
    private int minRating;

    public Student(String name, String secondName, String surName, String faculty, int course, int minRating) {
        this.name = name;
        this.secondName = secondName;
        this.surName = surName;
        this.faculty = faculty;
        this.course = course;
        this.minRating = minRating;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSurName() {
        return surName;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public int getMinRating() {
        return minRating;
    }

    public int transferCourse() {
        if (minRating >= 3) {
            return getCourse() + 1;
        } else {
            return 0;
        }
    }

    public int showStipend() {
        if (minRating <= 3) {
            return 0;
        }
        if (minRating == 4) {
            return 200;
        } else if (minRating == 5) {
            return 300;
        }
        return 0;
    }

    public void showInfo() {
        System.out.println("Name = " + name + "\tSecond name = " + secondName + "Surname = " + surName + "Faculty = " + faculty
                + "\tCourse = " + course + "\tRating = " + minRating + "\tSize of stipend = " + showStipend());
    }

}
