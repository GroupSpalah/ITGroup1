package homeworks.anton_gvozdenko.hw_13_05_23.film;

public class Test {
    public static void main(String[] args) {
        Film film = new Film("Terminator", "Steven Spielberg", 200, 15);
        Film film1 = new Film("Avengers", "Jerzy Hoffman", 180, 25);
        Cartoon cartoon = new Cartoon("Cars", "Christopher Nolan", 205, 40);
        film.createPrice();
        film1.createPrice();
        cartoon.createPrice();
        film.showInfo();
        film1.showInfo();
        cartoon.showInfo();
    }
}
