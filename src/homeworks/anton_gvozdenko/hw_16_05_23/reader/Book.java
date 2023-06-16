package homeworks.anton_gvozdenko.hw_16_05_23.reader;

public class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    public void takeBook(String books){
        StringBuilder builder = new StringBuilder("Petrov V.V take books");
        for (int i = 0; i <books.length() ; i++) {
           builder.append(i);
        }
        System.out.println(builder);
    }
    public void returnBook(String...books){
        StringBuilder builder = new StringBuilder("Petrov V.V returned books");
        for (int i = 0; i <books.length ; i++) {
            builder.append(i);
        }
        System.out.println(builder);
    }

    public static void main(String[] args) {
        Book book = new Book("Ocean","Ivanov");
        Reader reader = new Reader("Ivan","Ivanovich","Ivanov",12,"Math",
                12.05, 012345);
        book.takeBook("Dictionary");
        reader.returnBook();
        book.takeBook("Adventure");
        reader.returnBook();
    }
}
