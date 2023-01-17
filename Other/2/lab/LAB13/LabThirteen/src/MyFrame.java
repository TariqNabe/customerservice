import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
public class  MyFrame extends JFrame {
    static final int WINDOW_WIDTH = 800;//width
    static final int WINDOW_HEIGHT = 600;//height
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("MARIO");//1-title.
//       static final int WINDOW_WIDTH = 800;
//       static final int WINDOW_HEIGHT = 600;
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ContainerPanel myPanel = new ContainerPanel();
        frame.add(myPanel);
        frame.setVisible(true);
    }
}
