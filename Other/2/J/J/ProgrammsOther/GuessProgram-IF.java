import java.util.*;
public class GuessProgram-IF
{
      public static void main(String[] args)
      {

            Scanner in = new Scanner(System.in);
         Random rand = new Random();
         
         int guess1=0;
         int guess2=0;
         
                 int first = rand.nextInt(10);
                 int second = rand.nextInt(10);
                 int third = rand.nextInt(10);
                                      System.out.println(first + ""+second+""+third);
             int i=0;
             
               do 
               {
                     System.out.println(" make a guess1: ");
                       System.out.println(" make a guess2: ");
                      guess2 = in.nextInt();
                      
                           
                   if(guess2 / 100 == first)
                       {
                          System.out.println("name2 you're first is correct: " + first + "XX");
                          i = i+1;
                       }
                   if(guess1 / 100 == first)
                       {
                          System.out.println("name1 you're first is correct: " + first + "XX");
                          i = i+1;
                       }
                  if(guess2 / 10 %10 == second )
                       {
                          System.out.println("name2 you're second is correct: " + "X" + second + "X");
                          i = i+1;
                       }
                  if(guess1 / 10 %10 == second)
                       {
                          System.out.println("name1 you're second is correct: " + "X" + second + "X");
                          i = i+1;
                       }
                  if(guess2 % 10 == third)
                       {
                          System.out.println("name2 you're third is correct: " + "XX" + third);
                          i = i+1;
                       }
                  if(guess1 % 10 == third )
                       {
                          System.out.println("name1 you're third is correct: " + "XX" + third);
                          i = i+1;
                       }
                       
               }while(i!=3);
                 
                 
                    if(guess1==first && guess1==second && guess1==third)
               {
                        System.out.println("you won1");
               }
             else if(guess2==first && guess2==second && guess2==third)
               {
                        System.out.println("you won2");
               }
                   
 }
 
 }
 
  