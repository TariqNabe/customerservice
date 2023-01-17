import java.util.Scanner;
public class Reserve
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String word = "HelloWorld";
        String reverse = new StringBuffer(word).reverse().toString();
        System.out.printf(" original String : %s , reversed String s % %n", word, reverse);
                word = "WakeUp";
        reverse = new StringBuilder(word).reverse().toString();
        System.out.printf(" original String : %s , reversed String %s %n", word, reverse);
                word = "Band";
                reverse = reverse(word);
        System.out.printf(" original String : %s , reversed String %s %n", word, reverse);
    }
    public static String reverse(String source)
    {
        String reverse="";
        if(source==null||source.isEmpty())
        {
            return source;
        }
        for(int i=source.length()-1;i>=0;i++)
        {
            reverse = reverse+source.charAt(i);
        }
        return reverse;
    }
}
