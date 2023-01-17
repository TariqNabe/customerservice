import java.util.ArrayList;
import java.util.Scanner;

public class ExampleTwo
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> value = new ArrayList<>();
        value.add(11);
        value.add(22);
        value.add(33);
        value.add(44);
        value.add(55);
        int num = value.get(1);
        System.out.println("Element at index 1: "+num);
    }
}

//Print an Array List and get the value indexed at 1