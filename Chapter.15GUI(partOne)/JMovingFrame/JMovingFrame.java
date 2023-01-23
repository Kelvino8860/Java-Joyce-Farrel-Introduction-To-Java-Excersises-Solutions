/*5. Create a JFrame with JPanels, a JButton, and a JLabel. When the user clicks the
    JButton, reposition the JLabel to a new location in a different JPanel. Save the file as
    JMovingFrame.java */

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;

    public class JMovingFrame extends JFrame implements ActionListener
    {
        private JButton butt = new JButton("Press Me");
        private JPanel panel1 = new JPanel();
        private JPanel panel2 = new JPanel();
        private JPanel panel3 = new JPanel();
        private JPanel panel4 = new JPanel();

        private JLabel label = new JLabel("I Love Kelvino");
        private Container con = getContentPane();

        public JMovingFrame()
        {
            setTitle("JMovingFrame");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            label.setFont(new Font("Arial",Font.BOLD,16));
            con.setLayout(new BorderLayout());
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
                panel1.add(label);
                revalidate();
                repaint();
            }
            if(count == 2)
            {
                panel2.add(label);
                revalidate();
                repaint();
            }
            if(count == 3)
            {
                panel3.add(label);
                revalidate();
                repaint();
            }
            if(count == 4)
            {
                panel4.add(label);
                revalidate();
                repaint();
            }
        }

        public static void main(String[] args)
        {
            JMovingFrame aFrame = new JMovingFrame();
            aFrame.setBounds(300,300,400,400);
            aFrame.setVisible(true);
        }
    }







