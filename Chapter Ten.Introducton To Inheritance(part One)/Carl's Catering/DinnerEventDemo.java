/* 1. a. In Chapter 8, you created an Event class for Carly’s Catering. Now extend the
         class to create a DinnerEvent class. In the extended class, include four new
         integer fields that represent numeric choices for an entrée, two side dishes, and
         a dessert for each DinnerEvent object. Also include three final arrays that
         contain String menu options for entrées, side dishes, and desserts, and store
         at least three choices in each array. Create a DinnerEvent constructor that
         requires arguments for an event number and number of guests, and integer
         menu choices for one entrée, two side dishes, and one dessert. Pass the first
         two parameters to the Event constructor, and assign the last four parameters
         to the appropriate local fields. Also include a getMenu() method that builds
         and returns a String including the Strings for the four menu choices. Save
         the file as DinnerEvent.java.
      b. In Chapter 9, you created an EventDemo program for Carly’s Catering. The
         program uses an array of Event objects and allows the user to sort Events in
         ascending order by event number, number of guests, or event type. Now
         modify the program to use an array of four DinnerEvent objects. Prompt the
         user for all values for each object, and then allow the user to continuously sort
         the DinnerEvent descriptions by event number, number of guests, or event type.
         Save the file as DinnerEventDemo.java*/

import java.util.Scanner;
public class DinnerEventDemo
{  
   public static void main(String[] args)
     {  
        DinnerEvent[] object1 = new DinnerEvent[8];

        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        
        String eventNum, phoneNumber;
        int eventType, numGuest, entrees, sideDishOne, sideDishTwo, dessert;

         for(int i = 0; i < object1.length; ++i)
            {
                System.out.print("Enter event number >>> ");
                eventNum = inputString.nextLine();

                System.out.print("Enter phone number >>> ");
                phoneNumber = inputString.nextLine();

                System.out.print("Enter number of Guests >>> ");
                numGuest = input.nextInt();

                System.out.print("\nEnter event type; \n0.Wedding \n1.Baptism \n2.Birthday \n3.Cooperate \n4.Others" +
                    "\nEnter chooise >>> ");
                eventType = input.nextInt();

                System.out.print("\nChoose the entre`e; \n1.Butter Chicken \n2.Grilled Chicken" +
                   "\n3.Palak Paneer \n4.Rogan Josh \nEnter your choice >>> ");
                entrees = input.nextInt();

                System.out.print("\nChoose the side dish; \n1.Cabbage \n2.Baked Beans" +
                   "\n3.Brocoli \n4.Baked Potatoes \nEnter your choice >>> ");
                sideDishOne = input.nextInt();

                System.out.print("\nChoose another side dish; \n1.Cabbage \n2.Baked Beans" +
                   "\n3.Brocoli \n4.Baked Potatoes \nEnter your choice >>> ");
                sideDishTwo = input.nextInt();

                System.out.print("\nChoose the dessert; \n1.Cookies \n2.Biscuit" +
                   "\n3.Pastries \n4.Puddings \nEnter your choice >>> ");
                dessert = input.nextInt();

                object1[i] = new DinnerEvent(eventNum, numGuest, entrees, sideDishOne, sideDishTwo, dessert);
                object1[i].setEventType(eventType);
                object1[i].setEventNumber(eventNum);
                object1[i].setPhoneNumber(phoneNumber);
                object1[i].setGuest(numGuest);

                System.out.println("\n\n\n");
            }

        sortObj(object1);
     }

public static void sortObj(DinnerEvent[] object1)
  {
          Scanner input = new Scanner(System.in);
          int choice;

      do{
          System.out.println("\nChoose an option how to sort events in ascending order");
          System.out.print("1.Event Number \n2.Number of Guests \n3.Event Type \n4.Exit \nEnter your choice: ");
          choice = input.nextInt();
          System.out.println();

             if(choice == 1)
                 {
                    for(int i = 0; i < object1.length; ++i)
                       {
                          for(int j = 0; j < object1.length - 1; ++j)
                              {
                                    
                                  if(object1[j].getEventNumber().compareTo(object1[j + 1].getEventNumber()) > 0)
                                         {
                                            DinnerEvent temp = object1[j];
                                            object1[j] = object1[j + 1];
                                            object1[j + 1] = temp;
                                         }
                              }
                       }
                         
                          for(int k = 0; k < object1.length; ++k)
                             {
                                System.out.println(object1[k].getMenu());
                             }
                 }

            if(choice == 2)
                {
                    for(int i = 0; i < object1.length; ++i)
                       {
                          for(int j = 0; j < object1.length - 1; ++j)
                              {
                                  if(object1[j].getGuest() > object1[j + 1].getGuest())
                                         {
                                            DinnerEvent temp = object1[j];
                                            object1[j] = object1[j + 1];
                                            object1[j + 1] = temp;
                                         }
                              }
                       }

                         for(int k = 0; k < object1.length; ++k)
                             {
                                System.out.println(object1[k].getMenu());
                             }
                }

           if(choice == 3)
               {
                    for(int i = 0; i < object1.length; ++i)
                       {
                          for(int j = 0; j < object1.length - 1; ++j)
                              {
                                  if(object1[j].getEventsNames().compareTo(object1[j + 1].getEventsNames()) > 0)
                                         {
                                            DinnerEvent temp = object1[j];
                                            object1[j] = object1[j + 1];
                                            object1[j + 1] = temp;
                                         }
                              }
                       }

                         for(int k = 0; k < object1.length; ++k)
                             {
                                System.out.println(object1[k].getMenu());
                             }
               }
       }while(choice != 4);
   }
}

























