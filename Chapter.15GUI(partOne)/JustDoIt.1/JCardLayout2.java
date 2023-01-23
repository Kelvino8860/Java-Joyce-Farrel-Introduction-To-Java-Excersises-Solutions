import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class  JCardLayout2 extends JFrame implements ActionListener
{
    private JButton nb = new JButton("North");
    private JButton sb = new JButton("South");
    private JButton eb = new JButton("East");
    private JButton wb = new JButton("West");
    private JButton cb = new JButton("Center");
    CardLayout layout = new CardLayout();

    public JCardLayout2()
     {
         setLayout(layout);
         add("north", nb);
         add("south", sb);
         add("east",eb);
         add("west", wb);
         add("center", cb);

         nb.addActionListener(this);
         sb.addActionListener(this);
         eb.addActionListener(this);
         wb.addActionListener(this);
         cb.addActionListener(this);
     }

    @Override
    public void actionPerformed(ActionEvent e)
      {
         layout.next(getContentPane());
      }

    public static void main(String[] args)
     {
         JCardLayout2 aFrame = new JCardLayout2();
         aFrame.setBounds(300,300,250,250);
         aFrame.setVisible(true);
     }
}