/* 7. Write an application that allows a user to select a country from a list box that
      contains at least seven options. After the user makes a selection, display the country’s
      capital city. Save the file as JCapitals.java.*/
	  
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JCapital extends JFrame implements ItemListener
{
	String[] country = {"Kenya","Tanzania","Uganda","Rwanda","Burundi","Congo","Nigeria"};
	String[] capital = {"Nairobi","Dodoma","Kampala","Kigali","Bujumbura","Kinshasa","Abuja"};
	JLabel intro = new JLabel("Choose a country");
	JComboBox aBox = new JComboBox(country);
	JLabel display = new JLabel("Capital City: ");
	JTextField city = new JTextField(10);
	
	public JCapital()
	{
		super("Capital Cities");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		intro.setFont(new Font("Arial", Font.BOLD, 16));
		display.setFont(new Font("Arial", Font.BOLD, 14));
		add(intro);
		add(aBox);
		add(display);
		add(city);
		
		aBox.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
        Object source = aBox.getSelectedItem();
		int position = aBox.getSelectedIndex();
		
		for(int i = 0; i < country.length; ++i)
		{
			if(source.equals(country[i]))
			{
				city.setText(capital[i]);
				break;
			}
		}
	}
	
	public static void main(String[] args)
	{
		JCapital aFrame = new JCapital();
		aFrame.setBounds(300,300,250,250);
		aFrame.setVisible(true);
	}
}