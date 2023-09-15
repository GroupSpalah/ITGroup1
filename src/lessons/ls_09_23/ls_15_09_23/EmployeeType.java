package lessons.ls_09_23.ls_15_09_23;

public enum EmployeeType {
    WORKER(408, 6),
    SUPERVISOR(788, 5),
    ENGINEER(700, 40);

    private float baseSalary;
    private float hourSalary;

    EmployeeType(float baseSalary, float hourSalary) {
        this.baseSalary = baseSalary;
        this.hourSalary = hourSalary * 2;//TODO Should be constant
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public float getHourSalary() {
        return hourSalary;
    }
}
