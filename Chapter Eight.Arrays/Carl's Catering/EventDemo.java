/*To keep the EventDemo class simple, remove all the statements that compare
  event sizes and that display the invitation Strings*/

/* Modify the EventDemo class so that instead of creating three single Event
   objects, it uses an array of three Event objects. Get data for each of the objects,
   and then display all the details for each object*/

import java.util.Scanner;
public class EventDemo
{  public static void main(String[] args)
     {  Event[] object1 = new Event[3];
        
         for(int i = 0; i < object1.length; i++){
             object1[i] = new Event();
             object1[i] = getData(object1[i]);
          }
           
         CarlysEventPriceWithMethods.displayMotto();

           for(int i = 0; i < object1.length; i++){
                 computePrice(object1[i]);
             }

       }
public static Event getData(Event details)
     { String eventNumber;
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

public static void computePrice(Event g)
     {  System.out.println("Event number >> " + g.getEventNumber() + "\nEvent Type >> " + g.getEventsNames() + "\nPhone Number >> " + g.getPhoneNumber() + "\nNumber of guests >> " +
                            g.getGuest() + "\nPrice per guest >> " + g.getPricePerGuest() +
                            "\nTotal price >> " + g.getPrice() + "\nEvent is large >> " + g.isLargeEvent() + "\n " + "\n........................................................................");
             }

}



