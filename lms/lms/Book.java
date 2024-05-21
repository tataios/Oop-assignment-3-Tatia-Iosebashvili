package lms;

public class Book {
    String title, author;
    public boolean available;

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable();
    }

    public void borrow() {
        this.available = false;
    }
}
