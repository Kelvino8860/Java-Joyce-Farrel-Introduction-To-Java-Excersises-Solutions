/* 9. a. Search the Java Web site for information on how to use a JTextArea, its
         constructors, and its setText() and append() methods. Write an application
         that allows the user to select options for a dormitory room. Use JCheckBoxes
         for options such as private room, Internet connection, cable TV connection,
         microwave, refrigerator, and so on. When the application starts, use a text area to
         display a message listing the options that are not yet selected. As the user selects
		 and deselects options, add appropriate messages to the common text area so it
         accumulates a running list that reflects the user’s choices. Save the file as JDorm.java.*/
		 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class JDorm extends JFrame implements ItemListener
{
	String[] array = {"Private room", "Interenet Connection", "Cable TV connection", "Microwave", "Refrigerator"};
	ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(array));
	JTextArea textArea = new JTextArea();
	JCheckBox room = new JCheckBox("Private room");
    JCheckBox interenet = new JCheckBox("Interenet Connection");
    JCheckBox tvConnection = new JCheckBox("Cable TV connection");
    JCheckBox microwave = new JCheckBox("Microwave");
    JCheckBox refrigerator = new JCheckBox("Refrigerator");

    JLabel welcome = new JLabel("SELECT OPTIONS");

    public JDorm()
	{
		super("JDorm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		welcome.setFont(new Font("Arial", Font.BOLD, 16));
		
		for(int i = 0; i < arrayList.size(); ++i)
		{
			textArea.append(arrayList.get(i) + "\n");
		}
		
		add(welcome);
		add(textArea);
		add(room);
		add(interenet);
		add(tvConnection);
		add(microwave);
		add(refrigerator);
		
		room.addItemListener(this);
		interenet.addItemListener(this);
		tvConnection.addItemListener(this);
		microwave.addItemListener(this);
		refrigerator.addItemListener(this);
	}		
	
	@Override
	public void itemStateChanged(ItemEvent e)
	{
		Object source = e.getSource();
		int selected = e.getStateChange();
		
		if(source == room)
		{
			if(selected == ItemEvent.SELECTED)
			{
				textArea.setText("");
				for(int i = 0; i < arrayList.size(); ++i)
				{
					if(!arrayList.get(i).equals(array[0]))
					{
						textArea.append(arrayList.get(i) + "\n");
					}
				}
				
				arrayList.remove(array[0]);
			}
			else
			{
				arrayList.add(array[0]);
				textArea.setText("");
				for(int i = 0; i < arrayList.size(); ++i)
			     textArea.append(arrayList.get(i) + "\n");
			}
		}
		
		else
			if(source == interenet)
			{
				if(selected == ItemEvent.SELECTED)
			     {
				    textArea.setText("");
				    for(int i = 0; i < arrayList.size(); ++i)
				     {
					   if(!arrayList.get(i).equals(array[1]))
					   {
						  textArea.append(arrayList.get(i) + "\n");
					   }
				    }
					
					arrayList.remove(array[1]);
			     }
			   else
			   {
				 arrayList.add(array[1]);
				 textArea.setText("");
			     for(int i = 0; i < arrayList.size(); ++i)
			        textArea.append(arrayList.get(i) + "\n");
			   }
			}
			else
				if(source == tvConnection)
				{
					if(selected == ItemEvent.SELECTED)
			         {
				         textArea.setText("");
				         for(int i = 0; i < arrayList.size(); ++i)
				         {
				             if(!arrayList.get(i).equals(array[2]))
						     {
						         textArea.append(arrayList.get(i) + "\n");
						     }
				         }
						 
						 arrayList.remove(array[2]);
			         }
			   else
			   {
				   arrayList.add(array[2]);
				   textArea.setText("");
				   for(int i = 0; i < arrayList.size(); ++i)
			        textArea.append(arrayList.get(i) + "\n");
			   }
				}
				
				else
					if(source == microwave)
					{
						if(selected == ItemEvent.SELECTED)
			            {
				            textArea.setText("");
				            for(int i = 0; i < arrayList.size(); ++i)
				              {
					            if(!arrayList.get(i).equals(array[3]))
								{
						            textArea.append(arrayList.get(i) + "\n");
								}
				              }
							  
							  arrayList.remove(array[3]);
			            }
			         else
				      {
					     arrayList.add(array[3]);
						 textArea.setText("");
						 for(int i = 0; i < arrayList.size(); ++i)
			               textArea.append(arrayList.get(i) + "\n"); 
				      }
					}
					
					else
						if(source == refrigerator)
						{
							if(selected == ItemEvent.SELECTED)
			                  {
				                 textArea.setText("");
				                 for(int i = 0; i < arrayList.size(); ++i)
				                   {
					                  if(!arrayList.get(i).equals(array[4]))
									  {
						                  textArea.append(arrayList.get(i) + "\n");
									  }
				                   }
								   
								   arrayList.remove(array[4]);
							  }
			                else
							{
			                   arrayList.add(array[4]);
							   textArea.setText("");
							   for(int i = 0; i < arrayList.size(); ++i)
			                   textArea.append(arrayList.get(i) + "\n");
							}
						} 
	}
	
	public static void main(String[] args)
	{
		JDorm aFrame = new JDorm();
		aFrame.setBounds(300,300,190,330);
		aFrame.setVisible(true);
	}
}