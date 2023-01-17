import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Author a = new Author("Ada Lovelace", " (no email) ", "12/10/1815");
        assertEquals("Ada Lovelace", a.getName());
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        Author a = new Author("Ada Lovelace", "(no email)", "12/10/1815");
        assertEquals("(no email)", a.getEmail());
    }

    @org.junit.jupiter.api.Test
    void getBirthDate() {
        Author a = new Author("Ada Lovelace", "(no email)", "12/10/1815");
        assertEquals("12/12/1212", a.getBirthDate());
    }

    @org.junit.jupiter.api.Test
    void setName() {
    }

    @org.junit.jupiter.api.Test
    void setEmail() {
    }

    @org.junit.jupiter.api.Test
    void setBirthDate() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Author a = new Author("Ada Lovelace", "(no email)", "12/10/1815");
        assertEquals("Ada Lovelace(no email), born 12/10/1815", a.toString());
    }
}