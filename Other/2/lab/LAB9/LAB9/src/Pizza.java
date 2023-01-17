public class Pizza extends Circle
{
   private String topping;
   private double price;
   private double diameter;
   public Pizza()
   {
       topping = "";
       price = 0;
       diameter = 0;
   }

    public double getPrice() {
        return price;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
