/* 3. Create an application with a JFrame and at least five labels that contain interesting
      historical facts. Every time the user clicks a JButton, remove one of the labels and add
      a different one. Save the file as JHistoricalFacts.java.*/
	  
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JHistoricalFacts extends JFrame implements ActionListener
{
	JLabel[] labelArray = new JLabel[5];
	String[] factsArray = {"Ketchup was once sold as medicine.",
	                       "Ice pops were accidentaly invented by a kid.",
						   "Iceland has the world's oldest parliament",
						   "Say 'prunes' for the camel!",
						   "Dunce caps used to be a sign of intelligence"};
	JButton button = new JButton("Click me");
	int count = 0;
	
	public JHistoricalFacts()
	{
		 super("Historical Events");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 setLayout(new FlowLayout());
		 for(int i = 0; i < labelArray.length; i++)
                   {
                      add(labelArray[i] = new JLabel(""));
                      labelArray[i].setVisible(false);
                   }
	     add(button);
		 button.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		count++;
		if(count == 1)
		{
		   labelArray[0].setText(factsArray[0]);
		   labelArray[0].setVisible(true);
		}
	   else 
		   if(count == 2)
		   {
			  labelArray[1].setText(factsArray[1]); 
			  labelArray[1].setVisible(true);
			  labelArray[0].setVisible(false);
		   }
	   else 
		   if(count == 3)
		   {
			  labelArray[2].setText(factsArray[2]);
			  labelArray[2].setVisible(true);
			  labelArray[1].setVisible(false);
		   }
       else 
		   if(count == 4)
		   {
			  labelArray[3].setText(factsArray[3]);	
			  labelArray[3].setVisible(true);
			  labelArray[2].setVisible(false);
		   }
       else 
		   if(count == 5)
		   {
			  labelArray[4].setText(factsArray[4]);	
			  labelArray[4].setVisible(true);
			  labelArray[3].setVisible(false);
           }			  
	}
	
	public static void main(String[] args)
	{
		JHistoricalFacts aFrame = new JHistoricalFacts();
		aFrame.setBounds(300,300,290,100);
		aFrame.setVisible(true);
	}
}