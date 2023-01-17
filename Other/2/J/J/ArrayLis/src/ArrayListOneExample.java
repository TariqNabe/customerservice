import java.util.ArrayList;

public class ArrayListOneExample
{
    public static void main(String [] args)
    {
        ArrayList<String>names = new ArrayList<>();
        names.add("Cindy");
        names.remove(0);
        names.add("F");
        names.add(1,"K");
        names.remove(1);
        names.add("ALL");
        names.set(1,"J");
        names.set(1,"W");
        System.out.println(names);
        ArrayList<Integer>name = new ArrayList<>();
        name.add(11);
        name.remove(0);
        name.add(22);
        name.add(1,33);
        name.remove(1);
        name.add(44);
        name.set(1,55);
        name.set(1,66);
        System.out.println(name);
    }
}
