package lessons.ls_09_23.ls_08_09_23.event_manager;

import java.util.*;

public class EventService {
    private List<Event> events;

    public EventService() {
        events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        if (!event.isStartedEvent()) {
            throw new IllegalArgumentException("Event not started");
        }
        events.add(event);
    }

    public String getOrganizatorMostEvents() {

        Map<Employee, Long> map = new HashMap<>();

        events
                .stream()
                .flatMap(e -> e.getEmployees().stream())
                .filter(e -> e.type() == EmployeeType.CHIEF_ORGANIZER)
                .forEach(employee -> {
                    long count = events
                            .stream()
                            .flatMap(event -> event.getEmployees().stream())
                            .filter(empl -> empl.equals(employee))
                            .count();

                    map.put(employee, count);
                });

        Comparator<Map.Entry<Employee, Long>> comparator = (e1, e2) -> Long.compare(e1.getValue(), e2.getValue());

        return map
                .entrySet()
                .stream()
                .max(comparator)
                .get()
                .getKey()
                .name();
    }
}
