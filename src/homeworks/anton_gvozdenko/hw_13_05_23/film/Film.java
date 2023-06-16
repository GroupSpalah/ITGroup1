package homeworks.anton_gvozdenko.hw_13_05_23.film;

public class Film {
    private String name;
    private String producer;
    private int duration;
    private int actors;

    public Film(String name, String producer, int duration, int actors) {
        this.name = name;
        this.producer = producer;
        this.duration = duration;
        this.actors = actors;
    }
    public String getName() {
        return name;
    }
    public float getDuration() {
        return duration;
    }
    public int getActors() {
        return actors;
    }
    public float createPrice() {
        if (producer.equals("James Cameron") || producer.equals("Steven Spielberg")) {
            return (duration * 20 + actors * 30) * 2;
        } else return duration * 20 + actors * 30;
    }

    public void showInfo() {
        System.out.println("Name = " + name + "\tProducer = " + producer + "\tDuration = " + duration +
                "\tNumber of actors = " + actors + createPrice());
    }
}
