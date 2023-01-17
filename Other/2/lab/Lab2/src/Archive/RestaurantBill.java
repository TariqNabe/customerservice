import java.util.Scanner;

public class RestaurantBill {
        public static void main(String [] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Item: Egg, Pancake, Coffee, $5, $10, $8");
            System.out.println("Enter the number of eggs ordered:");
            int eggs = in.nextInt();


            System.out.println("Enter the number of pancakes ordered:");
            int pancake = in.nextInt();

            System.out.println("Enter the coffees ordered:");
            int coffee = in.nextInt();


            System.out.println("Bill");
            System.out.println("Item,    Quantity, Cost" + " \nEggs" + "\t    " + eggs + "\t\t" + (eggs * 5)
                    + " \npancakes" + "\t" + pancake + "\t\t" + (pancake * 10)
                    + " \ncoffee" + "\t    " + coffee + "\t\t" + (coffee * 8));
            int cost = (eggs * 5) + (pancake * 10) + (coffee * 8);
            System.out.println("\ntotal \t\t\t\t" + cost);





        }
    }


