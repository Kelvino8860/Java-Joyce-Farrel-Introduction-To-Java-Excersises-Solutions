/* 7. Create a UsedCarException class that extends Exception; its constructor
      receives a value for a vehicle identification number (VIN) that is passed to the
      parent constructor so it can be used in a getMessage() call. Save the class as
      UsedCarException.java. Create a UsedCar class with fields for VIN, make, year,
      mileage, and price. The UsedCar constructor throws a UsedCarException when
      the VIN is not four digits; when the make is not Ford, Honda, Toyota, Chrysler,
      or Other; when the year is not between 1990 and 2014 inclusive; or either the
      mileage or price is negative. Save the class as UsedCar.java. Write an application
      that establishes an array of at least seven UsedCar objects and handles any
      Exceptions. Display a list of only the UsedCar objects that were constructed
      successfully. Save the file as ThrowUsedCarExceptions.java*/

import javax.swing.*;
import java.util.*;

public class ThrowUsedCarExceptions
{
   public static void main(String[] args)
      {
          ArrayList<UsedCar> objArray = new ArrayList<UsedCar>(7);

          String input,vin;
          int make, i, year;
          double mileage,price;

          for(i = 0; i < 7; ++i)
            {
               input = JOptionPane.showInputDialog(null, "Enter Vehicle Identification Number");
               vin = input;
               input = JOptionPane.showInputDialog(null, "Enter Car Make" +
                                UsedCar.MAKE_DISPLAY);
               make = Integer.parseInt(input);
               input = JOptionPane.showInputDialog(null, "Enter Year of make");
               year = Integer.parseInt(input);
               input = JOptionPane.showInputDialog(null, "Enter Car Mileage");
               mileage = Double.parseDouble(input);
               input = JOptionPane.showInputDialog(null, "Enter Car Price");
               price = Integer.parseInt(input);

             //Try and catch any UsedCarExceptions
               try
                {
                  UsedCar obj = new UsedCar(vin,make,year,mileage,price);
                  objArray.add(obj);
                }
               catch(UsedCarException e)
                {
                      JOptionPane.showMessageDialog(null, e.getMessage());
                }
          
            }

        //Display infor
         for(i = 0; i < objArray.size(); ++i)
           System.out.println("\nVIN: " + objArray.get(i).getVin() + "\nMAKE: " + objArray.get(i).getMake() + 
                 "\nYEAR: " + objArray.get(i).getYear() + "\nMILEAGE: " + objArray.get(i).getMileage() + "Km" + "\nPRICE: $" +
                   objArray.get(i).getPrice());
      }
}
























