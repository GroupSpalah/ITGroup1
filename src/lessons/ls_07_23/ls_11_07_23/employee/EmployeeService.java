package lessons.ls_07_23.ls_11_07_23.employee;

import java.time.Year;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeService {
    private List<Employee> employees;

    public EmployeeService() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public float getSalaryByNameIterator(String name, Year from, Year to) {
        float sum = 0;

        Iterator<Employee> iteratorEmployee = employees.iterator();

        while (iteratorEmployee.hasNext()) {
            Employee employee = iteratorEmployee.next();

            if (employee.getName().equals(name)) {//"John"
                List<YearSalary> salaries = employee.getSalaries();

                Iterator<YearSalary> iteratorSalary = salaries.iterator();

                while (iteratorSalary.hasNext()) {
                    YearSalary yearSalary = iteratorSalary.next();

                    Year year = yearSalary.getYear();

                    if (year.isAfter(from) && year.isBefore(to)) {
                        float salary = yearSalary.getSalary();

                        sum += salary;
                    }

                    if (year.getValue() >= from.getValue() &&
                            year.getValue() <= to.getValue()) {
                        float salary = yearSalary.getSalary();

                        sum += salary;
                    }
                }
            }
        }
        return sum;
    }

    public float getSalaryByNameFor(String name, Year from, Year to) {
        float sum = 0;

        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {//"John"
                List<YearSalary> salaries = employee.getSalaries();

                for (YearSalary yearSalary : salaries) {
                    Year year = yearSalary.getYear();

                    if (year.isAfter(from) && year.isBefore(to)) {
                        float salary = yearSalary.getSalary();

                        sum += salary;
                    }
                }
            }
        }
        return sum;
    }
}

