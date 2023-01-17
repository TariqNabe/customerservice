import java.util.Scanner;
import java.util.Arrays;
class Main {
    public int[] add()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int s=sc.nextInt();
        int [] arr=new int[s+1];
        int i;
        System.out.println("The Elements are:");
        for(i=0;i<s;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value to be added:");
        arr[i]=sc.nextInt();
        System.out.println("The Modified Values are:");
        for(i=0;i<(s+1);i++)
        {
            System.out.println(arr[i]+" ");
        }
        return arr;
    }
    public static void main(String[] args)
    {
        Main m=new Main();
        int a[]=m.add(); //Calling a method inside main function to create an array
        System.out.println("Array:"+Arrays.toString(a));
    }
}