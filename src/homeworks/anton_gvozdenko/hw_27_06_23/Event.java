package homeworks.anton_gvozdenko.hw_27_06_23;

public class Event {
    private String event;
    private String date;

    public Event(String event, String date) {
        this.event = event;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void view() {
        System.out.println("Event is " + event);
    }

    @Override
    public String toString() {
        return "Event{" +
                "event='" + event + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}