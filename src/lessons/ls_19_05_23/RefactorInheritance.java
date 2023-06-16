package lessons.ls_19_05_23;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RefactorInheritance {

    public void processing(Book book) {//60 bytes
//        do something with book

    }

    public void processing(TestRefactor testRefactor) {//8 bytes
//        do something with book
    }

    public void processing(Article article) {


//        do something with article

//        Заменить параметры на класс Reference, предложить рефакторинг
    }

}

class Reference {
    private String author1;
    private String author2;
    private String author3;
    private String author4;
    private Boolean isUpdated;
    private int year;
    private int volume;

    public Reference(String author1, String author2, String author3,
                     String author4, Boolean isUpdated, int year, int volume) {
        this.author1 = author1;
        this.author2 = author2;
        this.author3 = author3;
        this.author4 = author4;
        this.isUpdated = isUpdated;
        this.year = year;
        this.volume = volume;
    }
}

class Book extends Reference {
    private int countOfpages;
    private String nameBook;

    public Book(String author1, String author2, String author3, String author4,
                Boolean isUpdated, int year, int volume, int countOfpages, String nameBook) {
        super(author1, author2, author3, author4, isUpdated, year, volume);
        this.countOfpages = countOfpages;
        this.nameBook = nameBook;
    }
}

class Article extends Reference {
    private int startPage;
    private int endPage;
    private String nameArticle;

    public Article(String author1, String author2, String author3, String author4,
                   Boolean isUpdated, int year, int volume, int startPage, int endPage, String nameArticle) {
        super(author1, author2, author3, author4, isUpdated, year, volume);
        this.startPage = startPage;
        this.endPage = endPage;
        this.nameArticle = nameArticle;
    }
}

class TestRefactor {
    /*String author1, String author2,
    String author3, String author4,
    int countOfpages, String nameBook,
    Boolean isUpdated, int year, int volume*/
}
