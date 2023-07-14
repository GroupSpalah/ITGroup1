package lessons.lessons.ls_07_23.ls_11_07_23.employee;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

/**
 * Implement method `getSalaryInfo(String name, int yearFrom, int yearTo)`.
 * It should calculate salary for employees.
 *
 * Пример:
 *
 * Имена:
 * ```
 *    John
 *    Andrew
 *    Kate
 * ```
 *
 * Статистика:
 * ```
 *   2019 John   450
 *   2020 Andrew 3200
 *   2018 John   7100
 *   2021 Kate   9100
 *   2022 John   1150
 *   2014 Andrew 3150
 *   2015 John   7100
 *   2013 Kate   9100
 * ```
 *
 * Method execution result:
 * ```
 *    Report for period 2015  - 2022
 *    John - 8700
 *    Andrew - 6350
 *    Kate - 18200
 */
public class Employee {
    private String name;

    private List<YearSalary> salaries;

    public Employee(String name) {
        salaries = new ArrayList<>();
        this.name = name;
    }

    public void addSalary(YearSalary yearSalary) {
        salaries.add(yearSalary);
    }

    public String getName() {
        return name;
    }

    public List<YearSalary> getSalaries() {
        return salaries;
    }
}
