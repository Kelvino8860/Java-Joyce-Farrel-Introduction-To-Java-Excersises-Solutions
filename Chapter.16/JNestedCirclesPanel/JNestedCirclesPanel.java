/*5. Write an application that extends JPanel and displays 15 nested circles, like those in
      the center panel in Figure 16-43. You may use only one drawOval() statement in the
      program. Save the file as JNestedCirclesPanel.java.
 */

 import javax.swing.*;
 import java.awt.*;

 public class JNestedCirclesPanel extends JPanel{

    int x = 200;
    int y = 200;
    int width = 10;
    int height = 10;

    @Override
    public void paintComponent(Graphics g){
      
          super.paintComponent(g);
          int i;
          for(i = 0; i < 15; ++i){
            g.drawOval(x, y,width,height);
            x -= 10;
            y -= 10;
            width += 20;
            height += 20;
          }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JNestedCirclesPanel());
        frame.setBounds(300,300,400,400);
        frame.setVisible(true);
    }
 }
