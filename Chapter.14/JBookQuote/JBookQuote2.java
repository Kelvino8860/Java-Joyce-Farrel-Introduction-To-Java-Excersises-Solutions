/* b. Add a button to the frame in the JBookQuote program. When the user clicks the
      button, display the title of the book that contains the quote. Save the file as
      JBookQuote2.java*/


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JBookQuote2 extends JFrame implements ActionListener
{
	 JLabel quote = new JLabel("East or west home is the best");
	 JLabel quote2 = new JLabel("A wise man speaks less and listens more");
	 JLabel title = new JLabel("");
	 JButton button = new JButton("Click to view title");
	 
	 public JBookQuote2()
	 {
		 super("Book Quotes");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setLayout(new FlowLayout());
		 add(quote);
		 add(quote2);
                 add(button);
		 add(title);
		 button.addActionListener(this);
	 }
	 
	 @Override
	 public void actionPerformed(ActionEvent e)
	 {
		 title.setText("The River And The Source");
	 }
	 
	 public static void main(String[] args)
	 {
		 final int WIDTH = 250;
		 final int HEIGHT = 150;
		 JBookQuote2 aFrame = new JBookQuote2();
		 aFrame.setSize(WIDTH,HEIGHT);
		 aFrame.setVisible(true);
	 }
}