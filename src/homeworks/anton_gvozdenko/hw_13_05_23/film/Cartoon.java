package homeworks.anton_gvozdenko.hw_13_05_23.film;

public class Cartoon extends Film {
    public Cartoon(String name, String producer, int duration, int actors) {
        super(name, producer, duration, actors);
    }

    @Override
    public float createPrice() {
        return getDuration() * 2 + getActors() * 10;
    }
}
