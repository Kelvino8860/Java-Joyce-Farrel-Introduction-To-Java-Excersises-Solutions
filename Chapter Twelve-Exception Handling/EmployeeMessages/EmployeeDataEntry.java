/* 11. Create an application that accepts employee data interactively. Users might make any
       of the following errors as they enter data:

           The employee number is not numeric, less than 1000, or more than 9999.

           The hourly pay rate is not numeric, less than $9.00, or more than $25.00.

       Create a class that stores an array of six usable error messages that describe
       the preceding mistakes; save the file as EmployeeMessages.java. Create an
       EmployeeException class; each object of this class will store one of the messages.
       Save the file as EmployeeException.java. Create an application that prompts the
       user for employee data, and display the appropriate message when an error occurs.
       If no error occurs, display the message “Valid employee data”. Save the program
       as EmployeeDataEntry.java.*/

import java.util.*;

public class EmployeeDataEntry implements EmployeeMessages
{
   public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);
     
         int employeeNum, count = 0;
         double payRate;

         try
          {
             System.out.print("Enter Employee's Number >> ");
             employeeNum = input.nextInt();
               if(employeeNum < 1000)
                  throw(new EmployeeException(1));
               else if(employeeNum > 9999)
                   throw(new EmployeeException(2));
           }
         catch(InputMismatchException e)
           {
              System.out.println(messages[0]);
              count++;
           }
         catch(EmployeeException e)
           {
              System.out.println(e.getMessage());
              count++;
           }
   
             input.nextLine();
         try
          {
             System.out.print("Enter Employee's Hourly Pay Rate >> ");
             payRate = input.nextDouble();
                if(payRate < 9.00)
                  throw(new EmployeeException(4));
                else if(payRate > 25.00)
                   throw(new EmployeeException(5));        
          }
        catch(InputMismatchException e)
           {
              System.out.println(messages[3]);
              count++;
           }
         catch(EmployeeException e)
           {
              System.out.println(e.getMessage());
              count++;
           }

        if(count == 0)
          {
             System.out.println("Valid Employee Data");
          }
      }
}












