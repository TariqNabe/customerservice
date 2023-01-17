import javax.swing.*;
import java.awt.*;

public class MyRect extends JComponent {
    int SIZEX = 400;
    int SIZEY = 600;


    int left, top;

    int dx, dy;

    public MyRect() {
        left = 0;
        top = 0;

        dx = 10;
        dy = 5;
    }

    public MyRect(int left, int top, int dx, int dy) {
        this.left = left;
        this.top = top;
        this.dx = dx;
        this.dy = dy;
    }


    @Override
    protected void paintComponent(Graphics g) {
        g.fillRect(left, top, 1200, 100);
    }

    void move() {
        if( left + dx > SIZEX || left + dx < 0) {
            dx = -dx;
        }

        if( top + dy > SIZEY || top + dy < 0) {
            dy = -dy;
        }

        left += dx;
        top += dy;
    }
}
