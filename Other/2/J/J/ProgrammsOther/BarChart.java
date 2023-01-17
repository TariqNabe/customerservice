import java.util.Scanner;
   public class BarChart
   {
      public static void main(String[] args)
      {
               Scanner in = new Scanner(System.in);
               int sales1, sales2, sales3, sales4, sales5;  
             int i;
             
                 System.out.print("\n Enter today's sales for store: 1:");
                   sales1 = in.nextInt();
                  
                 System.out.print("\n Enter today's sales for store: 2:");
                   sales2 = in.nextInt();
                  
                 System.out.print("\n Enter today's sales for store: 3:");
                   sales3 = in.nextInt();
                  
               
                 System.out.print("\n Enter today's sales for store: 4:");
                   sales4 = in.nextInt();
                  
               
                 System.out.print("\n Enter today's sales for store: 5:");
                   sales5 = in.nextInt();
                  
               
              System.out.print("\n SALES BAR CHART");
   
              System.out.print("\n STORE 1: ");
              for (i=1; i<=sales1/100; i++)
              {
                  System.out.print("*");
              
              }

                  System.out.print("\n STORE 2: ");
              for (i=1; i<=sales2/100; i++)
              {
                  System.out.print("*");
              
              }
              
      System.out.print("\n STORE 3: ");
              for (i=1; i<=sales3/100; i++)
              {
                  System.out.print("*");
              
              }
                   System.out.print("\n STORE 4: ");
              for (i=1; i<=sales4/100; i++)
              {
                  System.out.print("*");
              
              }   
                  System.out.print("\n STORE 5: ");
              for (i=1; i<=sales5/100; i++)
              {
                  System.out.print("*");
              
              }
               
      
      }
   
   }