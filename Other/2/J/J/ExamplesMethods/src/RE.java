import java.util.Scanner;
public class RE {
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter side length");
        int side = in.nextInt();
        printTriangle(side);
    }
    public static void printTriangle(int sideLength)
    {
        if(sideLength<1)
        {
            return;
        }
        printTriangle(sideLength-1);
        for(int i=0;i<sideLength;i++)
        {
            System.out.print("[]");
        }
        System.out.println("");
    }
}
