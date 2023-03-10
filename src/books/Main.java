package books;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Bobo", "Felix Rove", 195));
        books.add(new Book("Rome", "Rob Folk", 159));

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Huff!", "Drama", 99));
        movies.add(new Movie("Puff!", "Action", 99));


        for (Book book : books) {
            printBookDetails(book);
        }


        for (Movie movie : movies) {
            printMovieDetails(movie);
        }

    }

    public static void printBookDetails(Book books) {
        System.out.println(books.getTitle());
        System.out.println(books.getAuthor());
        System.out.println(books.getPrice());
    }

    public static void printMovieDetails(Movie movie) {
        System.out.println("title: " + movie.getTitle());
        System.out.println("Genre: " + movie.getGenre());
        System.out.println("Price: " + movie.getPrice() + "kr");
    }



}