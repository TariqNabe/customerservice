import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class ContainerPanel extends JComponent implements MouseMotionListener
{
    int mouseX;
    int mouseY;
    ArrayList<Obstacle> myObstacles = new ArrayList<>();
    private int xLeft;
    private int yTop;
    public ContainerPanel() {
        addMouseMotionListener(this);
        xLeft = 0;
        yTop = 0;
        try {
            BufferedImage bombImg = ImageIO.read(new File("src/bomb.png"));
            Obstacle obs1 = new Obstacle(100, 200, 50, 52, bombImg);
            Obstacle obs2 = new Obstacle(200, 20, 300, 52, bombImg);
            Obstacle obs3 = new Obstacle(400, 30, 50, 300, bombImg);
            Obstacle obs4 = new Obstacle(500, 40, 50, 300, bombImg);
            myObstacles.add(obs1);
            myObstacles.add(obs2);
            myObstacles.add(obs3);
            myObstacles.add(obs4);
        } catch (IOException e) {
            System.out.println("error creating and adding obstacles ...");
        }
        Timer myTimer = new Timer(100, new timerActionListener());
        myTimer.setRepeats(true);
        myTimer.start();
    }
    class timerActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            for(Obstacle obs : myObstacles){
                obs.moveObs(0,0);
            }
            repaint();
        }
    }
        public void mouseMoved(MouseEvent event)
        {
            mouseX = event.getX();
            mouseY = event.getY();

            repaint();
        }
    public void mouseDragged(MouseEvent event)
    {}
    @Override
    public void paint(Graphics g)
    {
            try {
                BufferedImage image = ImageIO.read(new File("src/mario.png"));
                g.drawImage(image, mouseX, mouseY, this);
                for(Obstacle currentObs : myObstacles)
                {
                    currentObs.moveObs(5, 5);
                }
                g.drawImage(myObstacles.get(0).image, myObstacles.get(0).x, myObstacles.get(0).y, this);
                g.drawImage(myObstacles.get(1).image, myObstacles.get(1).x, myObstacles.get(1).y, this);
                g.drawImage(myObstacles.get(2).image, myObstacles.get(2).x, myObstacles.get(2).y, this);
                g.drawImage(myObstacles.get(3).image, myObstacles.get(3).x, myObstacles.get(3).y, this);

            } catch (IOException e)
            {
                System.out.printf("An exception happened! %s\n", e.getMessage());
            }

        //super.paint(g);
    }
}
