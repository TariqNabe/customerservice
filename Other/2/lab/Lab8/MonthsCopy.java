import java.util.Scanner;
public class MonthsCopy{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a month as input to convert in numeric format"
        + "\nEnter the Month: ");

        int month = keyboard.nextInt();
        try {
               System.out.println(getMonthNumber(month));
            }
            
            catch (IllegalArgumentException e)
             {
                  System.out.println("Error: " + e.getMessage());
                               }
       
    }


public static String getMonthNumber(int monthNumber) throws IllegalArgumentException
{
      
      String[] month = {"It is January!",
      "It is February!",
      "It is March!",
      "It is April!",
      "It is May!",
      "It is June!",
      "It is July!",
      "It is August!",
      "It is October!",
      "It is September!",
      "It is November!",
      "It is December!",
      };

      if(monthNumber < 1 || monthNumber > 12)
      {
          throw new IllegalArgumentException("Invalid Month Number");
      }else {
               return month[monthNumber-1];
      }

}
}