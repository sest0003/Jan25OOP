package books;

public class Movie {

    private String title;
    private MovieGenre genre;
    private int price;
    private String director;

    public void printMovieDetails() {
        System.out.println();
        System.out.println("title: " + getTitle());
        System.out.println("Genre: " + getGenre());
        System.out.println("Price: " + getPrice() + "kr");
        System.out.println();
    }


    public Movie(String title, MovieGenre genre, int price, String director) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.director = director;

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
}
