public class MonteCarloMethod
{
    public static void main(String[] args)
    {
        final int TIRES = 10000;
        int hits = 0;
        for(int i=1;i<TIRES;i++)
        {
            double r = Math.random();
            double x = -1 + 2 * r;
            r = Math.random();
            double y = -1 + 2 * r;
            if (x * x + y * y <= 1)
            {
                hits++;
            }
        }
        double piEstimate = 4.0*hits/TIRES;
        System.out.println("Estimate for pi: " + piEstimate);
    }
}
