import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class JLottery2 extends JFrame implements ItemListener
{
	JLabel welcome = new JLabel("Welcome To JLottery");
	JLabel instruction = new JLabel("Choose six boxes");
	JLabel compsRand = new JLabel("Random Numbers: ");
	JLabel playerRands = new JLabel("Player Numbers: ");
	JLabel wins = new JLabel("Amount Won: ");
	JTextField playerNums = new JTextField(18);
	JTextField playerRandomss = new JTextField(18);
	JTextField playerWins = new JTextField(9);
	JCheckBox[] arrayBox = new JCheckBox[31];
	int countSelect = 1;
	int numberChoosen;
	int[] randomNums = new int[6];
	ArrayList<Integer> arrayNums = new ArrayList<>(6);
	
	public JLottery2()
	{
		super("JLottery2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		welcome.setFont(new Font("Arial",Font.BOLD,16));
		instruction.setFont(new Font("Arial",Font.BOLD,14));
		add(welcome);
		add(instruction);
		setJCheckBoxex(arrayBox,randomNums);
		add(compsRand);
		add(playerRandomss);
		add(playerRands);
		add(playerNums);
		add(wins);
		add(playerWins);

	}
	
	public void displayInfo(ArrayList<Integer> arrayNums, int[] randomNums)
	{
		String num = "";
		String num2 = "";
		//Display computer generated random numbers
		for(int i = 0; i < randomNums.length; ++i)
		{
			num += String.valueOf(randomNums[i]) + ", ";
			playerRandomss.setText(num);
			
		}
		
		//Display players guessed numbers
		for(int i = 0; i < arrayNums.size(); ++i)
		{
			num2 += String.valueOf(arrayNums.get(i)) + ", ";
			playerNums.setText(num2);
		}
		
		int countMatch = 0;
		//Display players amount won
		for(int i = 0; i < randomNums.length; ++i)
		{
			if(randomNums[i] == arrayNums.get(i))
			{
				countMatch++;
			}
		}
		
		if(countMatch == 3)
			playerWins.setText("$100");
		else
			if(countMatch == 4)
				playerWins.setText("$10,000");
			else
				if(countMatch == 5)
					playerWins.setText("$50,000");
				else
					if(countMatch == 6)
						playerWins.setText("$100,000");
					else
					    playerWins.setText("$0");
		
			
	}
	
	public void setJCheckBoxex(JCheckBox[] arrayBox, int[] randomNums)
	{
		int count = 0;
		String s = null;
		//Initialize JCheckBoxex
		for(int i = 0; i < arrayBox.length; ++i)
		{
			s = String.valueOf(count);
			arrayBox[i] = new JCheckBox(s);
			count++;
		}
		
		//Initialize the random numbers
		for(int i = 0; i < randomNums.length; ++i)
		{
			randomNums[i] = (int)(Math.random() * 30 + 1);
		}
		
		//Add the JCheckBoxes to JFrame
		for(int i = 0; i < arrayBox.length; ++i)
		{
			add(arrayBox[i]);
		}
		
		//Sign the JCheckBoxex as item listeners
		for(int i = 0; i < arrayBox.length; ++i)
		{
			arrayBox[i].addItemListener(this);
		}
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e)
	{
		Object source = e.getItem();
		int selected = e.getStateChange();
		String s = ""; 
		if(countSelect <= 6)
		{
		   for(int i = 0; i < arrayBox.length; ++i)
		   {
			   if(source == arrayBox[i])
			   {
					  if(selected == ItemEvent.SELECTED)
						{
						   countSelect++;
						   s = arrayBox[i].getText();
						   numberChoosen = Integer.parseInt(s);
						   arrayNums.add(numberChoosen);
						}
						else
						{
							arrayBox[i].setSelected(true);
						}
			   }
		   }
		}
		
		else
		{
			for(int i = 0; i < arrayBox.length; ++i)
				if(source == arrayBox[i])
			       arrayBox[i].setSelected(false);
			   displayInfo(arrayNums,randomNums);
		}
		
	}
	
	public static void main(String[] args)
	{
		JLottery2 aFrame = new JLottery2();
		aFrame.setVisible(true);
		aFrame.setBounds(300,300,250,400);
	}
}