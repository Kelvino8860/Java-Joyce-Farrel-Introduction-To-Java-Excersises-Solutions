/*4. Create a JFrame that uses BorderLayout. Place a JButton in the center region. Each
    time the user clicks the JButton, change the background color in one of the other
    regions. Save the file as JColorFrame.java */

    import java.awt.*;
    import java.awt.event.*;
    import java.awt.Color;
    import javax.swing.*;

    public class JColorFrame extends JFrame implements ActionListener
    {
        private JButton butt = new JButton("Press Me");

        private JPanel panel1 = new JPanel();
        private JPanel panel2 = new JPanel();
        private JPanel panel3 = new JPanel();
        private JPanel panel4 = new JPanel();
        
        private Container con = getContentPane();

        private Color color = UIManager.getColor("Panel.background");

        public JColorFrame()
        {
            setTitle("JColorFrame");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            con.add(butt, BorderLayout.CENTER);
            con.add(panel1, BorderLayout.NORTH);
            con.add(panel2, BorderLayout.SOUTH);
            con.add(panel3, BorderLayout.EAST);
            con.add(panel4, BorderLayout.WEST);

            butt.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            int count = 1 + (int)(Math.random()*4);
            if(count == 1)
            {
                panel1.setBackground(Color.YELLOW);
                panel2.setBackground(color);
                panel3.setBackground(color);
                panel4.setBackground(color);
            }
            if(count == 2)
            {
                panel2.setBackground(Color.PINK);
                panel1.setBackground(color);
                panel3.setBackground(color);
                panel4.setBackground(color);
            }
            if(count == 3)
            {
                panel3.setBackground(Color.RED);
                panel2.setBackground(color);
                panel1.setBackground(color);
                panel4.setBackground(color);
            }
            if(count == 4)
            {
                panel4.setBackground(Color.BLUE);
                panel2.setBackground(color);
                panel3.setBackground(color);
                panel1.setBackground(color);
            }
        }

        public static void main(String[] args)
        {
            JColorFrame aFrame = new JColorFrame();
            aFrame.setBounds(300,300,400,400);
            aFrame.setVisible(true);
        }
    }