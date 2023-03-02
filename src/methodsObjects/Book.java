package methodsObjects;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Название книги: " + nameBook + ", Автор: "  + Author + ", Год публикации: " + yearPublish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return nameBook.equals(book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook);
    }
}
