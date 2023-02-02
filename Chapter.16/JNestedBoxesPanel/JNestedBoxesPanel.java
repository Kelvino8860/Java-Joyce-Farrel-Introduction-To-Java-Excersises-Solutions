/*4. Write an application that extends JPanel and displays eight nested rectangles, like
     those in the first panel in Figure 16-43. You may use only one drawRect() statement
     in the program. (Hint: Use it in a loop.) Save the file as JNestedBoxesPanel.java */

import javax.swing.*;
import java.awt.*;

public class JNestedBoxesPanel extends JPanel{

    int x =100;
    int y = 100;
    int width = 5;
    int heigth = 5;
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int i;
        for(i = 0; i < 8; ++i)
        {
            g.drawRect(x,y,width,heigth);
            x -= 10;
            y -= 10;
            width += 20;
            heigth += 20;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JNestedBoxesPanel());
        frame.setBounds(300,300,300,300);
        frame.setVisible(true);
    }
}