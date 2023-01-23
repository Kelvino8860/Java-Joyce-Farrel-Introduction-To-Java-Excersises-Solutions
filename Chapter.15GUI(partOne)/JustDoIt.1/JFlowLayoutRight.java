import javax.swing.*;
import java.awt.*;

public class JFlowLayoutRight extends JFrame
{
    private JButton nb = new JButton("North");
    private JButton sb = new JButton("South");
    private JButton eb = new JButton("East");
    private JButton wb = new JButton("West");
    private JButton cb = new JButton("Center");

    public JFlowLayoutRight()
     {
         setLayout(new FlowLayout(FlowLayout.RIGHT));
         add(nb);
         add(sb);
         add(eb);
         add(wb);
         add(cb);
     }

    public static void main(String[] args)
     {
         JFlowLayoutRight aFrame = new JFlowLayoutRight();
         aFrame.setBounds(300,300,250,250);
         aFrame.setVisible(true);
     }
}