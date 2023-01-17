import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BetterBookTest {

    @Test
    void getAuthorsInfo() {
        Author a1 = new Author("Ada Lovelace", " (no email) ", "12/10/1815");
        Author a2 = new Author("Cay Horstmann ", " cay@horstmann.com ", "6/16/1959");
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(a1);
        authors.add(a2);
        BetterBook b3 = new BetterBook("Elements of Charles Babbage’s Analytical Machine", "1st Edition", authors,"122.42");
        assertEquals("Ada Lovelace( (no email) ) and Cay Horstmann ( cay@horstmann.com )", b3.getAuthorsInfo());
    }

    @Test
    void getBookName() {

    }

    @Test
    void getEdition() {
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