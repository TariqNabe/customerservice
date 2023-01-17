import java.util.ArrayList;
import java.util.Iterator;

public class BetterBook {
    private String bookName;//private variables to this specific class
    private String edition;
    private String price;

    private ArrayList<Author> authors;//ArrayList to hold many names



    public BetterBook(String bookName, String edition, ArrayList<Author> authors, String price)//betterbook constructor
    {
        this.authors = authors;
        this.bookName = bookName;
        this.edition = edition;
        this.price = price;
    }
    public String getAuthorsInfo() {//getter authors info
        String authNames= "";

        int count = 1;
        for(Author a: authors) {//for each loop to dive in names and print them
            if(count == authors.size()) {
                authNames = authNames + " and " + a.getName() + "(" + a.getEmail() + ")";
            }
            else {
                authNames = authNames + a.getName() + "(" + a.getEmail() + ")";
            }
            count++;
        }
        return authNames;
    }
    public String getBookName() {//getter name of book
        return bookName;
    }


    public String getEdition() {//getter edition
        return edition;
    }


    public String getPrice() {//getter price
        return price;
    }

    public void setBookName(String bookName) {//setter bookname
        this.bookName = bookName;
    }

    public void setEdition(String edition) {//setter edition
        this.edition = edition;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public String toString() {
        return this.bookName + "(" + this.edition + "), by " + this.getAuthorsInfo();
    }
}