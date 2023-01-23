/*2. b. Review how to use the LocalDateTime class from Chapter 4, and then revise the
        JCatchTheMouse game to conclude by displaying the number of seconds it takes
        the user to click all 10 Xs. (For this program, assume that the user starts and
        stops the game during the same hour. That way, you only have to compare the
        minute and second values of the start and stop times.) Save the file as
        JCatchTheMouseTimed.java.*/


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.time.LocalDateTime;

public class JCatchTheMouseTimed extends JFrame implements MouseListener
{
    private JPanel[] panels = new JPanel[48];
    private final String st = "X";
    private JLabel label = new JLabel(st);
    private int panelNum;
    private Container con = getContentPane();
    private int hitsNum = 0;
    private int clicksNum = 0;
    private LocalDateTime time = LocalDateTime.now();
    private int startTime = 0;
    private int stopTime = 0;

    public JCatchTheMouseTimed()
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
        startTime = time.getSecond(); 
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
            LocalDateTime time2 = LocalDateTime.now();
            stopTime = time2.getSecond();
            System.out.println("startTime: " + startTime + "\nStopTime: " + stopTime);
            int timeTaken = stopTime - startTime;
            double percentage = (hitsNum / clicksNum) * 100;
            JOptionPane.showMessageDialog(null, "Congratulation " +
               "\nYour percentage is : " + percentage + "%" +
               "\nTime taken: " + timeTaken + "sec");
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
        JCatchTheMouseTimed aFrame = new JCatchTheMouseTimed();
        aFrame.setBounds(300,300,400,400);
        aFrame.setVisible(true);
    }
}












