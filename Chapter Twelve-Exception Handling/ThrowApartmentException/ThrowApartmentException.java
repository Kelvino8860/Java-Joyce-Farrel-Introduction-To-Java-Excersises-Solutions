/* 6. Create an ApartmentException class whose constructor receives a String that holds
      a street address, an apartment number, a number of bedrooms, and a rent value for
      an apartment. Save the file as ApartmentException.java. Create an Apartment class
      with those fields. The Apartment constructor requires values for each field. Upon
      construction, throw an ApartmentException if the apartment number does not
      consist of three digits, if the number of bedrooms is less than 1 or more than 4, or if
      the rent is less than $500 or over $2,500. Save the class as Apartment.java. Write an
      application that establishes an array of at least six Apartment objects with valid and
      invalid values. Display an appropriate message when an Apartment object is created
      successfully and when one is not. Save the file as ThrowApartmentException.java*/

import javax.swing.*;

public class ThrowApartmentException
{
   public static void main(String[] args)
     {
         Apartment[] arrayObj = new Apartment[6];
         
         String address,apartNum,input;
         int numBed;
         double rent;
         int i;

         for(i = 0; i < arrayObj.length; ++i)
           {
              address = JOptionPane.showInputDialog(null, "Enter Stree Address");
              apartNum = JOptionPane.showInputDialog(null, "Enter Apartment Number");
              input = JOptionPane.showInputDialog(null, "Enter Number of Bedrooms");
              numBed = Integer.parseInt(input);
              input = JOptionPane.showInputDialog(null, "Enter Rent Amount");
              rent = Double.parseDouble(input);

              try
               {
                   arrayObj[i] = new Apartment(address,apartNum,numBed,rent);
                   JOptionPane.showMessageDialog(null, "Apartment Object Created Succesfully");
               }
              catch(ApartmentException apartEx)
                {
                    JOptionPane.showMessageDialog(null, apartEx.getMessage());
                }
           }
     }
}

