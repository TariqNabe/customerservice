import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class ContainerPanel extends JComponent {
    ArrayList<MyRect> rects = new ArrayList<>();

    public ContainerPanel() {
        MyActionListener listener = new MyActionListener();

        Timer timer = new Timer(50, listener);

        timer.start();

        MyMouseListener mouseListener = new MyMouseListener();

        addMouseListener(mouseListener);

    }

    class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
//            //System.out.println(" Action performed is called");
//
            for( MyRect rectangle : rects ) {
                rectangle.move();
            }


            repaint();

        }
    }


    @Override
    protected void paintComponent(Graphics g) {
        for( MyRect rectangle : rects ) {
            g.fillRect(rectangle.left, rectangle.top, 100, 100);

        }

    }

    class MyMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("mouseClicked" + e.getXOnScreen() + ", " + e.getYOnScreen());

        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("mousePressed");
            System.out.println("mouseClicked" + e.getX() + ", " + e.getY());
            MyRect rect = new MyRect(e.getX(), e.getY(), 5, 5);
            rects.add(rect);

            repaint();

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("mouseReleased");

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("mouseEntered");

        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("mouseExited");

        }
    }
}
