import java.util.ArrayList;
public class CheckSizeExample
{
    public static void main(String[]args)
    {
        ArrayList<Integer> names = new ArrayList<>();
        names.add(11);
        names.add(22);
        names.add(33);
        names.add(44);
        names.add(55);
        System.out.println(names);
        int num = names.size();
        System.out.println("The size of array is "+num);
    }
}
//Write a program to check the size of arraylist.