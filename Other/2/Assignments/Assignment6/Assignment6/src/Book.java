public class Book {
    private String bookName;//private variables
    private String edition;
    private String price;

    private Author author;//author object created instead extended



    public Book(String bookName, String edition, String aname, String aEmail, String aDob, String price)//book constructor
    {
        author = new Author(aname,aEmail,aDob);
        this.bookName = bookName;
        this.edition = edition;
        this.price = price;
    }
    public Author getAuthor() {//getter author
        return author;
    }
    public String getBookName() {//getter bookname
        return bookName;
    }


    public String getEdition() {//getter for edition
        return edition;
    }


    public String getPrice() {//getter price
        return price;
    }

    public void setBookName(String bookName) {//setter book name
        this.bookName = bookName;
    }

    public void setEdition(String edition) {//setter edition
        this.edition = edition;
    }

    public void setPrice(String price) {//setter price
        this.price = price;
    }
    public String toString() {
        return this.bookName + "(" + this.edition + "), by " + this.getAuthor().getName() + "(" + this.getAuthor().getEmail() + "), born " + this.getAuthor().getBirthDate() + ", available for $"+this.price;
    }
}
