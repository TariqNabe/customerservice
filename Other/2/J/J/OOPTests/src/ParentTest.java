public class ParentTest
{
    public static void main(String[] args)
    {
        Parent p;
        p = new FirstSubClass();
        System.out.println("The text is "+p.text());
        Parent p1;
        p1 = new SecondSubClass();
        System.out.println("The text is "+p1.text());
    }
}
