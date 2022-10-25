/*2. The Double.parseDouble() method requires a String argument, but it fails if the
     String cannot be converted to a floating-point number. Write an application in which
     you try accepting a double input from a user and catch a NumberFormatException if
     one is thrown. The catch block forces the number to 0 and displays an appropriate
     error message. Following the catch block, display the number. Save the file as
     TryToParseDouble.java.*/

import javax.swing.*;

public class TryToParseDouble
{
   public static void main(String[] args)
     {
        String entry;
        double figure;

        try
         {
            entry = JOptionPane.showInputDialog(null,
              "Enter a double input");
            figure = Double.parseDouble(entry);
            JOptionPane.showMessageDialog(null, "The double number is" + figure);
         }
        catch(NumberFormatException e)
         {
            figure = 0;
            JOptionPane.showMessageDialog(null, e.getMessage());
         }

        JOptionPane.showMessageDialog(null, "The double number is " + figure);
     }
}