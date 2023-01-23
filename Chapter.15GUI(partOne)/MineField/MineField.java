/* 1. a. Create a Mine Field game in which the user attempts to click 10 panels of a grid
          before hitting the “bomb.” Set up a JFrame using BorderLayout, use the NORTH
          region for a congratulatory message, and use the CENTER region for the game.
          In the CENTER region, create a four-by-five grid using GridLayout and
          populate the grid with JPanels. Set the background color for all the JPanels
          to Color.BLUE. Randomly choose one of the panels to be the bomb; the other
          19 panels are “safe.” Allow the player to click on grids. If the player chooses
          a safe panel, turn the panel to Color.WHITE. If the player chooses the bomb
          panel, turn the panel to Color.RED and turn all the remaining panels white. If
          the user successfully chooses 10 safe panels before choosing the bomb, display
          a congratulatory message in the NORTH JFrame region. Save the game as
          MineField.java.*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;

public class MineField extends JFrame implements MouseListener
{
    private JPanel congratsPanel = new JPanel();
    private JPanel gamePanel = new JPanel(new GridLayout(4,5,5,5));
    private JLabel congratsLabel = new JLabel();
    private JPanel[] fieldPanel = new JPanel[20];
    private Container con = getContentPane();
    private int j,count = 0;

    public MineField()
    {
        setTitle("MineField");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        congratsLabel.setFont(new Font("Arial",Font.BOLD,16));
        con.setBackground(Color.PINK);
        congratsPanel.setBackground(Color.CYAN);
        con.add(congratsPanel, BorderLayout.NORTH);
        con.add(gamePanel, BorderLayout.CENTER);

        for(int i = 0; i < fieldPanel.length; ++i)
        {
            fieldPanel[i] = new JPanel(new GridLayout(1,1));
            fieldPanel[i].setBackground(Color.BLUE);
            gamePanel.add(fieldPanel[i]);
        }

        for(int i = 0; i < fieldPanel.length; ++i)
            fieldPanel[i].addMouseListener(this);

        j = setBomb(fieldPanel);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        int whichButton = e.getButton();
        Object source = e.getComponent();
        JPanel panelClicked = (JPanel) source;

        if(whichButton == MouseEvent.BUTTON1)
        {
             if(source == fieldPanel[j])
             {
                for(int i = 0; i < fieldPanel.length; ++i)
                {
                  fieldPanel[i].setBackground(Color.WHITE);
                }
                fieldPanel[j].setBackground(Color.RED);
                congratsPanel.add(congratsLabel);
                congratsLabel.setText("SORRY!! YOU LOST");
                invalidate();
                repaint();
             }
             else
             {
                panelClicked.setBackground(Color.WHITE);
                count++;
             }
        }

        if(count == 10)
        {
           congratsPanel.add(congratsLabel);
           congratsLabel.setText("CONGRATULATIONS!! YOU WON");
           invalidate();
           repaint();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {

    }
    @Override
    public void mouseExited(MouseEvent e)
    {

    }
    @Override
    public void mousePressed(MouseEvent e)
    {

    }
    @Override
    public void mouseReleased(MouseEvent e)
    {

    }

    public int setBomb(JPanel[] game)
    {
         int k = (int)(Math.random()*20);

         return k;
    }

    public static void main(String[] args)
    {
        MineField aFrame = new MineField();
        aFrame.setBounds(300,300,400,400);
        aFrame.setVisible(true);
    }
}













