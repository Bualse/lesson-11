package methodsObjects;

import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String secondNameAuthor;

    public Author(String nameAuthor, String secondNameAuthor) {
        this.nameAuthor = nameAuthor;
        this.secondNameAuthor = secondNameAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getSecondNameAuthor() {
        return secondNameAuthor;
    }

    @Override
    public String toString() {
        return nameAuthor + secondNameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return nameAuthor.equals(author.nameAuthor) && secondNameAuthor.equals(author.secondNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, secondNameAuthor);
    }
}
