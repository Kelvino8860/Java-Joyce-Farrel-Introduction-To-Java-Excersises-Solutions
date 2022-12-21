/* 3. a. Create a game called Last Man Standing in which the objective is to select the
		 last remaining JCheckBox. The game contains 10 JCheckBoxes. The player can
		 choose one, two, or three boxes, and then click a JButton to indicate the turn is
		 complete. The computer then randomly selects one, two, or three JCheckBox
		 objects. When the last JCheckBox is selected, display a message indicating the
		 winner. Save the game as LastManStanding.java.*/


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class LastManStanding extends JFrame implements ItemListener, ActionListener
{
	JLabel welcome = new JLabel("Last Man Standing");
	JLabel choose = new JLabel("Choose one, two, or three boxes");
	JButton turns = new JButton("Turn Complete");
	JLabel winner = new JLabel("");
	
	JCheckBox[] arrayBox = new JCheckBox[10];
	
	public LastManStanding()
	{
		super("LastManStanding");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		welcome.setFont(new Font("Arial", Font.BOLD, 16));
		choose.setFont(new Font("Arial", Font.BOLD, 14));
		winner.setFont(new Font("Arial", Font.BOLD, 14));
		setLayout(new FlowLayout());
		add(welcome);
		add(choose);
		initializeJCheckBoxes(arrayBox);
		add(turns);
		add(winner);
		turns.addActionListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e)
	{
		Object source = e.getItem();
		int selected = e.getStateChange();
		
		for(int i = 0; i < arrayBox.length; ++i)
		{
			if(source == arrayBox[i])
			{
				arrayBox[i].setSelected(true);
				if(arrayBox[9].isSelected())
					{
					   winner.setText("You Win!");
					   break;
					}
			}
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		computerSelection();
	}
	
	public void computerSelection()
	{
		int randomNums = 1 + (int)(Math.random() * 3);
		int count = 0;
		
			for(int i = 0; i < arrayBox.length; ++i)
			{
				if(arrayBox[i].isSelected() == false)
					{
						arrayBox[i].setSelected(true);
						count++;
						if(arrayBox[9].isSelected())
							{
								winner.setText("Computer Wins");
								break;
							}
					}
					
				if(count == randomNums)
					break;
			}
			
	}
	
	public void initializeJCheckBoxes(JCheckBox[] array)
	{
		int i;
		
		//Initialize JCheckBox and add them to JFrame
		for(i = 0; i < array.length; ++i)
		{
			array[i] = new JCheckBox();
			add(array[i]);
		}
		
		//Register them as event listeners
		for(i = 0; i < array.length; ++i)
			array[i].addItemListener(this);
	}
	
	public static void main(String[] args)
	{
		LastManStanding aFrame = new LastManStanding();
		aFrame.setVisible(true);
		aFrame.setBounds(300,300,250,250);
	}
}