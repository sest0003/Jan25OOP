package books;

public class Main {
    public static void main(String[] args) {


        Book book1 = new Book("Bobo", "Felix Rove", 195);
        Book book2 = new Book("Rome", "Rob Folk", 599);

        Movie movie1 = new Movie("Gladiatorkiller","Comedy", 99);
        Movie movie2 = new Movie("kill Dalfin","Comedy", 99);


        System.out.println();

       printBookDetails(book1);

        System.out.println();

       printBookDetails(book2);

        System.out.println();

        printMovieDetails(movie1);

        System.out.println();

        printMovieDetails(movie2);


    }

    public static void printBookDetails(Book book) {
        System.out.println("title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice() + "kr");

    }

    public static void printMovieDetails(Movie movie) {
        System.out.println("title: " + movie.getTitle());
        System.out.println("Genre: " + movie.getGenre());
        System.out.println("Price: " + movie.getPrice() + "kr");
    }
}