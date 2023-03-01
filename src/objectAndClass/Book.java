package objectAndClass;

public class Book {

    private String nameBook;
    private Author Author;
    private int yearPublish;

    public Book(Author Author, String nameBook, int yearPublish) {
        this.nameBook = nameBook;
        this.Author = Author;
        this.yearPublish = yearPublish;
    }


    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return Author;
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }
}
