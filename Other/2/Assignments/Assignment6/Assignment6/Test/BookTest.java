import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getAuthor() {
        Book b = new Book("Big Java: Late Objects", "2nd Edition", "Cay Horstmann", "cay@horstmann.com", "6/16/1959", "112.50");
        assertEquals("Cay Horstmann", b.getAuthor().getName());
    }

    @Test
    void getBookName() {
        Book b = new Book("Big Java: Late Objects", "2nd Edition", "Cay Horstmann", "cay@horstmann.com", "6/16/1959", "112.50");
        assertEquals("Big Java: Late Objects", b.getBookName());
    }

    @Test
    void getEdition() {
        Book b = new Book("Big Java: Late Objects", "2nd Edition", "Cay Horstmann", "cay@horstmann.com", "6/16/1959", "112.50");
        assertEquals("2nd Edition", b.getEdition());
    }

    @Test
    void getPrice() {
        Book b = new Book("Big Java: Late Objects", "2nd Edition", "Cay Horstmann", "cay@horstmann.com", "6/16/1959", "112.50");
        assertEquals("112.50", b.getPrice());
    }

    @Test
    void setBookName() {
    }

    @Test
    void setEdition() {
    }

    @Test
    void setPrice() {
    }

    @Test
    void testToString() {
    }
}