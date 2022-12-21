/* b. Modify the JFrameDisableButton program so that the JButton is not disabled
      until the user has clicked at least eight times. At that point, display a JLabel that
      indicates “That’s enough!”. Save the file as JFrameDisableButton2.java.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameDisableButton2 extends JFrame implements ActionListener
{
	 JButton button = new JButton("Click me");
         JLabel label = new JLabel("");
	 final int LIMIT = 8;
	 int count = 0;
	 
	 public JFrameDisableButton2()
	 {
		 super("Disable Button");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 setLayout(new FlowLayout());
                 add(label);
		 add(button);
		 button.addActionListener(this);
		 
	 }
	 
	 @Override
	 public void actionPerformed(ActionEvent e)
	 {
		 count++;
		 label.setText("Number of clicks: " + count);
		 if(count == 8 )
		 button.setEnabled(false);
	 }
	 
	 public static void main(String[] args)
	 {
		 JFrameDisableButton2 aFrame = new JFrameDisableButton2();
		 aFrame.setBounds(300,300,250,150);
		 aFrame.setVisible(true);
	 }
}