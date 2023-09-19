package lessons.ls_09_23.ls_08_09_23.event_manager;

import lessons.ls_07_23.ls_11_07_23.employee.Employee;

import java.util.HashMap;
import java.util.Map;

public class Conference extends Event {
    private Map<Employee, Boolean> mapBags;

    public Conference() {
        super(EventType.CONFERENCES);
        mapBags = new HashMap<>();
    }

    public void addBagToEmployee(Employee employee, boolean takeBag) {
        mapBags.put(employee, takeBag);
    }
}
