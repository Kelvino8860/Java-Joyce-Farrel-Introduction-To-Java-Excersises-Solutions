import javax.swing.*;
import java.awt.*;

public class JCopyShape extends JPanel {

    int xPoints[] = { 42, 52, 72, 52,
            60, 40, 15, 28, 9, 32, 42 };
    int yPoints[] = { 38, 62, 68, 80,
            105, 85, 102, 75, 58, 60, 38 };
    Polygon aStar = new Polygon(xPoints, yPoints, xPoints.length);

    @Override
    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        gr.drawPolygon(aStar);
        gr.copyArea(0, 0, 75, 105, 80, 40);
        gr.copyArea(0, 0, 75, 105, 40, 150);
        gr.copyArea(0, 0, 75, 105, 170, 0);
        gr.copyArea(0, 0, 75, 105, 150, 110);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JCopyShape());
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
