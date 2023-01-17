import javax.swing.*;
import java.awt.*;
public class GUIBASICTWO
{
    public static void main(String[] args)
    {
        JFrame j = new JFrame("GUI FRAME");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(500,500);
        JTextField t = new JTextField(50);
        JMenu m = new JMenu("File");
        JMenu f1 = new JMenu("Location");
        JMenuBar k = new JMenuBar();
        k.add(m);
        k.add(f1);
        JTextField t1 = new JTextField(10);
        JButton b1 = new JButton("REST");
        JButton b2 = new JButton("SEND");
        JLabel kk = new JLabel("THE TEXT");
        JTextField t2 = new JTextField(10);
        JPanel p = new JPanel();
        JPanel p1 = new JPanel();
        p.add(k);
        p.add(t);
        p1.add(kk);
        p1.add(t2);
        p1.add(b1);
        p1.add(b2);
        p1.add(t1);
        j.getContentPane().add(BorderLayout.NORTH,k);
        j.getContentPane().add(BorderLayout.CENTER,p);
        j.getContentPane().add(BorderLayout.SOUTH,p1);
        j.setVisible(true);
    }
}
