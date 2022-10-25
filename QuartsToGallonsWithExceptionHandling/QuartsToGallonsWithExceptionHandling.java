/* 3. In Chapter 2, you created an application named QuartsToGallonsInteractive
      that accepts a number of quarts from a user and converts the value to gallons.
      Now, add exception-handling capabilities to this program and continuously
      reprompt the user while any nonnumeric value is entered. Save the file as
      QuartsToGallonsWithExceptionHandling.java*/

import java.util.*;
public class QuartsToGallonsWithExceptionHandling
{ 
    public static void main(String[]  args)
     {
        int noOfQuartsNeeded = 0;
        int NO_OF_QUARTS_IN_GALLON = 0;
        int noOfGallonsNeeded;
        int noOfRemainingQuarts;
        
        boolean trueValue = false;

        Scanner input = new Scanner(System.in);

       do{
            trueValue = false;
            try
             {
                System.out.print("How many quarts are needed for this painting job? >> ");
                noOfQuartsNeeded = input.nextInt();
              }
            catch(InputMismatchException e)
              {
                  trueValue = true;
              }
            
             input.nextLine();
          }while(trueValue == true);
 

        do{
            trueValue = false;
            try
             {
                System.out.print("How many quarts are in one gallon? >> ");
                NO_OF_QUARTS_IN_GALLON = input.nextInt();              
              }
            catch(InputMismatchException e)
              {
                  trueValue = true;
              }
 
              input.nextLine();
          }while(trueValue == true);

        noOfGallonsNeeded = noOfQuartsNeeded/NO_OF_QUARTS_IN_GALLON;
        noOfRemainingQuarts = noOfQuartsNeeded%NO_OF_QUARTS_IN_GALLON;

        System.out.println("A job that requires " + noOfQuartsNeeded + " quarts will require " +
                      noOfGallonsNeeded + " gallons of paint plus " + noOfRemainingQuarts +
                      " quarts to finish the job ");
  
  }
}
  
  