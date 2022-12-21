/* b. Change the JTVDownload application to include an editable combo box. Allow the
      user to type the name of a television show and display an appropriate error
      message if the desired show is not available. Save the file as JTVDownload2.java.*/
		 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTVDownload2 extends JFrame implements ItemListener
{
	JLabel welcome = new JLabel("Choose your favourite show");
        String[] array = {"WEDNESDAY", "1899", "Willow", "Andor", "The Peripheral"}; 
	JComboBox<String> favShow = new JComboBox<String>(array);
	JLabel synopsis = new JLabel();
	JLabel errorLabel = new JLabel();
	
	public JTVDownload2()
	{
		super("Kelvino TV");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		welcome.setFont(new Font("Arial", Font.BOLD, 16));
		
        favShow.setEditable(true);       
		add(welcome);
		add(favShow);
		add(synopsis);
		add(errorLabel);
		favShow.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		int positionOfSelection = favShow.getSelectedIndex();
		Object selectItem = favShow.getSelectedItem();
			   
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
						else
						{
							synopsis.setText("Sorry! Wrong entry.");
						}
	}
	
	public static void main(String[] args)
	{
		 JTVDownload2 aFrame = new JTVDownload2();
		 aFrame.setBounds(300,300,300,250);
		 aFrame.setVisible(true);
	}
}