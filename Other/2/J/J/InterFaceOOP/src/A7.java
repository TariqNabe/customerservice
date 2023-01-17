class A7 implements Printable,Showable
{
    public void cost()
    {
        System.out.println("$100");
    }
    public void brand()
    {
        System.out.println("AMERICA");
    }
    public void size()
    {
        System.out.println("GIANT");
    }
    public void color()
    {
        System.out.println("BLUE");

    }

    public static void main(String args[])
    {
        A7 obj = new A7();
        obj.cost();
        obj.brand();
        obj.size();
        obj.color();
    }
}