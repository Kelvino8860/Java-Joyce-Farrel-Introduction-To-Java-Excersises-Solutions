/* 4. Write an application for Lambert’s Vacation Rentals. Use separate ButtonGroups to
      allow a client to select one of three locations, the number of bedrooms, and whether
      meals are included in the rental. Assume that the locations are parkside for $600 per
      week, poolside for $750 per week, or lakeside for $825 per week. Assume that the
      rentals have one, two, or three bedrooms and that each bedroom over one adds $75
      to the base price. Assume that if meals are added, the price is $200 more per rental.
      Save the file as JVacationRental.java*/
	  
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JVacationRental extends JFrame implements ItemListener
{
	  ButtonGroup location = new ButtonGroup();
	  ButtonGroup bedroom = new ButtonGroup();
	  ButtonGroup meals = new ButtonGroup();
	  //Locations
	  JCheckBox parkside = new JCheckBox("Parkside $600 per week");
	  JCheckBox poolside = new JCheckBox("Poolside $750 per week");
	  JCheckBox lakeside = new JCheckBox("Lakeside $825 per week");
	  
	  //Bedrooms
	  JCheckBox oneBedroom = new JCheckBox("One bedroom");
	  JCheckBox twoBedroom = new JCheckBox("Two bedrooms");
      JCheckBox threeBedroom = new JCheckBox("Three bedrooms");

     //Meals
     JCheckBox mealsAvail = new JCheckBox("Meals (Yes)");
	 JCheckBox mealsUnavail = new JCheckBox("Meals (No)");
	 
	 int basePrice = 0;
	 final int BASE_PARKSIDE = 600;
	 final int BASE_POOLSIDE = 750;
	 final int BASE_LAKESIDE = 825;
	 final int MEAL_PRICE = 200;
	 final int EXTRA_BEDROOM = 75;
	 
	 JLabel intro = new JLabel("WELCOME TO Lambert Rental");
	 JLabel priceLabel = new JLabel("TOTAL PRICE");
	 JTextField price = new JTextField(4);
	 
	 public JVacationRental()
	 {
		 super("Lambert’s Vacation Rentals");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setLayout(new FlowLayout());
		 intro.setFont(new Font("Arial", Font.BOLD, 16));
		 
		 add(intro);

		 //Add JCheckBox to the ButtonGroup location
		 location.add(parkside);
		 location.add(poolside);
		 location.add(lakeside);
		 add(parkside);
		 add(poolside);
		 add(lakeside);
		 
		 //Add JCheckBox to the ButtonGroup bedroom
		 bedroom.add(oneBedroom);
		 bedroom.add(twoBedroom);
		 bedroom.add(threeBedroom);
		 add(oneBedroom);
		 add(twoBedroom);
		 add(threeBedroom);
		 
		 //Add JCheckBox to the ButtonGroup meals
		 meals.add(mealsAvail);
		 meals.add(mealsUnavail);
		 add(mealsAvail);
		 add(mealsUnavail);
		 
		 add(priceLabel);
		 add(price);

                 parkside.addItemListener(this);
                 poolside.addItemListener(this);
                 lakeside.addItemListener(this);
				 oneBedroom.addItemListener(this);
				 twoBedroom.addItemListener(this);
				 threeBedroom.addItemListener(this);
				 mealsAvail.addItemListener(this);
				 mealsUnavail.addItemListener(this);
	 }
	 
	 @Override
	 public void itemStateChanged(ItemEvent e)
	 {
		 Object source = e.getItem();
		 int selected = e.getStateChange();
		 
		 //Events in the location ButtonGroup
		  if(source == parkside)
		  {
			    if(selected == ItemEvent.SELECTED)
			      basePrice += BASE_PARKSIDE;
			    else
					basePrice -= BASE_PARKSIDE;
		  }
		  else
			if(source == poolside)
			{
				if(selected == ItemEvent.SELECTED)
					basePrice += BASE_POOLSIDE;
				else
					basePrice -= BASE_POOLSIDE;
			}
			else
				if(source == lakeside)
				{
					if(selected == ItemEvent.SELECTED)
						basePrice += BASE_LAKESIDE;
					else
						basePrice -= BASE_LAKESIDE;
				}
				
				
	    //Events in the bedroom ButtonGroup		
		   if(source == oneBedroom)
		   {
			   if(selected == ItemEvent.SELECTED)
				   basePrice += 0;
			   else
				   basePrice -= 0;
		   }
		   else
			   if(source == twoBedroom)
			   {
				   if(selected == ItemEvent.SELECTED)
				       basePrice += (2 * EXTRA_BEDROOM);
				   else 
					   basePrice -= (2 * EXTRA_BEDROOM);
			   }
			   else
				   if(source == threeBedroom)
				   {
					   if(selected == ItemEvent.SELECTED)
				          basePrice += (3 * EXTRA_BEDROOM);
				       else 
					       basePrice -= (3 * EXTRA_BEDROOM);
				   }
				   
		//Events in the meals ButtonGroup
          if(source == mealsAvail)
		   {
			   if(selected == ItemEvent.SELECTED)
				   basePrice += MEAL_PRICE;
			   else
				   basePrice -= MEAL_PRICE;
		   }
		   else
			   if(source == mealsUnavail)
			   {
				   if(selected == ItemEvent.SELECTED)
				       basePrice += 0;
				   else 
					   basePrice -= 0;
			   }
				   
				   price.setText("$" + basePrice);
           		
	 }
	 
	 public static void main(String[] args)
	 {
		 JVacationRental aFrame = new JVacationRental();
		 aFrame.setBounds(300,300,250,300);
		 aFrame.setVisible(true);
	 }
     	 
}