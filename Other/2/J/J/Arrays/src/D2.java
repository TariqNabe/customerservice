import java.util.Scanner;
public class D2
{
    public static void main(String[] args)
    {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("Enter Element");
                arr[i][j]=sc.nextInt();
                System.out.println();
            }
        }
        System.out.println("Printing Elements...");
        for(int i=0;i<3;i++)
        {
            System.out.println();
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
        }
//        System.out.println("Enter how many rows");
//        int rows = in.nextInt();
//        System.out.println("Enter how many columns");
//        int cols = in.nextInt();
//        int arr1[][] = new int[rows][cols];
//        int i,j;
//        System.out.println("Enter elements to be saved in Array row: ");
//        for(i=0;i<rows;i++)
//        {
//            int elements = in.nextInt();
//            elements = elements + rows;
//        }
//        System.out.println("Enter elements to be saved in Array columns: ");
//        for(i=0;i<rows;i++)
//        {
//            for(j=0;j<cols;j++)
//            {
//                int elements = in.nextInt();
//                elements = elements + cols;
//            }
//        }
//        for(i=0;i<rows;i++)
//        {
//            for(j=0;j<cols;j++)
//            {
//                System.out.println(arr1[i][j]);
//            }
//        }
    }
}
















