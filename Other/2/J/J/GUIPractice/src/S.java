import javax.swing.*;
public class S extends JFrame
{
    JFrame f;
    S()
    {
        JButton b = new JButton("click");
        b.setBounds(130,100,100,40);//setBounds(int x-coordinate, int y-coordinate, int width, int height)
        add(b);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new S();//Calling function

    }
}
