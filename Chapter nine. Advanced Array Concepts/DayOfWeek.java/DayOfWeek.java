/* 8. Create an application that contains an enumeration that represents the days of the
      week. Display a list of the days, then prompt the user for a day. Display business hours
      for the chosen day. Assume that the business is open from 11 to 5 on Sunday, 9 to 9
      on weekdays, and 10 to 6 on Saturday. Save the file as DayOfWeek.java*/

import java.util.Scanner;
public class DayOfWeek{

         enum Days {MONDAY, TEUSDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};

    public static void main(String[] args){
              
                for(Days day : Days.values())
                  System.out.print(day + " ");

                Scanner input = new Scanner(System.in);
                System.out.print("\n\nEnter a day >> ");
                String days = input.nextLine().toUpperCase();

                Days inputDay = Days.valueOf(days);

                switch(inputDay){
                     case MONDAY :
                        System.out.println("Business hours are from 9AM - 9PM");
                        break;

                     case TEUSDAY :
                        System.out.println("Business hours are from 9AM - 9PM");
                        break;

                     case WEDNESDAY :
                        System.out.println("Business hours are from 9AM - 9PM");
                        break;

                     case THURSDAY :
                        System.out.println("Business hours are from 9AM - 9PM");
                        break;

                     case FRIDAY :
                        System.out.println("Business hours are from 9AM - 9PM");
                        break;
 
                     case SATURDAY :
                        System.out.println("Business hours are from 10AM - 6PM");
                        break;

                     case SUNDAY :
                        System.out.println("Business hours are from 11AM - 5PM");
                        break;
                  }
           }
}