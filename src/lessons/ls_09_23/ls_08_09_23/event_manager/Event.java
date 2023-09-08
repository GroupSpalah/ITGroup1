package lessons.ls_09_23.ls_08_09_23.event_manager;

import java.util.ArrayList;
import java.util.List;

public class Event {
    public static final int COUNT_STAFFS = 13;
    private List<Employee> employees;
    private EventType type;

    public Event(EventType type) {
        this.type = type;
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    private boolean existsChief() {
        return employees
                .stream()
                .anyMatch(e -> e.type() == EmployeeType.CHIEF_ORGANIZER);
    }

    public boolean isStartedEvent() {
        return existsChief() && employees.size() >= COUNT_STAFFS;
    }

    @Override
    public String toString() {
        return "Event{" +
                "employees=" + employees +
                ", type=" + type +
                '}';
    }
}
