/* 5. Create an abstract class named Element that holds properties of elements, including
      their symbol, atomic number, and atomic weight. Include a constructor that requires
      values for all three properties and a get method for each value. (For example, the
      symbol for carbon is C, its atomic number is 6, and its atomic weight is 12.01. You
      can find these values by reading a periodic table in a chemistry reference or by
      searching the Web.) Also include an abstract method named describeElement().
      Create two extended classes named MetalElement and NonMetalElement. Each
      contains a describeElement() method that displays the details of the element and
      a brief explanation of the properties of the element type. For example, metals are
      good conductors of electricity, while nonmetals are poor conductors. Write an
      application named ElementArray that creates and displays an array that holds at
      least two elements of each type. Save the files as Element.java, MetalElement.java,
      NonMetalElement.java, and ElementArray.java*/

import javax.swing.*;
import kelvino.element.Element;
import kelvino.element.MetalElement;
import kelvino.element.NonMetalElement;

public class ElementArray
{
   public static void main(String[] args)
      {
         Element[] objArray = new Element[4];
         String symbol, atomicNum, atomicWeight;
         int i, num;
         double weight;

         for(i = 0; i < objArray.length; ++i)
           {
               if(i <= 1)
                  {
                     symbol = JOptionPane.showInputDialog(null, "Enter a Metal element symbol");
                     atomicNum = JOptionPane.showInputDialog(null, "Enter atomic number of " +
                                   symbol);
                     num = Integer.parseInt(atomicNum);
                     atomicWeight = JOptionPane.showInputDialog(null, "Enter atomic weight of " +
                                   symbol);
                     weight = Double.parseDouble(atomicWeight);

                     objArray[i] = new MetalElement(symbol, num, weight);
                  }
               else if(i > 1)
                  {
                     symbol = JOptionPane.showInputDialog(null, "Enter a nonmetal element symbol");
                     atomicNum = JOptionPane.showInputDialog(null, "Enter atomic number of " +
                                   symbol);
                     num = Integer.parseInt(atomicNum);
                     atomicWeight = JOptionPane.showInputDialog(null, "Enter atomic weight of " +
                                   symbol);
                     weight = Double.parseDouble(atomicWeight);

                     objArray[i] = new NonMetalElement(symbol, num, weight);
                  }
           }

            for(i = 0; i < objArray.length; ++i)
              {
                  objArray[i].describeElement();
              }
      }
}