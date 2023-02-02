/*3. Write an application that extends JPanel and displays a phrase. Each time the user
     clicks a button, alternate between displaying the phrase upside down and right-side
     up. Save the application as JUpsideDownPanel.java. */

     import javax.swing.*;
     import java.awt.*;
     import java.awt.event.*;
     import java.awt.Color;

     public class JUpsideDownPanel extends JPanel implements ActionListener{

        Color color = Color.CYAN;
        Font font = new Font("Arial",Font.BOLD,16);
        int x = 30;
        int y = 30;
        String str = new String("KELVINO");
        JButton button = new JButton("Press Me");

        public JUpsideDownPanel()
        {
            setLayout(new BorderLayout());
            setBackground(color);
            add(button,BorderLayout.SOUTH);
            button.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(color.equals(Color.CYAN))
            {
                color = Color.WHITE;
                setBackground(color);
                font = new Font("Arial",Font.BOLD,-16);
                x=120;
                y=120;
            }
            else
            {
                color = Color.CYAN;
                setBackground(color);
                font = new Font("Arial",Font.BOLD,16);
            }

            repaint();
        }

        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.setColor(Color.YELLOW);
            g.setFont(font);
            g.drawString(str,x,y);
        }

        public static void main(String[] args) {
            
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new JUpsideDownPanel());
            frame.setBounds(300,300,300,300);
            frame.setVisible(true);
        }
     }