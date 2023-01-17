import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFRAME
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Button Example");
        final JTextField tf = new JTextField();
        tf.setBounds(50,50,150,20);
        JButton b = new JButton("Click Here");
        b.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

            }
        }
        );
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
//        JFrame j = new JFrame("Welcome to JFrame");
//        JTextField t = new JTextField(40);
//        JButton b = new JButton("Click here");
//        b.setBounds(40,100,100,100);
//        JPanel p = new JPanel();
//        p.add(t);
//        j.add(b);
//        j.setSize(400,400);
//        j.getContentPane().add(BorderLayout.SOUTH,p);
//        j.setLayout(null);
//        j.setVisible(true);
    }
}
