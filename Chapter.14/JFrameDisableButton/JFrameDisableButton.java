/* 2. a. Write an application that instantiates a JFrame that contains a JButton. Disable
         the JButton after the user clicks it. Save the file as JFrameDisableButton.java.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameDisableButton extends JFrame implements ActionListener
{
	 JButton button = new JButton("Click me");
	 
	 public JFrameDisableButton()
	 {
		 super("Disable Button");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 add(button);
		 button.addActionListener(this);
		 
	 }
	 
	 @Override
	 public void actionPerformed(ActionEvent e)
	 {
		 button.setEnabled(false);
	 }
	 
	 public static void main(String[] args)
	 {
		 JFrameDisableButton aFrame = new JFrameDisableButton();
		 aFrame.setBounds(300,300,200,200);
		 aFrame.setVisible(true);
	 }
}