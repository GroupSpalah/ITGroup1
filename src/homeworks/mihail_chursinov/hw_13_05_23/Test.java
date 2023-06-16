package homeworks.mihail_chursinov.hw_13_05_23;

public class Test {
    public static void main(String[] args) {
        Film film = new Film("Jurassic Park", "Steven Spielberg", 123, 23);
        Film film1 = new Film("Вогнем і мечем", "Jerzy Hoffman", 452, 52);
        Cartoon cartoon = new Cartoon("Shrek", "Steven Spielberg", 86, 8);

        String firstFilm = film.showInfo();
        String secondFilm = film1.showInfo();
        String cartoon1 = cartoon.showInfo();
        System.out.println(firstFilm);
        System.out.println(secondFilm);
        System.out.println(cartoon1);
    }
}
