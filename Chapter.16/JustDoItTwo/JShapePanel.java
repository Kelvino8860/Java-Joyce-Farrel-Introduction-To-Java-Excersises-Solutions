import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class JShapePanel extends JPanel implements ActionListener
{
    JButton butt = new JButton("Press Me");
    Color color = Color.RED;
    String shape = "circle";
    int x = 0;
    int y = 0;
    int count = 0;

    final int SIZE = 40;
    final int INCREASE = 15;
    final int TIMES = 14;

    public JShapePanel()
    {
        setBackground(Color.WHITE);
        add(butt);
        butt.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        ++count;
        if(count == TIMES)
        {
            x = 0;
            y = 0;
            count = 0;
        }

        if(shape.equals("circle"))
        {
            color = Color.BLUE;
            shape = "rect";
        }
        else
        {
            color = Color.RED;
            shape = "circle";
        }

        x += INCREASE;
        y += INCREASE;

        repaint();
    }

    @Override
    public void paintComponent(Graphics gr)
    {
        super.paintComponent(gr);
        gr.setColor(color);
        if(shape.equals("circle"))
        {
            gr.fillOval(x,y,SIZE,SIZE);
        }
        else
        gr.fillRect(x,y,SIZE,SIZE);
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JShapePanel());
        frame.setBounds(300,300,300,300);
        frame.setVisible(true);

    }
}

















