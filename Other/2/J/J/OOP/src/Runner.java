public class Runner
{
    public static void main(String[] args)
    {
        CashRegisterExample register1 = new CashRegisterExample();
        register1.addItem(1.95);
        register1.addItem(0.95);
        register1.addItem(2.50);
        System.out.println(register1.getCount());
        System.out.println("Expected : 3");
        System.out.printf("%.2f\n",register1.getTotal());
        System.out.println("Expected : 5.40");
    }
}
