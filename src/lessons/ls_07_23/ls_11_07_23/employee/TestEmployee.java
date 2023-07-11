package lessons.ls_07_23.ls_11_07_23.employee;

import java.time.Year;

public class TestEmployee {
    public static void main(String[] args) {
        YearSalary salary1 = new YearSalary(Year.of(2015), 1200);
        YearSalary salary2 = new YearSalary(Year.of(2017), 1400);
        YearSalary salary3 = new YearSalary(Year.of(2019), 2200);
        YearSalary salary4 = new YearSalary(Year.of(2020), 2700);

        Employee john = new Employee("John");

        john.addSalary(salary1);
        john.addSalary(salary2);
        john.addSalary(salary3);
        john.addSalary(salary4);

        EmployeeService service = new EmployeeService();

        service.addEmployee(john);

        float salary =
                service.getSalaryByNameIterator("John", Year.of(2016), Year.of(2020));

        System.out.println(salary);
    }
}
