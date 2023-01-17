import java.util.ArrayList;

public class ExampleFOUR
{
    public static void main(String[] args)
    {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);
        System.out.println(values);
        values.remove(6);
        System.out.println(values);
    }
}

//Print an array list and remove the last value in the list
