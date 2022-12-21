/* b. In the current version of the Last Man Standing game, the computer might seem
	  to make strategic mistakes because of its random selections. For example, when
	  only two JCheckBox objects are left, the computer might randomly choose to
	  check only one, allowing the player to check the last one and win. Modify the
      game to make it as smart as possible, using a random value for the number of the
	  computer’s selections only when there is no superior alternative. Save the
	  improved game as SmarterLastManStanding.java*/


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class SmarterLastManStanding extends JFrame implements ItemListener, ActionListener
{
	JLabel welcome = new JLabel("Last Man Standing");
	JLabel choose = new JLabel("Choose one, two, or three boxes");
	JButton turns = new JButton("Turn Complete");
	JLabel winner = new JLabel("");
	
	JCheckBox[] arrayBox = new JCheckBox[10];
	
	public SmarterLastManStanding()
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
		int countUnselected = 0;
		
		//Count selected in order to make smart decision
		for(int i = 0; i < arrayBox.length; ++i)
		{
			if(arrayBox[i].isSelected() == false)
				countUnselected++;
		}
		
		if(countUnselected > 3)
		{
			for(int i = 0; i < arrayBox.length; ++i)
			{
				if(arrayBox[i].isSelected() == false)
					{
						arrayBox[i].setSelected(true);
						count++;
					}
					
				if(count == randomNums)
					break;
			}
		}
		else
		{
			for(int i = 0; i < arrayBox.length; ++i)
				if(arrayBox[i].isSelected() == false)
				{
					arrayBox[i].setSelected(true);
					if(arrayBox[9].isSelected())
						{
							winner.setText("Computer Wins");
							break;
						}
				}
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
		SmarterLastManStanding aFrame = new SmarterLastManStanding();
		aFrame.setVisible(true);
		aFrame.setBounds(300,300,250,250);
	}
}