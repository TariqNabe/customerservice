import java.util.ArrayList;
import java.util.Collections;

public class SortExample
{
    public static void main(String[] args)
    {
        ArrayList<Integer> names = new ArrayList<>();
        names.add(2);
        names.add(1);
        names.add(6);
        names.add(4);
        names.add(9);
        names.add(8);
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
    }
}
//Write a program to sort the arraylist
