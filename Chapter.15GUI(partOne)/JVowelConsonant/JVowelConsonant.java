/*2. Create an educational program for children that distinguishes between vowels and
     consonants as the user clicks buttons. Create 26 JButtons, each labeled with a
     different letter of the alphabet. Create a JFrame to hold three JPanels in a two-by-two
     grid. Randomly select eight of the 26 JButtons and place four in each of the first
    two JPanels. Add a JLabel to the third JPanel. When the user clicks a JButton, the
    text of the JLabel identifies the button’s letter as a vowel or consonant, and then a
    new randomly selected letter replaces the letter on the JButton. Save the file as
    JVowelConsonant.java. */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JVowelConsonant extends JFrame implements ActionListener
{
    private String[] letters = {"a","b","c","d","e","f","g","h","i","j",
                                "k","l","m","n","o","p","q","r","s","t",
                                "u","v","w","x","y","z"};
    private String[] vowels = {"a","e","i","o","u"};
    private JButton[] buttons = new JButton[26];
    private JPanel panelOne = new JPanel();
    private JPanel panelTwo = new JPanel();
    private JPanel panelThree = new JPanel();
    private JLabel label = new JLabel("");
    private Container con = getContentPane();

    public JVowelConsonant()
    {
        setTitle("JVowelConsonant");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.setLayout(new GridLayout(2,2,5,5));
        panelOne.setLayout(new GridLayout(2,2,2,2));
        panelTwo.setLayout(new GridLayout(2,2,2,2));
        panelThree.setLayout(new FlowLayout());
        label.setFont(new Font("Arial",Font.BOLD,12));
        con.add(panelOne);
        con.add(panelTwo);
        con.add(panelThree);
        panelThree.add(label);
        initializeButtons();
    }

    /* Create 26 buttons */
    public void initializeButtons()
    {
        for(int i = 0; i < buttons.length; ++i)
        {
            buttons[i] = new JButton(letters[i]);
        }
         
         //Add buttons to panel randomly
         panelOne.add(buttons[4]);
         panelOne.add(buttons[23]);
         panelOne.add(buttons[12]);
         panelOne.add(buttons[17]);

         panelTwo.add(buttons[0]);
         panelTwo.add(buttons[8]);
         panelTwo.add(buttons[25]);
         panelTwo.add(buttons[15]);

         buttons[4].addActionListener(this);
         buttons[23].addActionListener(this);
         buttons[12].addActionListener(this);
         buttons[17].addActionListener(this);
         buttons[0].addActionListener(this);
         buttons[8].addActionListener(this);
         buttons[25].addActionListener(this);
         buttons[15].addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        JButton butt = (JButton) source; //Explicit casting
        String string = butt.getText();
        int count = 1;
        
        for(int i = 0; i < vowels.length; ++i)
        {
            if(string.equals(vowels[i]))
            {
              label.setText("LETTER IS VOWEL");
              count = 0;
              break;
            }
        }
        if(count == 1)
        label.setText("LETTER IS CONSONANT");

        //Reset buttons letter
        int rand = (int)(Math.random()*26);
        String buttText = letters[rand];
        butt.setText(buttText);
    }

    public static void main(String[] args)
    {
        JVowelConsonant aFrame = new JVowelConsonant();
        aFrame.setBounds(300,300,300,300);
        aFrame.setVisible(true);
    }
}