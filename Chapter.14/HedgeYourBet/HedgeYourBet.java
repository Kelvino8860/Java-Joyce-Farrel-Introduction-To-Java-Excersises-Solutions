/* 1. a. Create a quiz game that displays, in turn, five questions about any topic of your
         choice. All five questions should have the same three possible multiple-choice
         answers. For example, you might ask trivia questions about U.S. states for which
         the correct response is either California, Florida, or New York. After each
         question is displayed, allow the user to choose one, two, or all three answers by
         selecting JCheckBoxes. In other words, if the user is sure of an answer, he will
         select just one box, but if he is uncertain, he might select two or three boxes.
         When the user is ready to submit the answer(s), he clicks a button. If the user’s
         answer to the question is correct and he has selected just one box, award 5
         points. If the user is correct but has selected two boxes, award 2 points. If the
         user has selected all three boxes, award 1 point. If the user has selected
         fewer than three boxes but is incorrect, the user receives 0 points. A total of
         25 points is possible. If the user has accumulated more than 21 points at the
         end of the quiz, display the message Fantastic! If the user has accumulated
         more than 15 points, display the message Very good, and if the user has
         accumulated fewer points, display OK. Save the file as HedgeYourBet.java.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HedgeYourBet extends JFrame implements ActionListener, ItemListener
{
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
	answers[] playerAns = new answers[5];
	
	JLabel welcome = new JLabel("WELCOME TO HEDGE YOUR BET");
	JLabel quiz = new JLabel(questions[0]);
	JLabel congrats = new JLabel("");
	JCheckBox nairobi = new JCheckBox("Nairobi");
	JCheckBox mombasa = new JCheckBox("Mombasa");
	JCheckBox nakuru = new JCheckBox("Nakuru");
	JButton nextQuiz = new JButton("Next");
	JButton submit = new JButton("Submit");
	
	public HedgeYourBet()
	{
		super("HedgeYourBet");
		
		for(int i = 0; i < playerAns.length; ++i)
			playerAns[i] = new answers();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		welcome.setFont(new Font("Arial", Font.BOLD, 16));
		quiz.setFont(new Font("Arial",Font.BOLD, 14));
		congrats.setFont(new Font("Arial", Font.BOLD, 16));
		setLayout(new FlowLayout());
		submit.setEnabled(false);
		
		add(welcome);
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
		HedgeYourBet aFrame = new HedgeYourBet();
		aFrame.setBounds(300,300,300,300);
		aFrame.setVisible(true);
	}
}