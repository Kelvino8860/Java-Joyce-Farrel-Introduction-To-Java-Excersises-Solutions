import java.awt.*;
import javax.swing.*;
import java.awt.Color;

public class JPanelDemo
{
    public static void main(String[] args)
    {
        Font font = new Font("Arial",Font.ITALIC,16);
        String string = "Welcome Kelvino";
        JFrame aFrame = new JFrame("JPanelDemo");
        aFrame.setLayout(new GridLayout(2,2));
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFlexiblePanel panel1 = new JFlexiblePanel(Color.YELLOW, Color.PINK, font, string);
        JFlexiblePanel panel2 = new JFlexiblePanel(Color.BLUE, Color.GREEN, font , string);
        JFlexiblePanel panel3 = new JFlexiblePanel(Color.RED, Color.WHITE, font, string);
        JFlexiblePanel panel4 = new JFlexiblePanel(Color.CYAN, Color.ORANGE, font, string);
        aFrame.add(panel1);
        aFrame.add(panel2);
        aFrame.add(panel3);
        aFrame.add(panel4);
        aFrame.setBounds(300,300,400,400);
        aFrame.setVisible(true);
    }
}