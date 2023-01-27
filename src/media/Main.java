package media;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ChildrensBook child1 = new ChildrensBook("Alice", "Gute Gogenhall", 154,"5-10 years old" );

        List<MediaProduct> booksAndMovies = new ArrayList<>();
        booksAndMovies.add(new Book("Bobo", "Felix Rove", 195));
        booksAndMovies.add(new Book("Rome", "Rob Folk", 159));
        booksAndMovies.add(child1);
        booksAndMovies.add(new Movie("Bobo", MovieGenre.DOCUMENTARY, 99));
        booksAndMovies.add(new Movie("Rolly", MovieGenre.ACTION, 159));

            for (MediaProduct p : booksAndMovies) {

                p.printDetails();
            }








            


        }

    }


