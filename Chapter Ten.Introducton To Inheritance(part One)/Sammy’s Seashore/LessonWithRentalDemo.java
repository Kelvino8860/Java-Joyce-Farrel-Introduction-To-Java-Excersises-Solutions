/* 2. a. In Chapter 8, you created a Rental class for Sammy’s Seashore Supplies.
         Now extend the class to create a LessonWithRental class. In the extended
         class, include a new Boolean field that indicates whether a lesson is required
         or optional for the type of equipment rented. Also include a final array that
         contains Strings representing the names of the instructors for each of the
         eight equipment types, and store names that you choose in the array. Create a
         LessonWithRental constructor that requires arguments for an event number,
         minutes for the rental, and an integer equipment type. Pass the first two
         parameters to the Rental constructor, and assign the last parameter to the
         equipment type. For the first two equipment types (jet ski and pontoon boat),
         set the Boolean lesson required field to true; otherwise, set it to false. Also
         include a getInstructor() method that builds and returns a String including
         the String for the equipment type, a message that indicates whether a lesson is
         required, and the instructor’s name. Save the file as LessonWithRental.java.
      b. In Chapter 9, you created a RentalDemo program for Sammy’s Seashore Supplies.
         The program uses an array of Rental objects and allows the user to sort Rentals
         in ascending order by contract number, equipment type, or price. Now modify
         the program to use an array of four LessonWithRental objects. Prompt the user
         for all values for each object, and then allow the user to continuously sort the
         LessonWithRental descriptions by contract number, equipment type, or price.
         Save the file as LessonWithRentalDemo.java*/

import java.util.Scanner;
public class LessonWithRentalDemo
{ public static void main(String[]  args)
    { LessonWithRental[] object1 = new LessonWithRental[5];
    
      Scanner inputDevice = new Scanner(System.in);
      Scanner inputNum = new Scanner(System.in);
       
      int minutes;
      String phoneNumber;
      String contNumber;
      int equipment;
      

       for(int i = 0; i < object1.length; i++)
         {
             System.out.print("Enter contract number(Should have have four characters;Start with a letter followed by three digits) >> ");
             contNumber = inputDevice.nextLine();

             System.out.print("Enter the type of equipment to rent (0-jet ski, 1-pontoon boat, 2-rowboat, 3-canoe, 4-kayak, 5-beach chair, 6-umbrella, 7-other) >> ");
             equipment = inputNum.nextInt();
               
             System.out.print("Enter Phone Number >> ");
             phoneNumber = inputDevice.nextLine();

            do{  System.out.print("Enter number of minutes >> ");
                 minutes = inputNum.nextInt();
              }while(minutes < 60 || minutes > 7200);   

             object1[i] = new LessonWithRental(contNumber, minutes, equipment);
             object1[i].setContractNumber(contNumber);
             object1[i].setPhoneNumber(phoneNumber);
             object1[i].setHoursAndMinutes(minutes);
             System.out.println();
         }

     SammysRentalPriceWithMethods.companyMotto();
     sortObj(object1);

  }

public static void sortObj(LessonWithRental[] object1)
    {
           Scanner input = new Scanner(System.in);
           int choice;

      do{
          System.out.println("Choose an option how to sort Rentals in ascending order");
          System.out.print("1.Contract Number \n2.Price \n3.Equipment Type \n4.Exit \nEnter your choice: ");
          choice = input.nextInt();
          System.out.println();

             if(choice == 1)
                 {
                    for(int i = 0; i < object1.length; ++i)
                       {
                          for(int j = 0; j < object1.length - 1; ++j)
                              {
                                    
                                  if(object1[j].getContractNumber().compareTo(object1[j + 1].getContractNumber()) > 0)
                                         {
                                            LessonWithRental temp = object1[j];
                                            object1[j] = object1[j + 1];
                                            object1[j + 1] = temp;
                                         }
                              }
                       }

                      for(int i = 0; i < object1.length; i++)
                          System.out.println(object1[i].getInstructor());
                }

            if(choice == 2)
                {
                    for(int i = 0; i < object1.length; ++i)
                       {
                          for(int j = 0; j < object1.length - 1; ++j)
                              {
                                  if(object1[j].getPrice() > object1[j + 1].getPrice())
                                         {
                                            LessonWithRental temp = object1[j];
                                            object1[j] = object1[j + 1];
                                            object1[j + 1] = temp;
                                         }
                              }
                       }

                      for(int i = 0; i < object1.length; i++)
                          System.out.println(object1[i].getInstructor());
                }

           if(choice == 3)
               {
                    for(int i = 0; i < object1.length; ++i)
                       {
                          for(int j = 0; j < object1.length - 1; ++j)
                              {
                                  if(object1[j].getEquipmentName().compareTo(object1[j + 1].getEquipmentName()) > 0)
                                         {
                                            LessonWithRental temp = object1[j];
                                            object1[j] = object1[j + 1];
                                            object1[j + 1] = temp;
                                         }
                              }
                       }

                      for(int i = 0; i < object1.length; i++)
                          System.out.println(object1[i].getInstructor());
               }
       }while(choice != 4);
    }

}




























  