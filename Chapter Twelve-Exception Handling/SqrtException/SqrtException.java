/* 5. Write an application that throws and catches an ArithmeticException when you
      attempt to take the square root of a negative value. Prompt the user for an input value
      and try the Math.sqrt() method on it. The application either displays the square root
      or catches the thrown Exception and displays an appropriate message. Save the file as
      SqrtException.java.*/

import java.util.*;
import javax.swing.*;

public class SqrtException
{
   public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        
        double value;
        System.out.print("Enter any value >> ");

        try
         {
            value = input.nextDouble();
            display(value);
            System.out.println("The square root of " + value + " is " + display(value));
         }
       catch(ArithmeticException e)
         {
            JOptionPane.showMessageDialog(null, "An arithmetic exception occured");
         }
     }

  public static double display(double num) throws ArithmeticException
      {
          double squareRoot;
          if(num < 0)
            throw(new ArithmeticException());
          else
          squareRoot = Math.sqrt(num);

          return (squareRoot);
      }
}