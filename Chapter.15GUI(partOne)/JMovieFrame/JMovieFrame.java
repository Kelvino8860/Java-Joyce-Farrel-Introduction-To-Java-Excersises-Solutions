/* 1. Create a JFrame and set the layout to BorderLayout. In each region, place a JButton
    that displays the name of a classic movie that has the region name in its title. For
    example, the east button might indicate the movie East of Eden. When the user clicks
    the button, display the year of the movie’s release and the name of one of its stars.
    Save the file as JMovieFrame.java. */

    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;

    public class JMovieFrame extends JFrame implements ActionListener
    {
        private JButton northBut = new JButton("The Spy Gone North");
        private JButton southBut = new JButton("Queen of The South");
        private JButton eastBut = new JButton("East of Eden");
        private JButton westBut = new JButton("West Side Story");
        private JButton centerBut = new JButton("Jorney to the Center of the Earth");
        private Container con = getContentPane();


        public JMovieFrame()
        {
            setTitle("JMovieFrame");
            setLayout(new BorderLayout());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            con.add(northBut, BorderLayout.NORTH);
            con.add(southBut, BorderLayout.SOUTH);
            con.add(eastBut, BorderLayout.EAST);
            con.add(westBut, BorderLayout.WEST);
            con.add(centerBut, BorderLayout.CENTER);
            northBut.addActionListener(this);
            southBut.addActionListener(this);
            westBut.addActionListener(this);
            eastBut.addActionListener(this);
            centerBut.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            Object source = e.getSource();
            if(source == northBut)
            {
              JOptionPane.showMessageDialog(null,"Release date: 8 August, 2018" +
                  "\nStarring: Hwang Jungmin");
            }
            else
            if(source == southBut)
            {
                JOptionPane.showMessageDialog(null,"Original Release date: 23 June, 2016" +
                  "\nStarring: Alice Braga");
            }
            else
            if(source == eastBut)
            {
                JOptionPane.showMessageDialog(null,"Release date: 19 September, 1952" +
                  "\nStarring: Cathy Ames");
            }
            else
            if(source == westBut)
            {
                JOptionPane.showMessageDialog(null,"Release date: 10 December, 2021" +
                  "\nStarring: Tony Kushner");
            }
            else
            JOptionPane.showMessageDialog(null,"Release date: 11 July, 2008" +
                  "\nStarring: Brendan Fraser");
                  
        }

        public static void main(String[] args)
         {
             JMovieFrame aFrame = new JMovieFrame();
             aFrame.setBounds(300,300,300,300);
             aFrame.setVisible(true);
         }   
    }