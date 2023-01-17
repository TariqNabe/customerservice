import java.util.ArrayList;
import java.util.Scanner;

   public class TaskOne
   {
   
   
   
   
   
         public static void main(String []args)
         {
         
              Scanner in = new Scanner(System.in);
              ArrayList<Double> newList = new ArrayList<Double>();
             
              
              double sum=0;
              
              double mean=0;
             
              double highest=0;
              double lowest=0;
             
              double another;

               System.out.println("Enter number of items: ");
               int number = in.nextInt();
              
               int i=0;
           
           while(i<number)
           {
                 System.out.println("Enter numbers:");
                 another=in.nextInt();
                 newList.add(another);
                 i++;
             
             }
             
            highest = newList.get(0);
            lowest = newList.get(0);
             
            for(Double num: newList)
            {
               sum = sum + num;
               if(num > highest)
                  {
                   highest = num;
                  }
               else if(num < lowest)
                  {
                   lowest = num;
                  }   
            } 
            
               mean = sum/number;
               System.out.println("Mean : " + mean);  
               System.out.println("Highest : " + (int)highest);  
               System.out.println("Lowest : " + (int)lowest);  

       
                 
        
         
         }
        
   
   
   }