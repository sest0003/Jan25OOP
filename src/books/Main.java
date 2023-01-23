package books;

public class Main {
    public static void main(String[] args) {


        Book book1 = new Book("Bobo", "Felix Rove", 195);
        Book book2 = new Book("Rome", "Rob Folk", 599);

        System.out.println();

       printBookDetails(book1);

        System.out.println();

       printBookDetails(book2);



    }

    public static void printBookDetails(Book book) {
        System.out.println("title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice() + "kr");

    }
}