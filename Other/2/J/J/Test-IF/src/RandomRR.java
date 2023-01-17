public class RandomRR
{
    public static void main(String[] args)
    {
        for(int i=1;i<=10;i++)
        {
            int numberOne = (int)(Math.random()*6)+1;
            int numberTwo = (int)(Math.random()*6)+1;
            System.out.println(numberOne + "    " + numberTwo);
        }
        System.out.println();
    }
}
