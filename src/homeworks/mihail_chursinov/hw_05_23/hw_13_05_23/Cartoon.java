package homeworks.mihail_chursinov.hw_05_23.hw_13_05_23;

/**
 * Создать также класс наследник Мультфильм, в котором переопределить метод
 *  * «Стоимость» по формуле длительность*25 + количество
 *  * актеров*10 (вне зависимости от режиссера).
 */

public class Cartoon extends Film{

    public static final int CARTOON_DURATION = 25;
    public static final int CARTOON_ACTORS = 10;

    public Cartoon(String name, String director, int duration, int countActors) {
        super(name, director, duration, countActors);
    }

    @Override
    public int countPrice() {
        int result = getDuration() * DURATION_FACTOR + getCountActors() * ACTORS_FACTOR;
        if (getDirector().equals("Steven Spielberg") || equals("Steven Spielberg")) {
            return result * DIRECTOR_FACTOR;
        } else {
            return result;
        }
    }
}
