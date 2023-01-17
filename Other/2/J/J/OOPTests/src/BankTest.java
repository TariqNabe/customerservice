public class BankTest
{
    public static void main(String[]args)
    {
        Bank b = new BankA();
        System.out.println("The first bank deposited: "+b.getBalance(100));
        Bank b1 = new BankB();
        System.out.println("The second bank deposited: "+b.getBalance(150));
        Bank b3 = new BankC();
        System.out.println("The third bank deposited: "+b.getBalance(200));
    }
}
