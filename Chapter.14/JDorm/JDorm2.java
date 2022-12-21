/* 9. b. Modify the JDorm application so that instead of a running list of the user’s choices,
         the application displays only the current choices. Save the file as JDorm2.java.*/
		 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class JDorm2 extends JFrame implements ItemListener
{
	String[] array = {"Private room", "Interenet Connection", "Cable TV connection", "Microwave", "Refrigerator"};
	ArrayList<String> arrayList = new ArrayList<String>();
	JTextArea textArea = new JTextArea();
	JCheckBox room = new JCheckBox("Private room");
    JCheckBox interenet = new JCheckBox("Interenet Connection");
    JCheckBox tvConnection = new JCheckBox("Cable TV connection");
    JCheckBox microwave = new JCheckBox("Microwave");
    JCheckBox refrigerator = new JCheckBox("Refrigerator");

    JLabel welcome = new JLabel("YOUR SELECTIONS");

    public JDorm2()
	{
		super("JDorm2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		welcome.setFont(new Font("Arial", Font.BOLD, 16));
		
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
				for(int i = 0; i < array.length; ++i)
				{
					if(array[i].equals(array[0]))
					{
						arrayList.add(array[0]);
					}
				}
				
				for(int i = 0; i < arrayList.size(); ++i)
				textArea.append(arrayList.get(i) + "\n");
			}
			else
			{
				arrayList.remove(array[0]);
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
				    for(int i = 0; i < array.length; ++i)
				     {
					   if(array[i].equals(array[1]))
					   {
						  arrayList.add(array[1]);
					   }
				    }
					
					for(int i = 0; i < arrayList.size(); ++i)
				     textArea.append(arrayList.get(i) + "\n");
			     }
			   else
			   {
				 arrayList.remove(array[1]);
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
				         for(int i = 0; i < array.length; ++i)
				         {
				             if(array[i].equals(array[2]))
						     {
						         arrayList.add(array[2]);
						     }
				         }
						 
						 for(int i = 0; i < arrayList.size(); ++i)
				           textArea.append(arrayList.get(i) + "\n");
			         }
			   else
			   {
				   arrayList.remove(array[2]);
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
				            for(int i = 0; i < array.length; ++i)
				              {
					            if(array[i].equals(array[3]))
								{
						            arrayList.add(array[3]);
								}
				              }
							  
							  for(int i = 0; i < arrayList.size(); ++i)
				                textArea.append(arrayList.get(i) + "\n");
			            }
			         else
				      {
					     arrayList.remove(array[3]);
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
				                 for(int i = 0; i < array.length; ++i)
				                   {
					                  if(array[i].equals(array[4]))
									  {
						                  arrayList.add(array[4]);
									  }
				                   }
								   
								   for(int i = 0; i < arrayList.size(); ++i)
				                     textArea.append(arrayList.get(i) + "\n");
							  }
			                else
							{
			                   arrayList.remove(array[4]);
							   textArea.setText("");
							   for(int i = 0; i < arrayList.size(); ++i)
			                   textArea.append(arrayList.get(i) + "\n");
							}
						} 
			
	}
	
	public static void main(String[] args)
	{
		JDorm2 aFrame = new JDorm2();
		aFrame.setBounds(300,300,190,330);
		aFrame.setVisible(true);
	}
}