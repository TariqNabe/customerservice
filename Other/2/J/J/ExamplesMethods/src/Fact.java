import java.util.Scanner;
public class Fact {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number upto which fibonaaciseries: ");
        int x = in.nextInt();
        System.out.println("Fibonaaciseries up to this number: " + x + " numbers");
        for (int i=1; i<=x; i++) {
            //System.out.print(Fib(i) + " ");
            System.out.print(fibonacci(i) + " ");
        }
    }
//
//    public static int Fib(int y) {
//        int f1 = 1;
//        int f2 = 1;
//        int f = 1;
//        if (y == 1 || y == 2) {
//            return 1;
//        }
//        for (int i=3; i<=y; i++) {
//            f = f1 + f2;
//            f1 = f2;
//            f2 = f;
//        }
//        return f;
//    }

    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2); //tail recursion }
    }
}

//Write a program to Print Fibonacci Series in Java using Recursion?