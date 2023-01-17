import javax.swing.*;
import java.awt.*;
public class BasicGUI
{
    public static void main(String[] args)
    {
        JFrame j = new JFrame("GUI");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(500,500);
        JMenuBar m=new JMenuBar();
        JMenu f= new JMenu("File");
        JMenu h=new JMenu("Help");
        JButton button1 = new JButton("SEND");
        JButton button2 = new JButton("RESET");
        m.add(f);
        m.add(h);
        JMenuItem f1=new JMenuItem("new file");
        JMenuItem f2=new JMenuItem("save as");
        f.add(f1);
        f.add(f2);
        JLabel t=new JLabel();
        JPanel p=new JPanel();
        JLabel l=new JLabel("Enter the text");
        JTextField t1=new JTextField(20);
        p.add(l);
        p.add(t1);
        p.add(button1);
        p.add(button2);
        j.getContentPane().add(BorderLayout.SOUTH,p);
        j.getContentPane().add(BorderLayout.NORTH,m);
        j.getContentPane().add(BorderLayout.CENTER,t);
        j.setVisible(true);
    }
}
