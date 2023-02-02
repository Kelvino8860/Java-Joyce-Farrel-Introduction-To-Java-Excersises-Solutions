/*  2. a. Write an application that extends JPanel and displays a phrase in a large font.
          Each time the user clicks a JButton, display the same phrase in a different color,
          a little further to the right, and in a slightly smaller font. Allow only three clicks.
          Save the file as JChangeSizeAndColorPanel.java */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class JChangeSizeAndColorPanel extends JPanel implements ActionListener{
    
    Color color = Color.GREEN;
    String strColor = "blue";
    String phrase = "Welcome home Kelvino";
    JButton button = new JButton("Press Me");
    int x = 10;
    int y = 20;
    int count = 0;
    int size = 16;
    
    public JChangeSizeAndColorPanel(){

        this.setLayout(new BorderLayout());
        add(button,BorderLayout.SOUTH);
        button.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        count++;

         if(strColor.equals("blue"))
         {
                color = Color.RED;
                strColor = "red";
         }
         else
         if(strColor.equals("red"))
         {
            color = Color.BLUE;
            strColor = "blue";
         }

         if(count == 3)
         {
            button.setEnabled(false);
         }

         repaint();
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(color);
        g.setFont(new Font("Arial",Font.BOLD,size-=2));
        g.drawString(phrase, x, y);
        x+=g.getFontMetrics().getHeight();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
       JChangeSizeAndColorPanel p1 = new JChangeSizeAndColorPanel();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.add(p1);  
       frame.setBounds(300,300,300,300);
       frame.setVisible(true); 
    }
}
