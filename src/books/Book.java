package books;

import java.util.ArrayList;
import java.util.Objects;

public class
Book {

    private String title;
    private String author;
    private int price;

    public void printBookDetails() {
        System.out.println();
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("price: " + getPrice());
        System.out.println();
    }

    public Book() {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;

        if (price != book.price) return false;
        if (!Objects.equals(title, book.title)) return false;
        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }
}
