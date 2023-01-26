package books;

import java.util.ArrayList;

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



}
