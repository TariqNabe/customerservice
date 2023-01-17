import java.util.Scanner;
public class TaskFour {
    public static void main(String[] args)
    {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter n:");
            int n = in.nextInt();
        System.out.println("Enter m:");
        int m = in.nextInt();
          System.out.print("X | ");
        
         for( int k=1; k<=m; k++)
         {
         System.out.print(k + "  ");
         }
           System.out.println("\n-------------");
           for( int k=1; k<=n; k++)
         {
         System.out.print(k + " | ");
         
         //   for(int i=1; i<=n; i=i+1)
//         {
          
           for(int j=1; j<=m; j=j+1)
           {
               System.out.print(" " + k * j);
           }
           
            System.out.println();
       //} 
        }


    }
}
