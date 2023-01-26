package books;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Book> books = new ArrayList<>();
        books.add(new Book("Bobo", "Felix Rove", 195));
        books.add(new Book("Rome", "Rob Folk", 159));


            for (Book book : books) {
                book.printBookDetails();
            }

        List<Movie> movies = new ArrayList<>();


            movies.add(new Movie("Bobo", MovieGenre.DOCUMENTARY, 99));
            movies.add(new Movie("Rolly", MovieGenre.ACTION, 159));

            for (Movie m : movies) {
                m.printMovieDetails();
            }
        }

    }


