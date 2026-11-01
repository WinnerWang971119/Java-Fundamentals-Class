// You write this file. Don't change Book.java.
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add a book to the library.
    public void addBook(Book book) {
        // TODO
    }

    // Borrow the book with this title.
    // Return false if the title is unknown or the book is already borrowed.
    public boolean borrowBook(String title) {
        // TODO
        return false;
    }

    // Return the book with this title.
    // Return false if the title is unknown or the book was not borrowed.
    public boolean returnBook(String title) {
        // TODO
        return false;
    }

    // How many books are not borrowed right now.
    public int getAvailableBookCount() {
        // TODO
        return 0;
    }
}
