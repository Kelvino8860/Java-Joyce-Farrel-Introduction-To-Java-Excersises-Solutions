/* 6. Design an application for a pizzeria. The user makes pizza order choices from list
      boxes, and the application displays the price. The user can choose a pizza size of small
      ($7), medium ($9), large ($11), or extra large ($14), and one of any number of
      toppings. There is no additional charge for cheese, but any other topping adds $1 to
      the base price. Offer at least five different topping choices. Save the file as JPizza.java*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JPizza extends JFrame implements ItemListener
{
	   int basePrice = 0;
	  final int SMALL_PRICE = 7;
	  final int MEDIUM_PRICE = 9;
	  final int LARGE_PRICE = 11;
	  final int EXTRA_LARGE = 14;
	  
	 JLabel welcome = new JLabel("WELCOME TO PIZZAIN");
	 JLabel pizza = new JLabel("Choose Pizza");
	 JLabel topping = new JLabel("Choose Topping");
	 JLabel priceLabel = new JLabel("Total Price");
	 JTextField price = new JTextField("$");
	 
	 ButtonGroup aGroupSize = new ButtonGroup();
	 JCheckBox small = new JCheckBox("Small @ $7");
	 JCheckBox medium = new JCheckBox("Medium @ $9");
	 JCheckBox large = new JCheckBox("Large @ $11");
	 JCheckBox extra = new JCheckBox("Extra Large @ $14");
	 
	 ButtonGroup aGroupTopping = new ButtonGroup();
	 JCheckBox cheese = new JCheckBox("Cheese (free)");
	 JCheckBox redPapper = new JCheckBox("Roasted Red Papper ($1)");
	 JCheckBox butternut = new JCheckBox("Roasted Butternut Squash ($1)");
	 JCheckBox broccoli = new JCheckBox("Roasted Broccoli ($1)");
	 JCheckBox fennel = new JCheckBox("Fennel ($1)");
	 JCheckBox mushrooms = new JCheckBox("Sauteed Mushrooms ($1)");
	 
	 public JPizza()
	 {
	     super("JPIZZA");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(new FlowLayout());
		 welcome.setLayout(new FlowLayout(FlowLayout.CENTER));
		 welcome.setFont(new Font("Arial", Font.BOLD, 16));
		 pizza.setFont(new Font("Arial", Font.BOLD, 12));
		 topping.setFont(new Font("Arial", Font.BOLD, 12));
		 priceLabel.setFont(new Font("Arial", Font.BOLD, 12));
		 
		   add(welcome);
		 //Add the JCheckBoxes into the aGroup and aGroupTopping respectively
	      aGroupSize.add(small);
	      aGroupSize.add(medium);
	      aGroupSize.add(large);
	      aGroupSize.add(extra);
	 
	      aGroupTopping.add(cheese);
	      aGroupTopping.add(redPapper);
	      aGroupTopping.add(butternut);
	      aGroupTopping.add(broccoli);
	      aGroupTopping.add(fennel);
	      aGroupTopping.add(mushrooms);
		  
	     //Add the JCheckBoxes to JFrame
		 add(pizza);
	     add(small);
	     add(medium);
	     add(large);
	     add(extra);
		 
		 add(topping);
		 add(cheese);
		 add(redPapper);
		 add(butternut);
		 add(broccoli);
		 add(fennel);
		 add(mushrooms);
		 
		 add(priceLabel);
		 add(price);
		 
		 //Register objects as event listeners
		 small.addItemListener(this);
		 medium.addItemListener(this);
		 large.addItemListener(this);
		 extra.addItemListener(this);
		 cheese.addItemListener(this);
		 redPapper.addItemListener(this);
		 butternut.addItemListener(this);
		 broccoli.addItemListener(this);
		 fennel.addItemListener(this);
		 mushrooms.addItemListener(this);
	 }
	 
	 public void itemStateChanged(ItemEvent e)
	 {
		 Object source = e.getSource();
		 int selected = e.getStateChange();
		 
		 if(source == small)
		 {
			       if(selected == ItemEvent.SELECTED)
				   {
					    basePrice += SMALL_PRICE;
		           }
				   else
					   basePrice -= SMALL_PRICE;
		 }
	     else
			 if(source == medium)
			 {
			     if(selected == ItemEvent.SELECTED)
				   {
					    basePrice += MEDIUM_PRICE;
		           }
				   else
					   basePrice -= MEDIUM_PRICE;
			 }
			 else
				 if(source == large)
				 {
					 if(selected == ItemEvent.SELECTED)
					 {
						 basePrice += LARGE_PRICE;
					 }
					 else
						 basePrice -= LARGE_PRICE;
				 }
				 else
					 if(source == extra)
					 {
						  if(selected == ItemEvent.SELECTED)
					       {
						      basePrice += EXTRA_LARGE;
					       }
					     else
						     basePrice -= EXTRA_LARGE;
					 }
					 
					 //Pizza topping selection
					 if(source == cheese)
					 {
						 if(selected == ItemEvent.SELECTED)
							 basePrice += 0;
						 else
							 basePrice -= 0;
					 }
					 else
						 if(source == redPapper)
						 {
							 if(selected == ItemEvent.SELECTED)
							       basePrice += 1;
						        else
							       basePrice -= 1;
						 }
						 else
							 if(source == butternut)
							 {
								  if(selected == ItemEvent.SELECTED)
							           basePrice += 1;
						          else
							         basePrice -= 1;
							 }
							 else
								 if(source == broccoli)
								 {
									  if(selected == ItemEvent.SELECTED)
							             basePrice += 1;
						              else
							             basePrice -= 1;
								 }
								 else
									 if(source == fennel)
									 {
										  if(selected == ItemEvent.SELECTED)
							                  basePrice += 1;
						                  else
							                  basePrice -= 1;
									 }
									 else
										 if(source == mushrooms)
										 {
											  if(selected == ItemEvent.SELECTED)
							                      basePrice += 1;
						                      else
							                     basePrice -= 1;
										 }
						 
			 
			 price.setText("$" + basePrice);
	 }
	 
	 public static void main(String[] args)
	 {
		 JPizza aFrame = new JPizza();
		 aFrame.setBounds(300,300,400,450);
		 aFrame.setVisible(true);
	 }
	 
}