import java.util.Scanner;
public class ThirdQ {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int input = in.nextInt();
        double a = 0.0;
        int b=0;
        for(int i=1; i<=input;i++)
        {
            a+=(1.0*b)/i;
            b*=-1;
        }
        System.out.println("log2:"+b);
    }
}



/*
 Compute the natural logarithm of 2, by adding up to n terms in the series
1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
where n is a positive integer and input by user.
* */