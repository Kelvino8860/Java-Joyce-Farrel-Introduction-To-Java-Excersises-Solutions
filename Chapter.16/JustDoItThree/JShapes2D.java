import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class JShapes2D extends JPanel{
    
    @Override
    public void paintComponent(Graphics gr){
          super.paintComponent(gr);
          Graphics2D gr2D = (Graphics2D) gr;

          //Draw a rectangle
          Rectangle2D.Float rect = 
            new Rectangle2D.Float(20,15,40,40);
          Rectangle2D.Float rect2 = 
            new Rectangle2D.Float(20,70,40,40);
          gr2D.draw(rect);
          gr2D.fill(rect2);

        //Draw an ellipse
          Ellipse2D.Float ellipse = new
            Ellipse2D.Float(20,120,40,40);
          Ellipse2D.Float ellipse2 = new 
             Ellipse2D.Float(20,170,40,40);
          gr2D.draw(ellipse);
          gr2D.fill(ellipse2);

          //Draw two arcs
          Arc2D.Float ac = new
             Arc2D.Float(20,220,50,50,30,120,Arc2D.PIE);
          Arc2D.Float ac2 = new
             Arc2D.Float(20,270,50,50,30,120,Arc2D.PIE);   
          gr2D.draw(ac);
          gr2D.fill(ac2);   

          //Draw polygon
          GeneralPath pol = new GeneralPath();
          pol.moveTo(20, 300);
          pol.lineTo(40,360);
          pol.lineTo(100,380);
          pol.closePath();
          gr2D.draw(pol);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JShapes2D());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,300,200,430);
        frame.setVisible(true);
    }
}
