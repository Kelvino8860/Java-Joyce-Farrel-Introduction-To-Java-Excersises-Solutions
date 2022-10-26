/* 4. In Chapter 8, you wrote an application named DistanceFromAverage that allows a user
      to enter up to 20 double values and then displays each entered value and its distance
      from the average. Now, modify that program to first prompt the user to enter a number
      that represents the array size. Java generates a NegativeArraySizeException if you
      attempt to create an array with a negative size, and it creates a NumberFormatException
      if you attempt to create an array using a nonnumeric value for the size. Handle these
      exceptions using a catch block that displays an appropriate message. If the array is
      created successfully, use exception-handling techniques to ensure that each entered
      array value is a double before the program calculates each element’s distance from the
      average. Save the file as DistanceFromAverageWithExceptionHandling.java.*/

import java.util.*;
public class TestDistanceFromAverage{

    public static void main(String[]  args){
            double element;
            Scanner input = new Scanner(System.in);
            int sizeArray = 2;
            DistanceFromAverage array = null;

           System.out.print("Enter size of Array >> ");
             try
              {
                 array = new DistanceFromAverage((sizeArray = input.nextInt()));
              }
            catch(NegativeArraySizeException e)
              {
                  System.out.println("\n" + e.getMessage());
                  sizeArray = 2;
                  array = new DistanceFromAverage(sizeArray);
                  input.nextLine();
              }
            catch(InputMismatchException e)
              {
                  System.out.println("\n" + e.getMessage());
                  sizeArray = 2;
                  array = new DistanceFromAverage(sizeArray);
                  input.nextLine();
              }
               
               int i = 0;
            System.out.print("Enter value: ");
            while(i < sizeArray)
               {
                   i++;

                try{
                      element = input.nextDouble();
                      if(element == 99999 && array.size > 0)
                          break;
                      array.push(element);

                   }
                catch(Exception e)
                  {
                     System.out.println("\n" + e.getMessage());
                  }

                 input.nextLine();

              }
         
         array.pop();
       }
}