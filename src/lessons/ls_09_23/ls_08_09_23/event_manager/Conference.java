package lessons.ls_09_23.ls_08_09_23.event_manager;

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
