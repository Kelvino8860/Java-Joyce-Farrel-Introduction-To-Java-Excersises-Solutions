/*   2. In previous chapters, you have created a number of programs for Sammy’s Seashore
	Rentals. Now, create an interactive GUI program that allows the user to enter
	a rental time in hours into a text field; if the value entered is not numeric, 	set the
	rental price to 0. Also allow the user to choose one equipment type to rent from
	a group of seven choices. The rental fee is $40 per hour for a jet ski or pontoon boat;
	$20 per hour for a rowboat, canoe, or kayak; and $7 per hour for a beach chair
	or umbrella. Let the user add an equipment lesson for an extra $5. Display a message
	that indicates all the details for the rental, including the total price. Save the
	program as JSammysSeashore.java*/

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class JSammysSeashore extends JFrame implements ActionListener, ItemListener
{
   int numHours = 0;
   int basePrice = 0;
   final int JETPON_PRICE = 40;
   final int ROW_CAN_KA_PRICE = 20;
   final int BE_UM_PRICE = 7;
   final int LESSON_PRICE = 5;

   JLabel welcome = new JLabel("Welcome To SammysSeashore");
   JLabel enterHrs = new JLabel("Enter rental time(hours): ");
   JTextField hours = new JTextField(4);

   JLabel choice = new JLabel("Choose one equipment type to rent: ");
   ButtonGroup aGroup = new ButtonGroup();
   JCheckBox jetSki = new JCheckBox("Jet ski @$40 per hour");
   JCheckBox pontoon = new JCheckBox("Pontoon boat @$40 per hour");
   JCheckBox rowboat = new JCheckBox("Rowboat @$20 per hour");
   JCheckBox canoe = new JCheckBox("Canoe @$20 per hour");
   JCheckBox kayak = new JCheckBox("Kayak @$20 per hour");
   JCheckBox beachChair = new JCheckBox("Beach chair @$7 per hour");
   JCheckBox umbrella = new JCheckBox("Umbrella @$7 per hour");

   JCheckBox[] arrayJcheck = {jetSki,pontoon,rowboat,canoe,kayak,beachChair,umbrella};

   JLabel lesson = new JLabel("Take Lesson: ");
   JCheckBox takeLesson = new JCheckBox("Lesson @$5 per hour");

   JLabel display = new JLabel();

   public JSammysSeashore()
   {
       super("JSammysSeashore");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       welcome.setFont(new Font("Arial",Font.BOLD,16));
       enterHrs.setFont(new Font("Arial",Font.BOLD,14));
       lesson.setFont(new Font("Arial",Font.BOLD,14));
       display.setFont(new Font("Arial",Font.BOLD,14));
       setLayout(new FlowLayout());

       add(welcome);
       add(enterHrs);
       add(hours);
       add(choice);

       //Add the equipments boxes to ButtonGroup
       for(int i = 0; i < arrayJcheck.length; ++i) 
       {
           aGroup.add(arrayJcheck[i]);
       }

       //Add equipments boxes to frame
       for(int i = 0; i < arrayJcheck.length; ++i) 
       {
          add(arrayJcheck[i]);
       }

       add(lesson);
       add(takeLesson);
       add(display);

       //Make textField and JCheckBoxes event listeners
       hours.addActionListener(this);
       for(int i = 0; i < arrayJcheck.length; ++i) 
       {
          arrayJcheck[i].addItemListener(this);
       }
       takeLesson.addItemListener(this);

   }

   @Override
   public void itemStateChanged(ItemEvent e)
   {
        Object source = e.getItem();
        int selected = e.getStateChange();
      
       if(source == jetSki)
       {
          if(selected == ItemEvent.SELECTED)
          {
            basePrice += (JETPON_PRICE * numHours);
          }
          else
          basePrice -= (JETPON_PRICE * numHours);
       }
       else
       if(source == pontoon)
       {
          if(selected == ItemEvent.SELECTED)
          {
            basePrice += (JETPON_PRICE * numHours);
          }
          else
          basePrice -= (JETPON_PRICE * numHours);
       }
       else 
       if(source == rowboat)
       {
         if(selected == ItemEvent.SELECTED)
         {
           basePrice += (ROW_CAN_KA_PRICE * numHours);
         }
         else
         basePrice -= (ROW_CAN_KA_PRICE * numHours);
       }
       else 
       if(source == canoe)
       {
         if(selected == ItemEvent.SELECTED)
         {
           basePrice += (ROW_CAN_KA_PRICE * numHours);
         }
         else
         basePrice -= (ROW_CAN_KA_PRICE * numHours);
       }
       else 
       if(source == kayak)
       {
         if(selected == ItemEvent.SELECTED)
         {
           basePrice += (ROW_CAN_KA_PRICE * numHours);
         }
         else
         basePrice -= (ROW_CAN_KA_PRICE * numHours);
       }
       else 
       if(source == beachChair)
       {
         if(selected == ItemEvent.SELECTED)
         {
           basePrice += (BE_UM_PRICE * numHours);
         }
         else
         basePrice -= (BE_UM_PRICE * numHours);
       }
       else 
       if(source == umbrella)
       {
         if(selected == ItemEvent.SELECTED)
         {
           basePrice += (BE_UM_PRICE * numHours);
         }
         else
         basePrice -= (BE_UM_PRICE * numHours);
       }
       else 
       if(source == takeLesson)
       {
         if(selected == ItemEvent.SELECTED)
         {
           basePrice += (LESSON_PRICE * numHours);
         }
         else
         basePrice -= (LESSON_PRICE * numHours);
       }

        display.setText("Total Price: $" + basePrice);

   }

   @Override
   public void actionPerformed(ActionEvent e)
   {
        Object source = e.getSource();

       //Ensure the number of hours entered is digit else
       //set to 0
        if(source instanceof JTextField)
        {
          String s = hours.getText();
          for(int i = 0; i < s.length(); ++i) 
          {
            if(!Character.isDigit(s.charAt(i)))
            hours.setText("0");
          }
        }

        numHours = Integer.parseInt(hours.getText());
   }

   public static void main(String[] args)
   {
      JSammysSeashore aFrame = new JSammysSeashore();
      aFrame.setVisible(true);
      aFrame.setBounds(300,300,280,400);
   }
}