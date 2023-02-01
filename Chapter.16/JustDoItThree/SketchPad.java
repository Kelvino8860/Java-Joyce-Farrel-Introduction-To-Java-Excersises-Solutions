import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class SketchPad extends JPanel implements MouseListener,MouseMotionListener
{
    
    int xStart,yStart;
    int xStop,yStop;
    BasicStroke aStroke = new BasicStroke(1.0f,
         BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);

    public SketchPad(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    @Override
    public void mousePressed(MouseEvent e){
        xStart = e.getX();
        yStart = e.getY();
    }
    @Override
    public void mouseDragged(MouseEvent e){
         xStop = e.getX();
         yStop = e.getY();
         repaint();
         xStart = xStop;
         yStart = xStop;
    }
   @Override
   public void mouseClicked(MouseEvent e){

   }
   @Override
   public void mouseEntered(MouseEvent e){

   }   
   @Override
   public void mouseExited(MouseEvent e){

   }
   @Override
   public void mouseReleased(MouseEvent e){

   }
   @Override
   public void mouseMoved(MouseEvent e){

   }
   @Override
   public void paintComponent(Graphics g){
       
      Graphics2D gr2D = (Graphics2D) g;
      Line2D.Float line = new Line2D.Float((float)xStart,
           (float)yStart, (float)xStop, (float)yStop);
       gr2D.setStroke(aStroke);
       gr2D.draw(line);
   }

   public static void main(String[] args) {
      
       JFrame frame = new JFrame();
       frame.add(new SketchPad());
       frame.setSize(500,500);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}