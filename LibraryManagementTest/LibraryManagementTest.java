import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LibraryManagementTest {
    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("Title", "Author", "12345");
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }
    @Test
    public void testRemoveBook() {
        Library library = new Library();
        Book book = new Book("Title", "Author", "12345");
        library.addBook(book);
        library.removeBook("12345");
        assertEquals(0, library.getBookCount());
    }
    @Test
    public void testCheckOutBook() {
        Library library = new Library();
        Book book = new Book("Harry", "J.K. Rowling", "12345");
        library.addBook(book);
        library.checkOutBook("12345");
        assertFalse(book.isAvailable());
    }
    @Test
    public void testReturnBook() {
        Library library = new Library();
        Book book = new Book("Harry", "J.K. Rowling", "12345");
        library.addBook(book);
        library.checkOutBook("12345");
        library.returnBook("12345");
        assertTrue(book.isAvailable());
    }


}
