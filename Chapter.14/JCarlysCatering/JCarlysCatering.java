
/* 1. In previous chapters, you have created a number of programs for Carly’s Catering.
      Now, create an interactive GUI program that allows the user to enter the number
      of guests for an event into a text field; if the value entered is not numeric, set
      the event price to 0. Also allow the user to choose one entree from a group of at
      least four choices, up to two side dishes from a group of at least four choices, and
      one dessert from a group of at least three choices. Display the cost of the event as
      $35 per person; as the user continues to make selection changes, display
      a list of the current items chosen. If a user attempts to choose more than two
      side dishes, remove all the current side dish selections so that the user can start
      over. Save the program as JCarlysCatering.java*/

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.*;

public class JCarlysCatering extends JFrame implements ItemListener, ActionListener
{
  ArrayList<String> array = new ArrayList<>();

  JLabel welcome = new JLabel("WELCOME TO CARLY'S CATERING"); 
  JLabel guests = new JLabel("Enter number of guests: ");
  JTextField numGuests = new JTextField(4);

  //Button group for entree with its checkboxes
  JLabel entree = new JLabel("Choose an entre'e:");
  ButtonGroup entreeGroup = new ButtonGroup();
  JCheckBox butterChicken = new JCheckBox("Butter Chicken");
  JCheckBox grilledChicken = new JCheckBox("Grilled Chicken");
  JCheckBox palakPaneer = new JCheckBox("Palak Paneer");
  JCheckBox roganJosh = new JCheckBox("Rogan Josh");

  //Checkboxes for side dishes
  JLabel dishes = new JLabel("Choose one or two side dishes: ");
  JCheckBox cabbage = new JCheckBox("Cabbage");
  JCheckBox bakedBeans = new JCheckBox("Baked Beans");
  JCheckBox brocoli = new JCheckBox("Brocoli");
  JCheckBox bakedPotatoes = new JCheckBox("Baked Potatoes");
  String[] dishesArray = {"Cabbage","Baked Beans","Brocoli","Baked Potatoes"};
  JCheckBox[] uncheckArray = {cabbage,bakedBeans,brocoli,bakedPotatoes};

  //ButtonGroup to choose dessert with its checkbox
  JLabel dessert = new JLabel("Choose a dessert: ");
  ButtonGroup desertGroup = new ButtonGroup();
  JCheckBox cookies = new JCheckBox("Cookies");
  JCheckBox biscuits = new JCheckBox("Biscuits");
  JCheckBox puddings = new JCheckBox("Puddings");

  //Display cost of event as $35 per person
  JLabel price = new JLabel("Base price is $35 per guest");
  JTextArea listItems = new JTextArea();

  JCheckBox compArray[] = {butterChicken,grilledChicken,palakPaneer,roganJosh,cabbage,bakedBeans,brocoli,
                        bakedPotatoes,cookies,biscuits,puddings};

  public JCarlysCatering()
  {
      super("JCarlysCatering");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      welcome.setFont(new Font("Arial", Font.BOLD, 16));
      guests.setFont(new Font("Arial", Font.BOLD,14));
      price.setFont(new Font("Arial",Font.BOLD,14));
      entree.setFont(new Font("Arial",Font.BOLD,14));
      dishes.setFont(new Font("Arial",Font.BOLD,14));
      dessert.setFont(new Font("Arial",Font.BOLD,14));
      setLayout(new FlowLayout());

      add(welcome);
      add(guests);
      add(numGuests);

      //Entree boxes
      entreeGroup.add(butterChicken);
      entreeGroup.add(grilledChicken);
      entreeGroup.add(palakPaneer);
      entreeGroup.add(roganJosh);
      add(entree);
      add(butterChicken);
      add(grilledChicken);
      add(palakPaneer);
      add(roganJosh);

      //Side Dish boxes
      add(dishes);
      add(cabbage);
      add(bakedBeans);
      add(brocoli);
      add(bakedPotatoes);

      //Desert group
      desertGroup.add(cookies);
      desertGroup.add(biscuits);
      desertGroup.add(puddings);
      add(dessert);
      add(cookies);
      add(biscuits);
      add(puddings);

      add(price);
      add(listItems);

      numGuests.addActionListener(this);
      
      for(int i = 0; i < compArray.length; ++i)
      {
          compArray[i].addItemListener(this);
      }
      
  }

  @Override
  public void itemStateChanged(ItemEvent e)
  {
      Object source = e.getItem();
      int selected = e.getStateChange();
      int count = 0;
    for(int j = 0; j < compArray.length; ++j)
    {
      if(source == compArray[j])
      {
        if(selected == ItemEvent.SELECTED)
          {
              array.add(compArray[j].getText());
              listItems.setText("");
              for(int i = 0; i < array.size(); ++i)
                 {
                     listItems.append(array.get(i) + "\n");
                 }

                 break;
            }
          else
          {
             array.remove(compArray[j].getText());
             listItems.setText("");
             for(int i = 0; i < array.size(); ++i)
                 {
                     listItems.append(array.get(i) + "\n");
                 }
          }
      }
    }

         for(int i = 0; i < dishesArray.length; ++i) 
         {
          if(array.contains(dishesArray[i]))
             ++count;
         }
         if(count > 2)
         {
          for(int k = 0; k < dishesArray.length; ++k)
           {
              if(uncheckArray[k].isSelected())
                  uncheckArray[k].setSelected(false);   

             if(array.contains(dishesArray[k]))
               array.remove(dishesArray[k]);
           }
         }
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
     Object source = e.getSource();

         if(source instanceof JTextField)
           {
              String number = numGuests.getText();
              for(int i = 0; i < number.length(); ++i)
                {
                   if(!Character.isDigit(number.charAt(i)))
                      {
                         numGuests.setText("0");
                      }
                } 
          }
  }

  public static void main(String[] args)
  {
     JCarlysCatering aFrame = new JCarlysCatering();
     aFrame.setVisible(true);
     aFrame.setBounds(300,300,300,400);
  }
}
