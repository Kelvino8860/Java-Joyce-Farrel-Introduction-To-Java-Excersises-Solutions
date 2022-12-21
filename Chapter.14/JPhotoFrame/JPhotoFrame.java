/* 10. Create an application for Paula’s Portraits, a photography studio. The application
       allows users to compute the price of a photography session. Paula’s base price is $40
       for an in-studio photo session with one person. The in-studio fee is $75 for a session
       with two or more subjects, and $95 for a session with a pet. A $90 fee is added to
       take photos on location instead of in the studio. Include a set of mutually exclusive
       check boxes to select the portrait subject and another set of mutually exclusive
       check boxes for the session location. Include labels as appropriate to explain the
       application’s functionality. Save the file as JPhotoFrame.java.*/
	   
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JPhotoFrame extends JFrame implements ItemListener
{
	int totPrice = 0;
	final int ONE_PERSON = 40;
	final int MORE_PEOPLE = 75;
	final int WITH_PET = 95;
	final int ON_LOCATION = 90;
	
	JTextField priceField = new JTextField(4);
	
	JLabel welcome = new JLabel("PAULA'S PORTTAITS");
	JLabel subject = new JLabel("Choose portrait subject");
	JLabel location = new JLabel("Choose session location");
	JLabel price = new JLabel("Total Price:");
	
	ButtonGroup subjectGroup = new ButtonGroup();
	JCheckBox onePerson = new JCheckBox("One Person ($40)");
	JCheckBox twoPerson = new JCheckBox("More than one person ($75)");
	JCheckBox withPet = new JCheckBox("Session with a pet ($95)");
	
	ButtonGroup locationGroup = new ButtonGroup();
	JCheckBox inStudio = new JCheckBox("In-studion ($0)");
	JCheckBox onLocation = new JCheckBox("On location ($90)");
	
	public JPhotoFrame()
	{
		super("JPhotoFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		welcome.setFont(new Font("Arial", Font.BOLD, 16));
		subject.setFont(new Font("Arial", Font.BOLD, 14));
		location.setFont(new Font("Arial", Font.BOLD, 14));
		price.setFont(new Font("Arial", Font.BOLD, 14));
		setLayout(new FlowLayout());
		
		subjectGroup.add(onePerson);
		subjectGroup.add(twoPerson);
		subjectGroup.add(withPet);
		locationGroup.add(inStudio);
		locationGroup.add(onLocation);
		
		add(welcome);
		add(subject);
		add(onePerson);
		add(twoPerson);
		add(withPet);
		add(location);
		add(inStudio);
		add(onLocation);
		add(price);
		add(priceField);
		
		onePerson.addItemListener(this);
		twoPerson.addItemListener(this);
		withPet.addItemListener(this);
		inStudio.addItemListener(this);
		onLocation.addItemListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e)
	{
		Object source = e.getItem();
		int selected = e.getStateChange();
		
		if(source == onePerson)
		{
			if(selected == ItemEvent.SELECTED)
			{
				totPrice += ONE_PERSON;
			}
			else
				totPrice -= ONE_PERSON;
		}
		else
			if(source == twoPerson)
			{
				if(selected == ItemEvent.SELECTED)
				{
					totPrice += MORE_PEOPLE;
			    }
				else
					totPrice -= MORE_PEOPLE;
			}
			else
			   if(source == withPet)
			    {
				   if(selected == ItemEvent.SELECTED)
				    {
					   totPrice += WITH_PET;
			        }
				  else
					totPrice -= WITH_PET;
		     	}
				else
			     if(source == inStudio)
			      {
				     if(selected == ItemEvent.SELECTED)
				      {
					     totPrice += 0;
			          }
			    	else
					  totPrice -= 0;
			      }
				  else
			       if(source == onLocation)
			        {
				      if(selected == ItemEvent.SELECTED)
				        {
				        	totPrice += ON_LOCATION;
			            }
				      else
				     	totPrice -= ON_LOCATION;
			}
			
			priceField.setText("$" + totPrice);
			
	}
	
	public static void main(String[] args)
	{
		JPhotoFrame aFrame = new JPhotoFrame();
		aFrame.setBounds(300,300,300,350);
		aFrame.setVisible(true);
	}
}