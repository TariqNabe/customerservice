import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class TotalExample
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input File Name: ");
        String inputFileName = sc.next();
        System.out.println("Output File Name: ");
        String outputFileName = sc.next();
        File name1 = new File(inputFileName);
        Scanner in = new Scanner(name1);
        PrintWriter out = new PrintWriter(outputFileName);
        double total = 0;
        while(in.hasNextDouble())
        {
            double value = in.nextDouble();
            out.printf("%15.2f\n", value);
            total = total + value;
        }
        out.printf("Total: %8.2f\n",total);
        in.close();
        out.close();
    }
}
