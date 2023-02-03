/*b. Add a JButton to the JSmileFacePanel program so the smile changes to a frown
     and then back to a smile each time the user clicks the JButton. Save the file as
     JSmileFacePanel2.java. */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class JSmileFacePanel2 extends JPanel implements ActionListener{

       JButton button = new JButton("Press me");
       String expression = "smile";
       Arc2D.Float mouth = new Arc2D.Float(110,140,40,40,200,150,Arc2D.OPEN);;

       public JSmileFacePanel2(){

           setLayout(new BorderLayout());
           this.add(button,BorderLayout.SOUTH);
           button.addActionListener(this);
       }

       @Override
       public void actionPerformed(ActionEvent e){
             
            if(expression.equals("smile"))
            {
                mouth = new Arc2D.Float(110,140,40,40,200,150,Arc2D.OPEN);
                expression = "frown";
            }
            else
            if(expression.equals("frown"))
            {
                mouth = new Arc2D.Float(110,160,40,40,0,180,Arc2D.OPEN);
                expression = "smile";
            }

            repaint();
       }

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
        gr.draw(mouth);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JSmileFacePanel2());
        frame.setBounds(300,300,300,300);
        frame.setVisible(true);
    }
}