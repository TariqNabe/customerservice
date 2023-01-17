import java.util.Scanner;
import java.util.ArrayList;

   public class TaskTwo {
    public static void main(String[] args) {

         Scanner in = new Scanner(System.in);
         ArrayList<Integer> vectorOne = new ArrayList<Integer>();
         ArrayList<Integer> vectorTwo = new ArrayList<Integer>();

        
         System.out.println("Enter size of vector: ");
         int num = in.nextInt();

         System.out.println("Enter"+num+" coefficients of the first vector: ");
                 
        for (int i = 0; i < num; i++) {
            int n = in.nextInt();
            vectorOne.add(n);
        }
        
        System.out.println("Enter"+num+" coefficients of the second vector: ");
                 
        for (int  i  = 0; i < num; i++) {
            int n = in.nextInt();
            vectorTwo.add(n);
        }

   
        double sum = 0.0;
        for (int i = 0; i < vectorOne.size(); i++) {
            sum += (vectorOne.get(i) - vectorTwo.get(i)) * (vectorOne.get(i) - vectorTwo.get(i));
        }
        
        double eucDist =  Math.sqrt(sum);
        System.out.println("The Euclidean distance is: " + eucDist);

    }

  }
