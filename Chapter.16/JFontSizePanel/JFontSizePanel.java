/* 1. Write an application that extends JPanel and displays a phrase in every font size from
      6 through 20. Save the file as JFontSizesPanel.java*/


import javax.swing.*;
import javax.swing.plaf.FontUIResource;

import java.awt.*;

public class JFontSizePanel extends JPanel{
    private String s = "Kelvin";

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int x = 10;
        int y = 20;
        for(int i = 6; i < 21; ++i)
        {
            g.setFont(new Font("Arial",Font.PLAIN,i));
            g.drawString(s,x,y);
            y += g.getFontMetrics().getHeight();
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JFontSizePanel jfsp = new JFontSizePanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(jfsp);
       // jfsp.repaint();
        frame.setBounds(300,300,300,300);
        frame.setVisible(true);
    }
}
