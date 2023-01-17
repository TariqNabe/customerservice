/*
*
* Tariq Nabe
* Nazim Ashraf
* Assignment6
* 10/31/22
*
*
*
* */


import java.util.ArrayList;
import java.util.Scanner;

public class AuthorMain {//main class name
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Author a1 = new Author("Ada Lovelace", " (no email) ", "12/10/1815");//author class object example
        Author a2 = new Author("Cay Horstmann ", " cay@horstmann.com ", "6/16/1959");//author class object example
        // book class object
        Book b1 = new Book("Big Java: Late Objects", "2nd Edition", "Cay Horstmann", "cay@horstmann.com", "6/16/1959", "112.50");
        ArrayList<Author> authors = new ArrayList<>();//ArrayList for betterbook to hold many authors
        authors.add(a1);//author one added to ArrayList
        authors.add(a2);//author two added to ArrayList
        //betterbook object class is created
        BetterBook b3 = new BetterBook("Elements of Charles Babbage’s Analytical Machine", "1st Edition", authors,"122.42");

        System.out.println(a1 + "\n" + a2 + "\n" + b1 + "\n" + b3);//print to screen using toString method.




    }

}
