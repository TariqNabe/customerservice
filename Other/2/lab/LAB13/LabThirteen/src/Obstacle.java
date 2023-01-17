import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Obstacle extends JComponent {
    int x=0;
    int y=0;
    int dx = 10;
    int dy = 5;
    int SIZEX = 800;
    int SIZEY = 600;
    BufferedImage image;

    public Obstacle(int x, int y, int dx, int dy, BufferedImage image) throws IOException {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.image = image;
    }


    @Override
    public void paint(Graphics g) {
        try {
            BufferedImage imagew = ImageIO.read(new File("src/bomb.png"));
            g.drawImage(imagew, x, x, this);
        } catch (IOException e) {
            System.out.printf("An exception happened! %s\n", e.getMessage());
        }
        //super.paint(g);
    }

        void moveObs(int dx, int dy) {
            if( x > SIZEX || x < 0)
            {
                dx = dx;
            }
            if( y > SIZEY || y < 0)
            {
                dy = -dy;
            }
            x =x*-1;
            y = dx+y;
        }
}
