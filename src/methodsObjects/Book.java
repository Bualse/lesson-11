package methodsObjects;

import java.util.Objects;

public class Book {

    private String nameBook;
    private Author author;
    private int yearPublish;

    public Book(Author Author, String nameBook, int yearPublish) {
        this.nameBook = nameBook;
        this.author = Author;
        this.yearPublish = yearPublish;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    @Override
    public String toString() {
        return "Название книги: " + nameBook + ", Автор: "  + author + ", Год публикации: " + yearPublish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublish == book.yearPublish && nameBook.equals(book.nameBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, yearPublish);
    }
}
