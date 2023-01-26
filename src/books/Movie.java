package books;

import java.util.ArrayList;
import java.util.Objects;

public class Movie {

    private String title;
    private MovieGenre genre;
    private int price;

    public void printMovieDetails() {
        System.out.println();
        System.out.println("title: " + getTitle());
        System.out.println("Genre: " + getGenre());
        System.out.println("Price: " + getPrice() + "kr");
        System.out.println();
    }

    public Movie(String title, MovieGenre genre, int price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }





    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie movie)) return false;

        return Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }
}
