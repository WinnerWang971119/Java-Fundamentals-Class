public class Book {
    private String title;
    private boolean borrowed;

    // A new Book starts available.
    public Book(String title) {
        this.title = title;
        this.borrowed = false;
    }

    // There is no setter: the title never changes.
    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    // Works only on an available book. A failed call changes nothing.
    public boolean borrow() {
        if (borrowed) {
            return false;
        }
        borrowed = true;
        return true;
    }

    // Works only on a borrowed book. A failed call changes nothing.
    public boolean giveBack() {
        if (!borrowed) {
            return false;
        }
        borrowed = false;
        return true;
    }
}
