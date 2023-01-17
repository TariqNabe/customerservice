public class AbstractTest
{
    public static void main(String[] args)
    {
        Shape shape;
        shape = new Circle(5);
        System.out.println("Area of circle =" +
                " " + shape.area());
        shape = new Rectangle(5, 10);
        System.out.println("Area of rectangle = "
                + shape.area());
    }
}