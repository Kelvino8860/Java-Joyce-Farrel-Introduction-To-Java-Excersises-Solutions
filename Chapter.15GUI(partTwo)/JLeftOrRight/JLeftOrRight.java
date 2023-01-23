/*7. Write an application that lets you determine the integer value returned by the
    InputEvent method getModifiers() when you click your left, right, or—if you have
    one—middle mouse button on a JFrame. Save the file as JLeftOrRight.java. */

    import java.awt.event.*;
    import java.awt.*;
    import javax.swing.*;

    public class JLeftOrRight extends JFrame implements MouseListener
    {
         private Container con = getContentPane();

        public JLeftOrRight()
        {
            setTitle("JLeftOrRight");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            con.addMouseListener(this);
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {
             int event = e.getModifiersEx();
             JOptionPane.showMessageDialog(null, "Integer value of button clicked is: " + event);
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
            JLeftOrRight aFrame = new JLeftOrRight();
            aFrame.setBounds(300,300,250,250);
            aFrame.setVisible(true);
        }
    }
