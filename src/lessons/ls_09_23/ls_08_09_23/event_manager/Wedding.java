package lessons.ls_09_23.ls_08_09_23.event_manager;

public class Wedding extends Event {
    private boolean isCake;

    public Wedding(boolean isCake) {
        super(EventType.WEDDINGS);
        this.isCake = isCake;
    }
}
