public class TryExampleThree
{
    public static void main(String[] args)
    {
        try
        { // code that generates exception
             int divideByZero = 5 / 0;
        } catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        } finally
        { System.out.println("This is the finally block");
        }
    }
}