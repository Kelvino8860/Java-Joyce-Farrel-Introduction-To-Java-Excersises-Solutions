/*1. Write an application named BadSubscriptCaught in which you declare an array of
     10 first names. Write a try block in which you prompt the user for an integer and
     display the name in the requested position. Create a catch block that catches the
     potential ArrayIndexOutOfBoundsException thrown when the user enters a number
     that is out of range. The catch block should also display an error message. Save the
     file as BadSubscriptCaught.java*/

import java.util.Scanner;
public class  BadSubscriptCaught
{
   public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         int subscript;
         String[] names = {"Kelvin", "Peter", "John", "James", "Tracy", "Claire", "Mary",
                           "Paul", "Nelly", "Purity"};

         try
          {
            System.out.print("Enter an integer to display names(1-10) >> ");
            subscript = input.nextInt();
            System.out.println("\nName: " + names[subscript - 1]);
          }  
         catch(ArrayIndexOutOfBoundsException e)
          {
             System.out.println("\nInvalid entry!!!" + "\n" + e.getMessage());
          }
     }
}