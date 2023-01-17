import java.util.ArrayList;

public class ExampleFive
{
    public static void main(String[] args)
    {
        ArrayList<Integer> names = new ArrayList<>();
        names.add(1);
        names.add(2);
        names.add(3);
        names.add(4);
        names.add(5);
        System.out.println(names);
        names.set(4,7);
        System.out.println(names);
    }
}
//Print an array list and add a value to the fourth position of the list