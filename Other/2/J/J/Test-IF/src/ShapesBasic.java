import java.awt.*;

public class ShapesBasic
{
    public static void draw(Graphics g)
    {
        final int width = 20;
        g.setColor(Color.BLUE);
        int x = 0;
        int y = 0;
        for(int i=0;i<10;i++)
        {
            g.fillRect(x,y,width,width);
            x = x+2*width;
        }
        x = width;
        y = width;
        for(int i=0;i<10;i++)
        {
            g.fillRect(x,y,width,width);
            x = x+2*width;
        }
    }
}
