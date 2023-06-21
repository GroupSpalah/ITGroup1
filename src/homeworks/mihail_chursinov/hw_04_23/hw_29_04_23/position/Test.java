package homeworks.mihail_chursinov.hw_04_23.hw_29_04_23.position;

public class Test {
    public static void main(String[] args) {
        Salary manager = new Manager(25, "Козак", "Віталій", "Віталійович", true);
        Salary secretary = new Secretary(21, "Шевченко", "Інна", "Василівна", false);
        secretary.calculateSalary();
    }

}
