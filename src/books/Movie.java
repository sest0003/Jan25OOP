package books;

public class Movie {

    private String title;
    private String genre;
    private static int price;

    public void printMovieDetails() {
        System.out.println();
        System.out.println("title: " + getTitle());
        System.out.println();
        System.out.println("Genre: " + getGenre());
        System.out.println();
        System.out.println("Price: " + getPrice() + "kr");
        System.out.println();
    }


    public Movie(String title, String genre, int price) {
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public static int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
