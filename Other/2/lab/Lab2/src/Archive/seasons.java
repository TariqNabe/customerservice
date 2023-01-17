import java.util.Scanner;

public class seasons {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

         System.out.println("Enter the Month: ");
         int month = input.nextInt();

         System.out.println("Enter the date: ");
         int date = input.nextInt();
        if (month == 12 && date >= 22 || month == 1 || month == 2
                || month == 3 && date <= 21)
        {
            System.out.println("Winter");
        }
        else if (month == 3 && date >= 22 || month == 4 || month == 5
                || month == 6 && date <= 20)
        {
            System.out.println("Spring");
        }
        else if (month == 6 && date >= 21 || month == 7 || month == 8
                || month == 9 && date <= 22)
        {
            System.out.println("Summer");
        }
        else if (month == 9 && date >= 23 || month == 10 || month == 11
                || month == 12 && date <= 21)
        {
            System.out.println("Fall");
        }
    }
    }

