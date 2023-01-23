/*2. a. Create a game that helps new mouse users improve their hand-eye coordination.
        Within a JFrame, display an array of 48 JPanels in a GridLayout using eight rows
        and six columns. Randomly display an X on one of the panels. When the user
        clicks the correct panel (the one displaying the X), remove the X and display it on a
        different panel. After the user has successfully “hit” the correct panel 10 times,
        display a congratulatory message that includes the user’s percentage (hits divided
        by clicks). Save the file as JCatchTheMouse.java. */


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Color;

public class JCatchTheMouse extends JFrame implements MouseListener
{
    private JPanel[] panels = new JPanel[48];
    private final String st = "X";
    private JLabel label = new JLabel(st);
    private int panelNum;
    private Container con = getContentPane();
    private int hitsNum = 0;
    private int clicksNum = 0;

    public JCatchTheMouse()
    {
        setTitle("JCatchTheMouse");
        con.setLayout(new GridLayout(6,8,2,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelNum = (int)(Math.random()*48);
        
        for(int i = 0; i < panels.length; ++i)
        {
            panels[i] = new JPanel();
            panels[i].addMouseListener(this);
            con.add(panels[i]);
           // panels[i].setBackground(Color.CYAN);
        }

        panels[panelNum].add(label);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        int whichButt = e.getButton();
        Object source = e.getComponent();

        if(whichButt == MouseEvent.BUTTON1)
        {
             if(source == panels[panelNum])
             {
                panelNum = (int)(Math.random()*48);
                panels[panelNum].add(label);
                hitsNum++;
                invalidate();
                repaint();
             }

             clicksNum++;
        }

        if(hitsNum == 10)
        {
            double percentage = (hitsNum / clicksNum) * 100;
            JOptionPane.showMessageDialog(null, "Congratulation " +
               "\nYour percentage is : " + percentage + "%");
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

    public static void main(String[] args)
    {
        JCatchTheMouse aFrame = new JCatchTheMouse();
        aFrame.setBounds(300,300,400,400);
        aFrame.setVisible(true);
    }
}












