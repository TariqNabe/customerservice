import java.util.Scanner;

    public class taskOne {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt();
        int x = 1;


             while(x <= number)
             {

                 if (x % 2 == 0){
                          System.out.println(x + " even");
                          }
                 else{
                          System.out.println(x + " odd");
        }
                 x++;

             }

    }
}
