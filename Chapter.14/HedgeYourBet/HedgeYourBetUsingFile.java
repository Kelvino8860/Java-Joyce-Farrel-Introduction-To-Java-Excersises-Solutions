/* 1. b. Modify the HedgeYourBet game so that it stores the player’s score from the last
	 game in a file and displays the previous score at the start of each new game. (The
	 first time you play the game, the previous score should be 0.) Save the game as
	 HedgeYourBetUsingFile.java*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class HedgeYourBetUsingFile extends JFrame implements ActionListener, ItemListener
{
	Path file = Paths.get("C:\\Users\\NJORO\\Desktop\\Chapter.14\\HedgeYourBet\\HedgeYourBet.txt");
	final String[] questions = {"Which is the largest county by pupulation?",
	                            "Where is lake elementaita located?",
								"Which is the oldest town in Kenya?",
								"Which town has a costal line?",
								"Which city is the capital of Kenya?"};
								
	final String[] ans = {"Nairobi","Mombasa","Nakuru"};
								
	final String[] trueAns = {"Nairobi","Nakuru","Mombasa","Mombasa","Nairobi"};
	int quizNum = 0;
	int scores = 0;
	int countQuiz = 0;
	int highestScore = 0;
	
	OutputStream output = null;
	
	answers[] playerAns = new answers[5];
	
	JLabel welcome = new JLabel("WELCOME TO HEDGE YOUR BET");
	JLabel highScore = new JLabel();
	JLabel quiz = new JLabel(questions[0]);
	JLabel congrats = new JLabel("");
	JCheckBox nairobi = new JCheckBox("Nairobi");
	JCheckBox mombasa = new JCheckBox("Mombasa");
	JCheckBox nakuru = new JCheckBox("Nakuru");
	JButton nextQuiz = new JButton("Next");
	JButton submit = new JButton("Submit");
	
	public HedgeYourBetUsingFile()
	{
		super("HedgeYourBet");
		
		for(int i = 0; i < playerAns.length; ++i)
			playerAns[i] = new answers();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		welcome.setFont(new Font("Arial", Font.BOLD, 16));
		highScore.setFont(new Font("Arial", Font.BOLD, 14));
		quiz.setFont(new Font("Arial",Font.BOLD, 14));
		congrats.setFont(new Font("Arial", Font.BOLD, 16));
		setLayout(new FlowLayout());
		submit.setEnabled(false);
		

            //Read file of scores
		InputStream input = null;
		try
		{   
			input = new BufferedInputStream(Files.newInputStream(file,READ));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			String s = null;
			s = reader.readLine();
			input.close();
		    highScore.setText("HIGH SCORE: " + s);
			
		}
		catch(Exception g)
		{
			System.out.println("Message: " + g);
		}
		
		add(welcome);
		add(highScore);
		add(quiz);
		add(nairobi);
		add(mombasa);
		add(nakuru);
		add(nextQuiz);
		add(submit);
		add(congrats);
		
		nairobi.addItemListener(this);
		mombasa.addItemListener(this);
		nakuru.addItemListener(this);
		nextQuiz.addActionListener(this);
		submit.addActionListener(this);
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e)
	{

		Object source = e.getItem();
		int selected = e.getStateChange();
		
		if(source == nairobi)
		{
			if(selected == ItemEvent.SELECTED)
				playerAns[quizNum].setAnswer(ans[0]);
			else
				playerAns[quizNum].setRemove(ans[0]);
		}
		
		else
			if(source == mombasa)
			{
				if(selected == ItemEvent.SELECTED)
					playerAns[quizNum].setAnswer(ans[1]);
				else
					playerAns[quizNum].setRemove(ans[1]);
			}
			
			else
				if(source == nakuru)
				{
					if(selected == ItemEvent.SELECTED)
						playerAns[quizNum].setAnswer(ans[2]);
					else
						playerAns[quizNum].setRemove(ans[2]);
				}
							
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		quizNum++;
		
		if(source == nextQuiz)
		{   countQuiz += 1;
			quiz.setText(questions[countQuiz]);
			nairobi.setSelected(false);
	        mombasa.setSelected(false);
	        nakuru.setSelected(false);
		
		     if(countQuiz == 4)
		      {
			     nextQuiz.setEnabled(false);
			     submit.setEnabled(true);
		       }
		}
		
		if(source == submit)
		   {
			  for(int i = 0; i < questions.length; ++i)
		        {
			       if(playerAns[i].getSize() == 3)
				     scores += 1;
			       else
				     if(playerAns[i].getSize() == 2)
				       {
				         	for(int j = 0; j < playerAns[i].getSize(); ++j)
					         {
						         if(trueAns[i].equals(playerAns[i].getAnswers(j)))
						           {
							         scores += 2;
							         break;
						           }
						          else
							        scores += 0;
					          }
				        }
				
				      else
					    if(playerAns[i].getSize() == 1)
					      {
						      if(trueAns[i].equals(playerAns[i].getAnswers(0)))
							    scores += 5;
						       else
							     scores += 0;
					       }
		          }
				  
				  if(scores > highestScore)
				  {
					  highestScore = scores;
				  }
				  
				  String s = String.valueOf(highestScore);
				  //Write highest score to file
			byte[] data = s.getBytes();
		     try
		     {
			    output = new BufferedOutputStream(Files.newOutputStream(file,WRITE));
			    output.write(data);
				output.flush();
				output.close();
		     }
		    catch(Exception f)
		     {
			    System.out.println("Message: " + f);  
		     }
		
		          displayCongrats();
	          }
	}
	
	public void displayCongrats()
	{
		if(scores > 21)
		{
			congrats.setText("FANTASTIC! : " + scores);
		}
		else
			if(scores <= 21 && scores > 15)
			{
				congrats.setText("Very Good : " + scores);
			}
			else
				if(scores <= 15)
				{
					congrats.setText("OK : " + scores);
				}

            submit.setEnabled(false);
	}
	
	public static void main(String[] args)
	{
		HedgeYourBetUsingFile aFrame = new HedgeYourBetUsingFile();
		aFrame.setBounds(300,300,300,300);
		aFrame.setVisible(true);
	}
}