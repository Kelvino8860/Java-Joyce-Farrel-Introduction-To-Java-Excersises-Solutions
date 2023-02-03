/*6. Write an application that extends JPanel and displays diagonal lines in a square, like
     those in the last panel in Figure 16-43. Save the file as JDiagonalLinesPanel.java. */

     import javax.swing.*;
     import java.awt.*;

     public class JDiagonalLinesPanel extends JPanel{

        final int x = 50;
        final int y = 50;
        final int WIDTH = 150;
        final int HEIGHT = 150;
        int startX = 50,startY = 50;
        int stopX = 50,stopY = 50;

        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            int i,j;
            g.drawRect(x, y, WIDTH, HEIGHT);

            for(i = 0; i < 60; ++i){
                
                if(i <= 29){
                  startX += 5;
                  stopY += 5;
                  g.drawLine(startX,startY,stopX,stopY);
                }
               else
                if(i > 29){ 
                      startY += 5;
                      stopX += 5;
                      g.drawLine(startX,startY,stopX,stopY);
                }
            }
        }

        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new JDiagonalLinesPanel());
            frame.setBounds(300,300,300,300);
            frame.setVisible(true);
        }
     }