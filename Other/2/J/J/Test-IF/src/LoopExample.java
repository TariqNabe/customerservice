import java.util.Scanner;

public class LoopExample  {
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        double sum = 0;
        double salary = 0;
        int count = 0;
        double average;

        System.out.println("Enter the salary: or enter -1 to finish");

        while(salary>-1)
        {
            salary = in.nextDouble();

            if(salary!=-1)
            {
                sum = sum + salary;
                count++;
            }
        }
        if(count>0)
        {
            average = sum/count;
            System.out.println("Average salary is: "+ average);
        }
        else
        {
            System.out.print("Exit");
        }





    }
}
