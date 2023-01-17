import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PracticeIf {
    public static void main(String[] args)
    {
            JFrame frame = new JFrame();
        JButton button = new JButton("Select Image");
        JButton button2 = new JButton("Save Image");

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(button2);
        frame.add(panel);

            frame.setSize(300,400);
            frame.setTitle("Image Editor");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setVisible(true);


    }
}
