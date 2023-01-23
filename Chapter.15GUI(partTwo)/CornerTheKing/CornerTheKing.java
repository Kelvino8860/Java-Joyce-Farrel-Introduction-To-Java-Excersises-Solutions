
/*3.    The game Corner the King is played on a checkerboard. To begin, a checker is
        randomly placed in the bottom row. The player can move one or two squares to the
        left or upwards, and then the computer can move one or two squares left or up. The
        first to reach the upper-left corner wins. Design a game in which the computer’s
        moves are chosen randomly. When the game ends, display a message that indicates
        the winner. Save the game as CornerTheKing.java. */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.util.Random;
import java.util.Date;

/**
 *
 * @author kelvino
 */
public class CornerTheKing extends JFrame implements MouseListener{
    
    private final int COL = 8;
    private final int ROW = 8;
    private JPanel panel = new JPanel(new GridLayout(ROW,COL));
    private JPanel[] arrayPanel = new JPanel[COL * ROW];
    private JLabel label = new JLabel("KNG");
    private Color color1 = Color.BLUE;
    private Color color2 = Color.WHITE;
    private Color tempColor;
    private int indexSelectPanel = 0;
    
    public CornerTheKing()
    {
        setTitle("CornerTheKing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label.setFont(new Font("Arial",Font.BOLD,16));
        createBoard(arrayPanel);
        add(panel);
        startGame(label,arrayPanel);
    }
    
    @Override
    public void mouseClicked(MouseEvent e)
    {
        int whichButt = e.getButton();
        Object source = e.getComponent();
        JPanel panelSelect = (JPanel) source;
        int i;

        if(whichButt == MouseEvent.BUTTON1)
        {
            //TODO Ensure player can only move 1 or 2 steps upwards or left
            
            panelSelect.add(label);
            invalidate();
            repaint();
        }
        
        //Get position of the players panel
        for(i = 0; i < arrayPanel.length; ++i)
        {
             if(panelSelect == arrayPanel[i])
             {
                indexSelectPanel = i;
                break;
             }
        }

        if(indexSelectPanel == 7)
        {
            JOptionPane.showMessageDialog(null, "Congratulations!!! YOU WON!!!");
            System.exit(1);
        }

        try
        {
           Thread.sleep(700);
           compPlay(arrayPanel,panelSelect,indexSelectPanel);
        }
        catch(InterruptedException ex)
        {
             JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    public void compPlay(JPanel[] array, JPanel panelSelect, int indexSelectPanel)
    {
       int move = 1 + (int)(Math.random()*2);
       
       if(move == 1)
       {
          moveUp(array,panelSelect,indexSelectPanel);
       }
       else
       if(move == 2)
       {
        moveLeft(array,panelSelect,indexSelectPanel);
       }
    }

    public void moveUp(JPanel[] array, JPanel panelSelect, int indexSelectPanel)
    {
          int steps = 1 + (int)(Math.random()*2);
          int i;
          int[] currentPosition = {0,1,2,3,4,5,6,7};
          int[] currentPosition2 = {8,9,10,11,12,13,14,15};
          int win = 0;

          for(i = 0; i < currentPosition.length; ++i)
          {
            if(panelSelect == array[i])
            {
                steps = 0;
                break;
            }
          }

          for(i = 0; i < currentPosition2.length; ++i)
          {
            if(panelSelect == array[i])
            {
                steps = 1;
                break;
            }
          }

          if(steps == 0)
          {
              moveLeft(array, panelSelect, indexSelectPanel);
          }
          else
          if(steps == 1)
          {
             array[indexSelectPanel - 8].add(label);
             invalidate();
             repaint();
             win = indexSelectPanel - 8;
          }
          else
          if(steps == 2)
          {
            array[indexSelectPanel - 16].add(label);
            invalidate();
            repaint();
            win = indexSelectPanel - 16;
          }

          //Display winner
          if(win == 7)
          {
            winningComp();
            System.exit(1);
          }
    }

    public void moveLeft(JPanel[] array, JPanel panelSelect, int indexSelectPanel)
    {
        int steps = 1 + (int)(Math.random()*2);
        int i;
        int[] currentPosition = {7,15,23,31,39,47,55,63};
        int[] currentPosition2 = {6,14,22,30,38,46,54,62};
        int win = 0;

        for(i = 0; i < currentPosition2.length; ++i)
          {
            if(indexSelectPanel == currentPosition2[i])
            {
                steps = 1;
                break;
            }
          }
         
        for(i = 0; i < currentPosition.length; ++i)
        {
            if(indexSelectPanel == currentPosition[i])
            {
                steps = 0;
                break;
            }
        }

        if(steps == 0)
        {
            moveUp(array, panelSelect, indexSelectPanel);
        }
        else
        if(steps == 1)
        {
            win = indexSelectPanel + 1;
            array[indexSelectPanel + 1].add(label);
            invalidate();
            repaint();
        }
        else
        if(steps == 2)
        {
            win = indexSelectPanel + 1;
            array[indexSelectPanel + 2].add(label);
            invalidate();
            repaint();
        }

        //Display Winner
        if(win == 7)
        {
            winningComp();
        }
    }

    public void winningComp()
    {
        JOptionPane.showMessageDialog(null, "Computer Wins!!!");
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
    
    public void startGame(JLabel label, JPanel[] array)
    {
        //Initialize checker randomly
        Random random = new Random();
        int start = random.nextInt(56,64);
        array[start].add(label);
    }
    
    public void createBoard(JPanel[] array)
    {
        for(int i = 0; i < array.length; ++i)
        {
            array[i] = new JPanel();
            panel.add(array[i]);
            array[i].addMouseListener(this);
            
            if(i % COL == 0)
            {
                tempColor = color1;
                color1 = color2;
                color2 = tempColor;
            }
            
            if(i % 2 == 0)
              array[i].setBackground(color1);
            else
                array[i].setBackground(color2);
        }
    }

    public static void main(String[] args) {
        CornerTheKing aFrame = new CornerTheKing();
        aFrame.setBounds(300,300,400,400);
        aFrame.setVisible(true);
    }

}
