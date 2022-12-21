import javax.swing.*;
public class JMyFrame extends JFrame
{
    final int WIDTH = 250;
    final int HEIGHT = 100;

    public JMyFrame()
      {
         super("My Frame");
         setSize(WIDTH, HEIGHT);
         setVisible(true);
      }
}