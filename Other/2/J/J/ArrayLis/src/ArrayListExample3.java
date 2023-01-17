import java.util.ArrayList;

public class ArrayListExample3
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("DOG");
        names.add("CAT");
        names.add("BIRD");
        names.add("FISH");
        names.add("RAT");
        System.out.println(names);
        names.set(2,"MONKEY");
        System.out.println(names);
    }
}
//Print an array list and change the third value in the list