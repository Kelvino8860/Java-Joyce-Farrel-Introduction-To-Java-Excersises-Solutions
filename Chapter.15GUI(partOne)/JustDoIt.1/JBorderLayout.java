import javax.swing.*;
import java.awt.*;

public class JBorderLayout extends JFrame
{
    private JButton nb = new JButton("North");
    private JButton sb = new JButton("South");
    private JButton eb = new JButton("East");
    private JButton wb = new JButton("West");
    private JButton cb = new JButton("Center");

    public JBorderLayout()
     {
         setLayout(new BorderLayout());
         add(nb, BorderLayout.NORTH);
         add(sb, BorderLayout.SOUTH);
         add(eb, BorderLayout.EAST);
         add(wb, BorderLayout.WEST);
         add(cb, BorderLayout.CENTER);
     }

    public static void main(String[] args)
     {
         JBorderLayout aFrame = new JBorderLayout();
         aFrame.setBounds(300,300,250,250);
         aFrame.setVisible(true);
     }
}