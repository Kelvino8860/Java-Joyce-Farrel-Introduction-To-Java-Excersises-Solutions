import javax.swing.*;
import java.awt.*;

public class JStar extends JPanel{
    int xPoints[] = {42,52,72,52,60,40,15,28,9,32,42};
    int yPoints[] = {38,62,68,80,105,85,102,75,58,60,38};

    @Override
    public void paintComponent(Graphics gr)
    {
       super.paintComponent(gr);
       gr.drawPolygon(xPoints, yPoints, xPoints.length);
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.add(new JStar());
        frame.setBounds(300,300,400,400);
        frame.setVisible(true);
    }
}