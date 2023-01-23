/*4. Create a target practice game that allows the user to click moving targets and displays
     the number of hits in a 10-second period. (In Chapter 4, you learned how to use the
     LocalDateTime class to measure elapsed time.) Create a grid of at least 100 JPanels.
     Randomly display an X on five panels to indicate targets. As the user clicks each X,
     change the label to indicate a hit. When all five Xs have been hit, randomly display a
     new set of five targets. Continue with as many sets as the user can hit in 10 seconds.
     When the time is up, display a count of the number of targets hit. Save the file as
     JTargetPractice.java. */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class JTargetPractise extends JFrame implements MouseListener
{
     private JPanel[] arrayPanel = new JPanel[100];
     private final int COL = 10;
     private final int ROW = 10;
     private JPanel mainPanel = new JPanel(new GridLayout(ROW,COL));
     private final String str = "X";
     private final String hit = "HIT";
     private JLabel[] label = new JLabel[5];
     private Container con = getContentPane();

     public JTargetPractise()
     {
        setTitle("JTargetPractise");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.add(mainPanel);
        addTragetPanels(arrayPanel, label, str);
        displayTarget(arrayPanel,label);
     }

/*The method creates 100 JPanels and adds them in the
 * main panel and JLabels
 */
public void addTragetPanels(JPanel[] array, JLabel[] label, String str)
{
    int i;

    for(i = 0; i < array.length; ++i)
    {
        array[i] = new JPanel();
        mainPanel.add(array[i]);
        array[i].addMouseListener(this);
    }

    for(i = 0; i < label.length; ++i)
    {
        label[i] = new JLabel(str);
        label[i].setFont(new Font("Arial",Font.BOLD,16));
    }
}

/*This method selects targets randomly and places
 * the labels "X" in the random panels 
 */
public void displayTarget(JPanel[] array, JLabel[] label)
{
      int numTargets = 5;
      int i,j;
      int count = 0;
      ArrayList<Integer> list = new ArrayList<>(5);

      for(i = 0; i < numTargets; ++i)
      {
         j = (int)(Math.random()*100);

         //Ensure a random panel is not choosen more than once
         for(int k = 0; k < list.size(); ++k)
         {
            if(j == list.get(k))
            {
                count++;
                break;
            }
         }

         //If their is no repetition then add the random number to
         //the array
         if(count == 0)
         {
           list.add(j);
         }
         else
         {
            i = i;
         }
      }
         
      for(i = 0; i < list.size(); ++i)
      {
          array[list.get(i)].add(label[i]);
          invalidate();
          repaint();
      }
}

@Override
public void mouseClicked(MouseEvent e)
{
    int whichButt = e.getButton();
    Object source = e.getComponent();
    JPanel selectedPanel = (JPanel) source;
    int index = 0;

    if(whichButt == MouseEvent.BUTTON1)
    {
        for(int i = 0; i < 5; ++i)
        {
            if(selectedPanel == arrayPanel[i])
            {
                index = i;
                break;
            }
        }

        try
        {
           Object selectLabel = selectedPanel.getComponent(index);
           JLabel hitLabel = (JLabel) selectLabel;
           hitLabel.setText(hit);
        }
        catch(ArrayIndexOutOfBoundsException g)
        {
          JOptionPane.showMessageDialog(null, g);   
          displayTarget(arrayPanel, label);
        }
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
    JTargetPractise aFrame = new JTargetPractise();
    aFrame.setBounds(300,300,400,400);
    aFrame.setVisible(true);
}
}