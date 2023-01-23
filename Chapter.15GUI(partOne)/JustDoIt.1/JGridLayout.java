import javax.swing.*;
import java.awt.*;

public class JGridLayout extends JFrame
{
    private JButton nb = new JButton("North");
    private JButton sb = new JButton("South");
    private JButton eb = new JButton("East");
    private JButton wb = new JButton("West");
    private JButton cb = new JButton("Center");

    public JGridLayout()
     {
         setLayout(new GridLayout(2,3,2,4));
         add(nb);
         add(sb);
         add(eb);
         add(wb);
         add(cb);
     }

    public static void main(String[] args)
     {
         JGridLayout aFrame = new JGridLayout();
         aFrame.setBounds(300,300,250,250);
         aFrame.setVisible(true);
     }
}