/*7. a. Write an application that extends JPanel and displays a yellow smiling face on the
        screen. Save the file as JSmileFacePanel.java. */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class JSmileFacePanel extends JPanel{

    @Override
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        //Head
        g.setColor(Color.YELLOW);
        g.fillOval(50,50,150,150);

        //Eyes
        g.setColor(Color.WHITE);
        g.fillOval(80,80,20,10);
        g.fillOval(155,80,20,10);

        //Eye pupil
        g.setColor(Color.BLACK);
        g.fillOval(87,82,5,5);
        g.fillOval(162,82,5,5);

        //Nose
        g.drawLine(130,100,150,130);
        g.drawLine(150,130,130,140);

        //Mouth
        Graphics2D gr = (Graphics2D)g;
        Arc2D.Float mouth = new Arc2D.Float(110,140,40,40,200,150,Arc2D.OPEN);
        gr.draw(mouth);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JSmileFacePanel());
        frame.setBounds(300,300,300,300);
        frame.setVisible(true);
    }
}