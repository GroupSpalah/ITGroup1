package homeworks.mihail_chursinov.hw_13_05_23;

import java.util.Objects;

/**
 * 1) Создать класс Фильм со свойствами: Название, Режиссер, длительность
 * (в минутах), количество актеров. Определить метод:
 * «Стоимость», возвращающую примерную расчетную стоимость фильма
 * (в тыс. $), рассчитываемую по формуле длительность*20 + количество
 * актеров*30, но если режиссер = «Стивен Спилберг» или «Джеймс
 * Кэмерон», то стоимость в два раза выше (по сравнению с вышеуказанной формулой).
 * Определить также метод «Информация», который
 * возвращает строку, содержащую информацию о фильме: Название,
 * режиссера, длительность, количество актеров и стоимость.
 * Создать также класс наследник Мультфильм, в котором переопределить метод
 * «Стоимость» по формуле длительность*25 + количество
 * актеров*10 (вне зависимости от режиссера).
 * В главной программе создать 2 фильма с
 * режиссерами: «Стивен Спилберг» и «Ежи Гофман», а также мультфильм и вывести информацию о них.
 */

public class Film {
    public static final int DURATION_FACTOR = 20;
    public static final int ACTORS_FACTOR = 30;
    public static final int DIRECTOR_FACTOR = 2;
    private String name;
    private String director;
    private int duration;
    private int countActors;

    public Film(String name, String director, int duration, int countActors) {
        this.name = name;
        this.director = director;
        this.duration = duration;
        this.countActors = countActors;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public int getCountActors() {
        return countActors;
    }

    public int countPrice() {
        int result = duration * DURATION_FACTOR + countActors * ACTORS_FACTOR;
        if (director.equals("Steven Spielberg") || equals("Steven Spielberg")) {
            result *= DIRECTOR_FACTOR;
        }
        return result;
    }

    public String showInfo() {
        return "Name " + name + "\tDirector " + director + "\tDuration " + duration + "\tNumber of actors "
                + countActors + "\tThe price of the film " + countPrice();

    }
}
