import java.awt.*;
import javax.swing.*;
import java.awt.Color;

public class  JFrameWithColor extends JFrame
{
     private final int SIZE = 180;
     private Container con = getContentPane();
     private JButton button = new JButton("Press Me");
     
     public JFrameWithColor()
      {
         setSize(SIZE,SIZE);
         con.setLayout(new FlowLayout());
         con.add(button);
         con.setBackground(Color.YELLOW);
         button.setBackground(Color.RED);
         button.setForeground(Color.WHITE);
      }

      public static void main(String[] args)
        {
           JFrameWithColor frame = new JFrameWithColor();
           frame.setVisible(true);
        }
}