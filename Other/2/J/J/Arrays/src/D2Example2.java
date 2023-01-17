import java.util.Scanner;
public class D2Example2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int rows, cols;
        System.out.println("Enter number of rows: ");
        rows = in.nextInt();
        System.out.println("Enter number of columns: ");
        cols = in.nextInt();
        int arr1[][] = new int[rows][cols];
        System.out.println("Enter the Matrix:");
        for(int i=0;i<arr1.length;i++)
        {
                System.out.println("Enter number for row : " +(i+1)+"and press enter");
                for(int j=0;j<arr1.length;j++)
                {
                    arr1[i][j]=in.nextInt();//0,0 , 0,1 , 0,2 //1,0 , 1,1 , 1,2 //2,0 , 2,1 , 2,2
                }
        }
        System.out.println("Matrix Entered ");
        for(int i=0;i<rows;i++)
        {
            System.out.println();
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr1[i][j]+",");
            }
//
        }
        System.out.println();
        findMaxEachRow(arr1);
    }
    private static void findMaxEachRow(int[][]matrix)
    {
        int[] result = new int[matrix.length];
//        int max = array[0];
//        for(int i=1;i<array.length;i++)
//        {
//            if(max > array[i])
//            {
//                max=array[i];
//            }
//        }
        for(int i=0;i<matrix.length;i++)
        {
            int max = matrix[i][0];
            for(int j=0;j<matrix[i].length;j++)
            {
                if(max<matrix[i][j])
                {
                    max=matrix[i][j];
                }
                result[i]=max;
            }
        }
        for(int i=0;i<result.length;i++)
        {
            System.out.println("Maximum element in row"+(i+1)+":"+result[i]);
        }
    }
}

//write java program and find out the largest in each row.

