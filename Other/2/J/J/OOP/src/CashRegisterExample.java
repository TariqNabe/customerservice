public class CashRegisterExample
{
    private int itemCount;
    private double totalPrice;
    public CashRegisterExample()
    {
        itemCount = 0;
        totalPrice = 0;
    }
    public void addItem(double price)
    {
        itemCount++;
        totalPrice = totalPrice+price;
    }
    public double getTotal()
    {
        return totalPrice;
    }
    public int getCount()
    {
        return itemCount;
    }
    public void clear()
    {
        itemCount = 0;
        totalPrice = 0;
    }
}
