package homeworks.mihail_chursinov.hw_05_23.hw_16_05_23.task2;

/**
 * Определить класс Reader, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета,
 * факультет, дата рождения, телефон. Методы takeBook(), returnBook().
 * <p>
 * Перегрузить методы takeBook(), returnBook():
 * <p>
 * - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
 * <p>
 * - takeBook, который будет принимать переменное количество названий книг(String, varargs).
 * Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".StringBuilder
 * <p>
 * - takeBook, который будет принимать переменное количество объектов класса Book, Book... books
 * (создать новый класс, содержащий название и автора книги). Выводит на консоль
 * сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".StringBuilder
 * <p>
 * Аналогичным образом перегрузить метод returnBook(). Выводит на консоль
 * сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или "Петров В. В. вернул 3 книги".
 */

public class Reader {
    private String firstName;
    private String lastName;
    private String numberTicket;
    private String faculty;
    private int dataBirth;
    private int phoneNumber;

    public Reader(String firstName, String lastName, String numberTicket, String faculty, int dataBirth, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberTicket = numberTicket;
        this.faculty = faculty;
        this.dataBirth = dataBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook() {
    }

    public void returnBook() {
    }

    public void takeBook(int book) {
        System.out.println("Petrov V.V. took " + book + " books!");
    }

    public void takeBook(String... book) {
        String str = "Petrov V.V. took three books: ";
        StringBuilder builder = new StringBuilder(str);
        for (int i = 0; i < book.length; i++) {
            String name = book[i];
            builder.append(name);
            if (i != book.length - 1) {
                builder.append(", ");
            }
        }
        System.out.println(builder);
    }

    public void takeBook(Book... books) {
        String str = "Petrov V.V. took three books: ";
        StringBuilder builder = new StringBuilder(str);
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            builder.append(book.getNameBook());
            if (i != books.length - 1) {
                builder.append(", ");
            }
        }
        System.out.println(builder);

    }

    public void returnBook(Book... book) {
        String str = "Petrov V.V. returned the books: ";
        StringBuilder builder = new StringBuilder(str);
        for (int i = 0; i < book.length; i++) {
            builder.append(book[i].getNameBook());
            if (i != book.length - 1) {
                builder.append(", ");
            }
        }
        System.out.println(builder + "\nPetrov V.V. returned three books!");
    }
}


