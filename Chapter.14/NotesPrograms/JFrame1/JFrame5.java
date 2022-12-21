import javax.swing.*;
import java.awt.*;
public class JFrame5
{
    public static void main(String[] args)
      {
          final int FRAME_WIDTH = 250;
          final int FRAME_HEIGHT = 100;
          Font headlineFont = new Font("Arial", Font.BOLD, 36);
          JFrame aFrame = new JFrame("Third Frame");
          aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
          aFrame.setVisible(true);
          aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          JLabel greeting = new JLabel("Hello");
          JLabel greeting2 = new JLabel("who are you");
          aFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
          aFrame.add(greeting);
          aFrame.add(greeting2);
      }
}
