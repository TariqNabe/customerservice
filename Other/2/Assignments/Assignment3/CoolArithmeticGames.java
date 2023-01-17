


import java.util.Scanner;//Scanner class
import java.util.Random;//Random class

   public class CoolArithmeticGames//Name of class
   {
   
   //Method to implement per required 
   public static int arithGame(int max, int numberOfQuestions, boolean isAdditionGame)
   {
      int points = 0;//Set points to zero to calculate the point during game
      int count = 0;//set counts to zero to count how many questions are correct
      int first;//to generate first random number
      int sec;//to generate second random number

      int actualTotal;// to keep track total point
      int givenTotal;//to keep track given points
      Scanner scanner = new Scanner(System.in);
      Random rand = new Random();
      
      //generate for loop for number questions to ask 
      for (int i = 1; i <= numberOfQuestions; i++) {
         first = rand.nextInt(max);
         sec = rand.nextInt(max);
            if(isAdditionGame == true)//if addtiongame true then addition if false then multipication
             {
               actualTotal = (first+sec);
               System.out.print("\n " + first + " + " + sec +" : ");
               givenTotal = scanner.nextInt();
                  if(actualTotal == givenTotal) {
                     points++;
                     count++;
                  }
            } else if(isAdditionGame == false) {
               actualTotal = (first*sec);
               System.out.print("\n " + first + " * " + sec +" : ");
               givenTotal = scanner.nextInt();
                  if(actualTotal == givenTotal) {
                     points += 2;    
                     count++;       
                  }    
            }
      }
      if(count != numberOfQuestions) {//if count is not met the number of questions then it set to zero
         points = 0;
      }

     
     return points;
   }

      public static void main(String[] args)//main method
      {
            Scanner scanner = new Scanner(System.in);//Scanner object
            
            boolean isAdditionGame;


            int score=0;
            int curWinStreak = 0;
            int longWinStreak = 0;
            int points;
            int choice;
            int num;
            int max;  
            int numberOfQuestions;
            
            
                 System.out.print("\n " + "Welcome to CoolArithmeticGames!");
           
            do//do loop been used to display the menu until quit.
            {
                  System.out.print("\n Please make a selection from the following:"
                             + "\n1. Play Arithmetic Game."
                             + "\n2. View Hall of Fame."
                             + "\n3. Quit. \n");
                             choice = scanner.nextInt();
 
            if(choice==1)//input 1 
                {
                  System.out.print("\n Would you like (1) addition or (2) multiplication?");
                  num = scanner.nextInt();
                    
                  do//validation max number {
                     System.out.print("\n Enter the maximum number, which must be greater than your score" + "("+score+")");
                     max = scanner.nextInt();
                     if(max <= score) {
                        System.out.print("\n That max number is too low, please try again.");
                     }
                  } while (max <= score);
                  
                  //math.ceil to generate total number of questions to be asked  based on score
                  numberOfQuestions = (int) Math.ceil(score/5.0 + 1);
                        
                  if(num == 1) //number input 1 for addition game 
                  {  
                     isAdditionGame = true;
                     points = arithGame(max, numberOfQuestions, isAdditionGame);
                     if(points > 0){
                        System.out.print("\n You got " +  points + " points for winning!");
                        score = score + points;
                        curWinStreak++;//to keep track current winning streak
                        if(curWinStreak > longWinStreak){
                           longWinStreak = curWinStreak;
                        }
                     }else //if lose current streak set to zero{
                        System.out.print("\n You got " +  points + " points for losing.");
                        curWinStreak = 0;
                     }
                     
                     
                     } else if(num == 2)//this input for multiplication
                             {
                              isAdditionGame = false;
                              points = arithGame(max, numberOfQuestions, isAdditionGame);
                              if(points > 0){
                                 System.out.print("\n You got " +  points + " points for winning!");
                                 score = score + points;
                                 curWinStreak++;//current streak tracking scope
                                 if(curWinStreak > longWinStreak){
                                    longWinStreak = curWinStreak;
                                 }
                              }else {
                                 System.out.print("\n You got " +  points + " points for losing.");
                                 curWinStreak = 0;
                              }
                                             }    
                     } else if(choice==2)//the menu for hall fame by input 2
                           {
                               System.out.print("\n ===== Hall of Fame =====");
                               System.out.print("\n your score: " + score);
                               System.out.print("\n Current round win streak: " + curWinStreak);
                               if(curWinStreak > 0)//if used for current win track during the game {
                                 System.out.print(", and still going.");
                               }
                               System.out.print("\n Longest round win streak: " + longWinStreak);
                               System.out.print("\n =========================");
                     } else if(choice==3)//input user 3 goes for quit {
                               System.out.print("Goodbye!");
                               break;//to break loop
                     }
                 }while(choice != 1 || choice != 2 || choice != 3); //loop choices


                
      }//end of code
}//end of program
              
              
              
