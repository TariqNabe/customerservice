import java.util.*;
public class As2

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
            int chance = rand.nextInt(2);
        
         System.out.println("Enter player 1 name: ");
         String name1 = in.nextLine();
            
        System.out.println("Enter player 2 name: ");
         String name2 = in.nextLine();
            
        System.out.println("Can you crack the code?"
                   + "\nThe computer has thought of a 3 digit number."
                   + "\nFlipping a coin to decide who goes first.");
            
               if(chance == 0 )
               {
               System.out.println(name1 + " gets the first turn...");
               System.out.println(name1 + " make a guess: ");
                  guess1 = in.nextInt();
               System.out.println("You guessed:" + guess1);
               }
               else if(chance == 1 ){
               System.out.println(name2 + " gets the first turn...");
               System.out.println(name2 + " make a guess: ");
                  guess2 = in.nextInt();
               System.out.println("You guessed:" + guess2);
               }
               
      
                 
            System.out.println(first + ""+second+""+third);
               int i=0;
               do 
               {
                    
                      
                           
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
                 
     
               
               
 
 }
 }
 
 
  
             number = inputFile.next();
             one = inputFile.nextInt();
             two = inputFile.nextInt();
             three = inputFile.nextInt();
            int[][][] output = new int[one][two][3];
            for(int ii=0; ii<one; ii++)
            {
               for(int j=0; j<two; j++)
               {
                  
                     int first = keyboard.nextInt();
                     int second = keyboard.nextInt();
                     int third = keyboard.nextInt();
                     output[ii][j][0]=first;
                     output[ii][j][1]=second;
                     output[ii][j][2]=third;
                
               }
            }
 
        System.out.println("Enter name of output file: ");
        outputFileName = keyboard.nextLine(filename);
        PrintWriter outputFile = new PrintWriter(outputFileName);
        
        System.out.println(outputFileName + " created.");
             System.out.println("\nHere are your choices:");
             System.out.println("[0] exit");
             System.out.println("[1] convert to grayscale");
             System.out.println("[2] flip horizontally");
             System.out.println("[3] negative of red");
             System.out.println("[4] negative of green");
             System.out.println("[5] negative of blue");
             System.out.println("[6] just the reds");
             System.out.println("[7] just the greens");
             System.out.println("[8] just the blues");
             int userInput = keyboard.nextInt();
     
   
        if (userInput == 0)
      {
         System.out.println("Exit.");      
      }
      else if (userInput == 1)
      {
            
      }
        