package books;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Bobo", "Felix Rove", 195));
        books.add(new Book("Rome", "Rob Folk", 159));

        for (Book book : books) {
            book.printBookDetails();
        }

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Huff!", "Drama", 1299));
        movies.add(new Movie("Puff!", "Drama", 99));

        for (Movie movie : movies) {
            movie.printMovieDetails();
        }




    }




    }
