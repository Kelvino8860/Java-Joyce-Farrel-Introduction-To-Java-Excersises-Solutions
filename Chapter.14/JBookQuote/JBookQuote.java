/* 1. a. Write an application that displays a JFrame containing the opening sentence or
         two from your favorite book. Save the file as JBookQuote.java*/

import java.awt.*;
import javax.swing.*;

public class JBookQuote extends JFrame
{
	 JLabel quote = new JLabel("East or west home is the best");
	 JLabel quote2 = new JLabel("A wise man speaks less and listens more");
	 
	 public JBookQuote()
	 {
		 super("Book Quotes");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setLayout(new FlowLayout());
		 add(quote);
		 add(quote2);
	 }
	 
	 public static void main(String[] args)
	 {
		 final int WIDTH = 250;
		 final int HEIGHT = 100;
		 JBookQuote aFrame = new JBookQuote();
		 aFrame.setSize(WIDTH,HEIGHT);
		 aFrame.setVisible(true);
	 }
}