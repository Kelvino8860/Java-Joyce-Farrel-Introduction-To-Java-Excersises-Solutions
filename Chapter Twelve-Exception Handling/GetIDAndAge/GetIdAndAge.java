/* 10. Create a DataEntryException class whose getMessage() method returns
       information about invalid integer data. Write a program named GetIDAndAge
       that continually prompts the user for an ID number and an age until a terminal
       0 is entered for both. Throw a DataEntryException if the ID is not in the range
       of valid ID numbers (0 through 999), or if the age is not in the range of valid
       ages (0 through 119). Catch any DataEntryException or InputMismatchException
       that is thrown, and display an appropriate message. Save the files as
       DataEntryException.java and GetIDAndAge.java.*/

import java.util.*;

public class GetIdAndAge
{
    public static void main(String[] args)
       {
          Scanner input = new Scanner(System.in);
          int idNum = 0, age = 0;
          boolean terminate = false;

           do{
               try
                 {
                    System.out.print("Enter ID number >> ");
                     idNum = input.nextInt();
                      if(idNum < 0 || idNum > 999)
                        throw(new DataEntryException());
                     System.out.print("Enter Age >> ");
                      age = input.nextInt();
                        if(age < 0 || age > 119)
                          throw(new DataEntryException());
                 }
                catch(DataEntryException e)
                  {
                     System.out.println(e.getMessage());
                  }
                catch(InputMismatchException e)
                  {
                     System.out.println(e.getMessage());
                  }
               
               input.nextLine();
               
                if(idNum == 0 && age == 0)
                    terminate = true;

             }while(!terminate);
       }
}