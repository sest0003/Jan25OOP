package books;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Bobo", "Felix Rove", 195));
        books.add(new Book("Rome", "Rob Folk", 159));
        books.add(new Book("Rome", "Rob Folk", 159));

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Huff!", MovieGenre.DRAMA, 1299, "hoho"));
        movies.add(new Movie("Puff!", MovieGenre.DOCUMENTARY, 99, "hg"));




        Book stevo = new Book("Stevo", "lorry Larl", 178);  // finns inte med i Arrayen.




      /*/ loopar som användes i tidigare uppgifter

        // for (Book book : books) { //
          //  book.printBookDetails();
        }

        for (Movie movie : movies) {
            movie.printMovieDetails();
        }*/

       //Task--toString System.out.println(books.get(0).toString());

        //Task--toString System.out.println(movies.get(0).toString());



        if (books.get(1).equals(books.get(2))) {
            System.out.println("The books are the same (equal)!");
        }
        else {
            System.out.println("The books are not the same (equal)!");
        }

        BookRecord record1 = new BookRecord("Olle", 56);

        System.out.println(record1.toString());
    }

    }
