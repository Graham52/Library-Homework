import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Book book;
    Library library;

    @Before
    public void before() {
        book = new Book();
        library = new Library(50);
    }

    @Test
    public void booksInLibraryTest() {
        assertEquals(0, library.booksCount());
    }
    @Test
    public void addBookTest(){
        library.addBook(book);
        assertEquals(1,library.booksCount());
    }
}