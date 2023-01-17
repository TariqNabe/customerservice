import java.util.Scanner;
public class SecondQ
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int a, b, c, d, i = 1;
        System.out.println("Enter Armstrong number: ");
        a = console.nextInt();
        while(i<=500)
        {
            a = i;
            b = a % 10;
            a = a / 10;
            c = a % 10;
            a = a / 10;
            d = a % 10;
            if ((b * b * b) + (c * c * c) + (d * d * d) == i)
            {
                System.out.println("The is Armstrong number " + i);
            }
            i++;
        }
    }
}



//import java.util.Scanner;
//public class SecondQ
//{
//    public static void main(String[] args)
//    {
//        Scanner console = new Scanner(System.in);
//        int a, b, c, count, k = 0, i = 1;
//        System.out.println("Enter Armstrong number: ");
//        a = console.nextInt();
//        while(i<=500)
//        {
//            b = a;
//            c = b % a;
//            b = b / 10;
//            k = b % 10;
//            b = b / 10;
//            count = b % 10;
//            if ((c * c * c) + (k * k * k) + (count * count * count) == a)
//            {
//                System.out.println("This is Armstrong number " + a);
//            }
//            i++;
//        }
//    }
//}


/*
Write a program to print out all Armstrong numbers between 1 and 500.

If sum of cubes of each digit of the number is equal to the number itself,
then the number is called an Armstrong number.
For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )

* */