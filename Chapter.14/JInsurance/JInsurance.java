/* 8. Write an application that allows the user to choose insurance options in JCheckBoxes.
      Use a ButtonGroup to allow the user to select only one of two insurance types—HMO
      (health maintenance organization) or PPO (preferred provider organization). Use
      regular (single) JCheckBoxes for dental insurance and vision insurance options; the
      user can select one option, both options, or neither option. As the user selects each
      option, display its name and price in a text field; the HMO costs $200 per month, the
      PPO costs $600 per month, the dental coverage adds $75 per month, and the vision
      care adds $20 per month. When a user deselects an item, make the text field blank.
      Save the file as JInsurance.java.*/
	  
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JInsurance extends JFrame implements ItemListener
{
	Font font = new Font("Arial", Font.BOLD, 14);
	
	JLabel welcome = new JLabel("Kelvino Insurance");
	JLabel choice = new JLabel("Choose an Insurance Type");
	JTextField display = new JTextField();
	JTextField display2 = new JTextField();
	JTextField display3 = new JTextField();
	
	ButtonGroup aBox = new ButtonGroup();
	JCheckBox hmo = new JCheckBox("HMO");
	JCheckBox ppo = new JCheckBox("PPO");
	
	JCheckBox dentalInsurance = new JCheckBox("Dental Insurance");
	JCheckBox visionInsurance = new JCheckBox("Vision Insurance");
	
	
	public JInsurance()
	{
		super("JInsurance");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		welcome.setFont(new Font("Arial", Font.BOLD, 16));
		choice.setFont(font);
		display.setFont(font);
		
		//Add hmo and ppo JCheckBox into ButtonGroup aBox
		  aBox.add(hmo);
		  aBox.add(ppo);
		
		add(welcome);
		add(choice);
		add(hmo);
		add(ppo);
		
		add(choice);
		add(dentalInsurance);
		add(visionInsurance);
		
		add(display);
		add(display2);
		add(display3);
		
		   hmo.addItemListener(this);
		   ppo.addItemListener(this);
		   dentalInsurance.addItemListener(this);
		   visionInsurance.addItemListener(this);
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e)
	{
		Object source = e.getItem();
		int selected = e.getStateChange();
		
		if(source == hmo)
		{
	       display.setText("Health Maintenance Organization ($200 per month)");
		}
		else
			if(source == ppo)
			{
	     		display.setText("Preferred Provider Organization ($600 per month)");
			}
			
	    if(source == dentalInsurance)
		{
			if(selected == ItemEvent.SELECTED)
			{
			   display2.setText("Dental Insurance ($75 per month)");
			}
			else
				display2.setText("");
		}
		else
			if(source == visionInsurance)
			{
				if(selected == ItemEvent.SELECTED)
				{
				   display3.setText("Vision Insurance ($20 per month)");
				}
				else
					display3.setText("");
			}
			
	}
	
	public static void main(String[] args)
	{
		JInsurance aFrame = new JInsurance();
		aFrame.setBounds(400,400,250,300);
		aFrame.setVisible(true);
	}
}