package homeworks.mihail_chursinov.hw_05_23.hw_16_05_23.task2;

public class Test {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Le Petit Prince", "Antoine de Saint-Exupéry"),
                new Book("Le Petit Prince1", "Antoine de Saint-Exupéry1"),
                new Book("Le Petit Prince2", "Antoine de Saint-Exupéry2")
        };

        Reader reader = new Reader("Petrov", "Vladimir", "23", "DS - 1",
                1997, 5681345);
        Book book = new Book("Le Petit Prince", "Antoine de Saint-Exupéry");

        reader.takeBook(3);
        reader.takeBook("Adventure", "Dictionary", "Encyclopedia");
        reader.takeBook(books);
        reader.returnBook(books);


    }
}
