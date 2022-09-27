/* 1. In the last chapter, you modified the EventDemo program for Carly’s Catering to
      accept and display data for an array of three Event objects. Now, modify the
      program to use an array of eight Event objects. Prompt the user to choose an
      option to sort Events in ascending order by event number, number of guests, or
      event type. Display the sorted list, and continue to prompt the user for sorting
      options until the user enters a sentinel value. Save the file as EventDemo.java.*/

import java.util.Scanner;
public class EventDemo
{  
   public static void main(String[] args)
     {  Event[] object1 = new Event[8];
        
         for(int i = 0; i < object1.length; i++){
             object1[i] = new Event();
             object1[i] = getData(object1[i]);
             System.out.println();
          }
           
         CarlysEventPriceWithMethods.displayMotto();
         sortObj(object1);

       }
public static Event getData(Event details)
     {
       String eventNumber;
       String phoneNumber;
       int guest;
       int eventType;

       Scanner inputDevice = new Scanner(System.in);
       Scanner inputNum = new Scanner(System.in);

       System.out.print("Enter eventNumber(Should have have four characters;Start with a letter followed by three digits) >> ");
       eventNumber = inputDevice.nextLine();

       System.out.print("Enter event type(0-wedding, 1-baptism, 2-birthday, 3-corporate, 4-other) >> ");
       eventType = inputNum.nextInt();

       System.out.print("Enter phoneNumber >> ");
       phoneNumber = inputDevice.nextLine();

          do{ System.out.print("Enter number of guests >> ");
               guest = inputNum.nextInt();
             }while(guest < 5 || guest > 100);

       details.setGuest(guest);
       details.setEventNumber(eventNumber);
       details.setEventType(eventType);
       details.setPhoneNumber(phoneNumber);

          return details;
    }

public static void sortObj(Event[] object1)
  {
          Scanner input = new Scanner(System.in);
          int choice;

      do{
          System.out.println("Choose an option how to sort events in ascending order");
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
                                            Event temp = object1[j];
                                            object1[j] = object1[j + 1];
                                            object1[j + 1] = temp;
                                         }
                              }
                       }

                      for(int i = 0; i < object1.length; i++)
                          computePrice(object1[i]);
                }

            if(choice == 2)
                {
                    for(int i = 0; i < object1.length; ++i)
                       {
                          for(int j = 0; j < object1.length - 1; ++j)
                              {
                                  if(object1[j].getGuest() > object1[j + 1].getGuest())
                                         {
                                            Event temp = object1[j];
                                            object1[j] = object1[j + 1];
                                            object1[j + 1] = temp;
                                         }
                              }
                       }

                      for(int i = 0; i < object1.length; i++)
                          computePrice(object1[i]);
                }

           if(choice == 3)
               {
                    for(int i = 0; i < object1.length; ++i)
                       {
                          for(int j = 0; j < object1.length - 1; ++j)
                              {
                                  if(object1[j].getEventsNames().compareTo(object1[j + 1].getEventsNames()) > 0)
                                         {
                                            Event temp = object1[j];
                                            object1[j] = object1[j + 1];
                                            object1[j + 1] = temp;
                                         }
                              }
                       }

                      for(int i = 0; i < object1.length; i++)
                          computePrice(object1[i]);
               }
       }while(choice != 4);
   } 

public static void computePrice(Event g)
     { 
           System.out.println("Event number >> " + g.getEventNumber() + "\nEvent Type >> " + g.getEventsNames() + "\nPhone Number >> " + g.getPhoneNumber() + "\nNumber of guests >> " +
                            g.getGuest() + "\nPrice per guest >> " + g.getPricePerGuest() +
                            "\nTotal price >> " + g.getPrice() + "\nEvent is large >> " + g.isLargeEvent() + "\n " +                                                                                    "\n........................................................................");
     }
}























