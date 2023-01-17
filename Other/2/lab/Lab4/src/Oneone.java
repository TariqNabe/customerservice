import java.util.Scanner;


public class Oneone
{
      public static void main(String[] args)
      {
               int count = 0;
               Scanner in = new Scanner(System.in);
               System.out.println("Enter a word");
               String word = in.nextLine();
               
               System.out.println("Enter a character");
               char ch = in.nextLine().charAt(0);
               
                                 
                  for(int i=0; i<word.length(); i++)
                    {
                      if(ch==word.charAt(i)) {
                        count += 1;
                    }   
                  }
                  System.out.print("\n " + ch + " appears " + count+ " times in " + word); 
       
      }  
}