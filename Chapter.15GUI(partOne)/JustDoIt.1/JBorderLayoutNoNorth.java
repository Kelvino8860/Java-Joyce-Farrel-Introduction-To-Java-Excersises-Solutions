import javax.swing.*;
import java.awt.*;

public class JBorderLayoutNoNorth extends JFrame
{
    private JButton sb = new JButton("South");
    private JButton eb = new JButton("East");
    private JButton wb = new JButton("West");
    private JButton cb = new JButton("Center");

    public JBorderLayoutNoNorth()
     {
         setLayout(new BorderLayout());
         add(sb, BorderLayout.SOUTH);
         add(eb, BorderLayout.EAST);
         add(wb, BorderLayout.WEST);
         add(cb, BorderLayout.CENTER);
     }

    public static void main(String[] args)
     {
         JBorderLayoutNoNorth aFrame = new JBorderLayoutNoNorth();
         aFrame.setBounds(300,300,250,250);
         aFrame.setVisible(true);
     }
}