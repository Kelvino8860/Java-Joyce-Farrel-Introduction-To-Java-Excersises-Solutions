/* 5. a. Write an application that allows a user to select one of at least five television shows
         to watch on demand. When the user selects a show, display a brief synopsis. Save
         the file as JTVDownload.java.*/
		 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTVDownload extends JFrame implements ItemListener
{
	JLabel welcome = new JLabel("Choose your favourite show");
	JComboBox<String> favShow = new JComboBox<String>();
	JLabel synopsis = new JLabel();
	
	public JTVDownload()
	{
		super("Kelvino TV");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		welcome.setFont(new Font("Arial", Font.BOLD, 16));
		
		favShow.addItem("WEDNESDAY");
	    favShow.addItem("1899");
	    favShow.addItem("Willow");
	    favShow.addItem("Andor");
	    favShow.addItem("The Peripheral");
		
		add(welcome);
		add(favShow);
		add(synopsis);
		favShow.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		int positionOfSelection = favShow.getSelectedIndex();
		
		if(positionOfSelection == 0)
		{
			synopsis.setText("While attending Nevermore Academy, Wednesday Addams attempts to master her emerging psychic ability," +
			" thwart a killing spree and solve the mystery that embroiled her parents 25 years ago");
		}
		else
			if(positionOfSelection == 1)
			{
				synopsis.setText("Immigrants on a steamship traveling from London to New York get caught up in a mysterious" +
				" riddle after finding a second vessel adrift on the open sea.");
			}
			else
				if(positionOfSelection == 2)
				{
					synopsis.setText("An unlikely group of heroes set off on a dangerous quest to places far beyond their home, " +
					          " where they must face their inner demons and come together to save their world.");
				}
				else
					if(positionOfSelection == 3)
					{
						synopsis.setText("Rebel spy Cassian Andor's formative years of the Rebellion.");
					}
					else
						if(positionOfSelection == 4)
						{
							synopsis.setText("Set in the future when technology has subtly altered society, " +
							  "a woman discovers a secret connection to an alternate reality as well as a dark future of her own.");
						}
	}
	
	public static void main(String[] args)
	{
		 JTVDownload aFrame = new JTVDownload();
		 aFrame.setBounds(300,300,300,250);
		 aFrame.setVisible(true);
	}
}