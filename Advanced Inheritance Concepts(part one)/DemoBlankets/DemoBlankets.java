/* 6. a. Create a class named Blanket with fields for a blanket’s size, color, material, and
         price. Include a constructor that sets default values for the fields as Twin, white,
         cotton, and $30.00. Include a set method for each of the first three fields. The
         method that sets size adds $10 to the base price for a double blanket, $25 for a
         queen blanket, and $40 for a king. The method that sets the material adds $20 to
         the price for wool and $45 to the price for cashmere. In other words, the price for
         a king-sized cashmere blanket is $115. Whenever the size or material is invalid,
         reset the blanket to the default values. Include a toString() method that returns a
         description of the blanket. Save the file as Blanket.java.
      b. Create a child class named ElectricBlanket that extends Blanket and includes
         two additional fields: one for the number of heat settings and one for whether the
         electric blanket has an automatic shutoff feature. Default values are one heat
         setting and no automatic shutoff. Include get and set methods for the fields. Do
         not allow the number of settings to be fewer than one or more than five; if it is, use
         the default setting of 1. Add a $5.75 premium to the price if the blanket has the
         automatic shutoff feature. Also include a toString() method that calls the
         parent class toString() method and combines the returned value with data
         about the new fields to return a complete description of features. Save the file
         as ElectricBlanket.java.
      c. Create an application that declares a blanket of each type and demonstrates how
         the methods work. Save the file as DemoBlankets.java*/


import javax.swing.*;

public class DemoBlankets
{
    public static void main(String[] args)
       {
          Blanket obj1 = new Blanket();
          ElectricBlanket obj2 = new ElectricBlanket();

          int input;
          String entry;

          //obj1 data
          entry = JOptionPane.showInputDialog(null, "Choose blanket size;" +
                         "\n1.Double blanket \n2.Queen size \n3.King size");
          input = Integer.parseInt(entry);
          obj1.setBlanketSize(input);
          
          entry = JOptionPane.showInputDialog(null, "Enter blanket color");
          obj1.setBlanketColor(entry);

          entry = JOptionPane.showInputDialog(null, "Choose blanket material;" +
                          "\n1.Wool \n2.Cashmere");
          input = Integer.parseInt(entry);
          obj1.setBlanketMaterial(input);

         System.out.println();//Spacing to enable good reading
          //obj2 data
          entry = JOptionPane.showInputDialog(null, "Choose blanket size;" +
                         "\n1.Double blanket \n2.Queen size \n3.King size");
          input = Integer.parseInt(entry);
          obj2.setBlanketSize(input);
          
          entry = JOptionPane.showInputDialog(null, "Enter blanket color");
          obj2.setBlanketColor(entry);

          entry = JOptionPane.showInputDialog(null, "Choose blanket material;" +
                          "\n1.Wool \n2.Cashmere");
          input = Integer.parseInt(entry);
          obj2.setBlanketMaterial(input);

          entry = JOptionPane.showInputDialog(null, "Enter heat setting(1 - 6)");
          input = Integer.parseInt(entry);
          obj2.setHeatSetting(input);
         
          entry = JOptionPane.showInputDialog(null, "Does blanket have auto shutoff?" +
                       "\n1.YES \n2.NO");
          input = Integer.parseInt(entry);
          obj2.setAutoShutOff(input);


          //Display all data off the two objects
            System.out.println(obj1.toString());
            System.out.println(obj2.toString());
       }
}














