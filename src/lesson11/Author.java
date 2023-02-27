package lesson11;

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
}
