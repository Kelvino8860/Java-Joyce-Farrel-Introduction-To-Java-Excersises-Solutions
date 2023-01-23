/* 1. b. Improve the Mine Field game by allowing the user to choose a difficulty level
         before beginning. Place three buttons labeled “Easy”, “Intermediate”, and “Diffi-
         cult” in one region of the JFrame, and place the game grid and congratulatory
         message in other regions. Require the user to select a difficulty level before starting
         the game, and then disable the buttons. If the user chooses “Easy”, the user must
         select only five safe panels to win the game. If the user selects “Intermediate”,
         require 10 safe panels, as in the original game. If the user selects “Difficult”, require
         15 safe panels. Save the game as MineField2.java*/

import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import java.awt.event.*;
import java.rmi.server.SocketSecurityException;
import java.awt.*;
import java.awt.Color;

public class MineField2 extends JFrame implements MouseListener,ActionListener
{
    private JPanel congratsPanel = new JPanel();
    private JPanel gamePanel = new JPanel(new GridLayout(4,5,5,5));
    private JPanel buttonPanel = new JPanel(new GridLayout(1,1));
    private JLabel congratsLabel = new JLabel();
    private JPanel[] fieldPanel = new JPanel[20];
    private Container con = getContentPane();
    private int j,count = 0;
    private int level = 0;
    private JButton easy = new JButton("Easy");
    private JButton intermediate = new JButton("Intermediate");
    private JButton difficult = new JButton("Difficult");

    public MineField2()
    {
        setTitle("MineField");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        congratsLabel.setFont(new Font("Arial",Font.BOLD,16));
        con.setBackground(Color.PINK);
        congratsPanel.setBackground(Color.CYAN);
        buttonPanel.setBackground(Color.PINK);
        con.add(congratsPanel, BorderLayout.NORTH);
        con.add(gamePanel, BorderLayout.CENTER);
        con.add(buttonPanel, BorderLayout.SOUTH);
        buttonPanel.add(easy);
        buttonPanel.add(intermediate);
        buttonPanel.add(difficult);

        easy.addActionListener(this);
        intermediate.addActionListener(this);
        difficult.addActionListener(this);

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
    public void actionPerformed(ActionEvent e)
    {
        Object source2 = e.getSource();
         
        if(source2 == easy)
        {
            level += 5;
        }
        else
        if(source2 == intermediate)
        {
            level += 10;
        }
        else
        if(source2 == difficult)
        {
            level += 15;
        }

    }
    @Override
    public void mouseClicked(MouseEvent e)
    {
        int whichButton = e.getButton();
        Object source = e.getComponent();
        JPanel panelClicked = (JPanel) source; //Explicit casting
        
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
          //System.out.println(count + "   " + level);
        if(count == level)
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
        MineField2 aFrame = new MineField2();
        aFrame.setBounds(300,300,400,400);
        aFrame.setVisible(true);
    }
}













