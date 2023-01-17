public class Downcasting
{
    public static void main(String[] args)
    {
//        Parent p = new Child();
//        p.name = "Shubham";
        // Performing Downcasting Implicitly
        //Child c = new Parent(); // it gives compile-time error
        // Performing Downcasting Explicitly
        Parent p = new Child();//upcasting 99 upcasting used more access both super and sub
        Child c = (Child)p;//downcasting
        c.age = 18;
        System.out.println(c.name);
        System.out.println(c.age);
        c.showMessage();
    }
}