import java.util.Arrays;

public class StaticPractice
{
    public static void main(String[]args)
    {
        int arr1[] = {11,22,33,44,55,66,77,88,99};
        int arr2[] = {111,222,333,444,555,666,777,888,999};
        int arr3[]=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++)
        {
             arr3[i]=arr1[i];
        }
        for(int i=0,j=arr1.length;j<(arr1.length+arr2.length);i++,j++)
        {
            arr3[j]=arr2[i];
        }
        System.out.println("Array1= "+Arrays.toString(arr1));
        System.out.println("Array2= "+Arrays.toString(arr2));
        System.out.println("Array3= "+Arrays.toString(arr3));
    }
}
