// Run this file to test your Library.
// Every row uses the same library, so the rows build on each other.
// A row passes only if the result AND the available count both match.
// Each row prints PASS or FAIL. You do not need to change anything here.
public class Main {
    private static int total = 0;
    private static int passed = 0;

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Dune"));
        library.addBook(new Book("Emma"));

        check("Add books, then count", 2, library.getAvailableBookCount(), 2, library);
        check("Borrow normally", true, library.borrowBook("Dune"), 1, library);
        check("Borrow twice", false, library.borrowBook("Dune"), 1, library);
        check("Return normally", true, library.returnBook("Dune"), 2, library);
        check("Return a book that is not out", false, library.returnBook("Emma"), 2, library);
        check("Unknown title", false, library.borrowBook("Hamlet"), 2, library);

        System.out.println(passed + "/" + total + " passed");
    }

    // For rows where the method gives back true or false.
    private static void check(String caseName, boolean expectedResult, boolean actualResult,
                              int expectedAvailable, Library library) {
        report(caseName, "" + expectedResult, "" + actualResult, expectedAvailable, library);
    }

    // For the row where the method gives back a number.
    private static void check(String caseName, int expectedResult, int actualResult,
                              int expectedAvailable, Library library) {
        report(caseName, "" + expectedResult, "" + actualResult, expectedAvailable, library);
    }

    // Looks at how many books are available now, then prints PASS or FAIL.
    private static void report(String caseName, String expectedResult, String actualResult,
                               int expectedAvailable, Library library) {
        total++;
        int actualAvailable = library.getAvailableBookCount();

        if (expectedResult.equals(actualResult) && expectedAvailable == actualAvailable) {
            passed++;
            System.out.println("PASS  " + total + ". " + caseName);
        } else {
            System.out.println("FAIL  " + total + ". " + caseName
                    + "  (result: expected " + expectedResult + ", got " + actualResult
                    + " | available: expected " + expectedAvailable + ", got " + actualAvailable + ")");
        }
    }
}
