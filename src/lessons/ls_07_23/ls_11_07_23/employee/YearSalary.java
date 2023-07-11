package lessons.ls_07_23.ls_11_07_23.employee;

import java.time.Year;

public class YearSalary {
    private Year year;
    private float salary;

    public YearSalary(Year year, float salary) {
        this.year = year;
        this.salary = salary;
    }

    public Year getYear() {
        return year;
    }

    public float getSalary() {
        return salary;
    }
}
