/*  1. a. In previous chapters, you have created several classes for Carly’s Catering. Now,
          create a new abstract class named Employee. The class contains data fields for an
          employee’s ID number, last name, first name, pay rate, and job title. The class
          contains get and set methods for each field; the set methods for pay rate and job
          title are abstract. Save the file as Employee.java.
       b. Create three classes that extend Employee named Waitstaff, Bartender, and
          Coordinator. The method that sets the pay rate in each class accepts a parameter and           assigns it to the pay rate, but no Waitstaff employee can have a rate
          higher than 10.00, no Bartender can have a rate higher than 14.00, and no
          Coordinator can have a rate higher than 20.00. The method that sets the job title
          accepts no parameters—it simply assigns the string “waitstaff”, “bartender”, or
          “coordinator” to the object appropriately. Save the files as Waitstaff.java,
          Bartender.java, and Coordinator.java.
       c. In Chapter 10, you created a DinnerEvent class that holds event information,
          including menu choices. Modify the class to include an array of 15 Employee
          objects representing employees who might be assigned to work at a DinnerEvent.
          Include a method that accepts an Employee array parameter and assigns it to
          the Employee array field, and include a method that returns the Employee array.
          The filename is DinnerEvent.java.
       d. Write an application that declares a DinnerEvent object, prompts the user for an
          event number, number of guests, menu options, and contact phone number, and
          then assigns them to the object. Also prompt the user to enter data for as many
          Employees as needed based on the number of guests. A DinnerEvent needs one
          Waitstaff Employee for every event, two if an event has 10 guests or more, three
          if an event has 20 guests or more, and so on. A DinnerEvent also needs one
          Bartender for every 25 guests and one Coordinator no matter how many
          guests attend. All of these Employees should be stored in the Employee array
          in the DinnerEvent object. (For many events, you will have empty Employee
          array positions.) After all the data values are entered, pass the DinnerEvent
          object to a method that displays all of the details for the event, including all
          the details about the Employees assigned to work. Save the program as
          StaffDinnerEvent.java.*/

import java.util.Scanner;
public class StaffDinnerEvent
{  
   public static void main(String[] args)
     {  
        
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        
        String eventNum, phoneNumber, lastName, firstName;
        int eventType, numGuest, entrees, sideDishOne, sideDishTwo, dessert;
        long idNum;
        double payRate;
         
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

                DinnerEvent obj = new DinnerEvent(eventNum, numGuest, entrees, sideDishOne, sideDishTwo, dessert);
                obj.setEventNumber(eventNum);
                obj.setPhoneNumber(phoneNumber);
                obj.setGuest(numGuest);
                obj.setEventType(eventType);
                


      //Employees waitStaff data
        if(numGuest < 10)
          {
             Employee aStaff = new Waitstaff();
             System.out.print("Enter employee's ID number(waitstaff) >>> ");
             idNum = input.nextLong();
             System.out.print("Enter employee's last name >>> ");
             lastName = inputString.nextLine();
             System.out.print("Enter employee's first name >>> ");
             firstName = inputString.nextLine();
             System.out.print("Enter employee's pay rate(<=10) >>> ");
             payRate = input.nextDouble();

             aStaff.setEmployeesId(idNum);
             aStaff.setLastName(lastName);
             aStaff.setFirstName(firstName);
             aStaff.setPayRate(payRate);

             obj.employee(aStaff);
          }
       else if(numGuest >= 10 && numGuest < 20)
          {
             for(int i = 0; i < 2; ++i)
               {
                     Employee aStaff = new Waitstaff();
                     System.out.print("\nEnter employee's ID number(waitstaff) >>> ");
                     idNum = input.nextLong();
                     System.out.print("Enter employee's last name >>> ");
                     lastName = inputString.nextLine();
                     System.out.print("Enter employee's first name >>> ");
                     firstName = inputString.nextLine();
                     System.out.print("Enter employee's pay rate(<=10) >>> ");
                     payRate = input.nextDouble();

                      aStaff.setEmployeesId(idNum);
                      aStaff.setLastName(lastName);
                      aStaff.setFirstName(firstName);
                      aStaff.setPayRate(payRate);

                      obj.employee(aStaff); 
               }
          }
        else if(numGuest >= 20)
           {
               for(int i = 0; i < 3; ++i)
                 {
                     Employee aStaff = new Waitstaff();
                     System.out.print("\nEnter employee's ID number(waitstaff) >>> ");
                     idNum = input.nextLong();
                     System.out.print("Enter employee's last name >>> ");
                     lastName = inputString.nextLine();
                     System.out.print("Enter employee's first name >>> ");
                     firstName = inputString.nextLine();
                     System.out.print("Enter employee's pay rate(<=10) >>> ");
                     payRate = input.nextDouble();

                      aStaff.setEmployeesId(idNum);
                      aStaff.setLastName(lastName);
                      aStaff.setFirstName(firstName);
                      aStaff.setPayRate(payRate);

                      obj.employee(aStaff); 
                  }   
           }

      //Employee Bartender data
         int bartenders = numGuest / 25;
          if(bartenders > 0)
             {
                for(int i = 0; i < bartenders; ++i)
                  {
                         Employee aStaff = new Bartender();
                         System.out.print("\nEnter employee's ID number(bartender) >>> ");
                         idNum = input.nextLong();
                         System.out.print("Enter employee's last name >>> ");
                         lastName = inputString.nextLine();
                         System.out.print("Enter employee's first name >>> ");
                         firstName = inputString.nextLine();
                         System.out.print("Enter employee's pay rate(<=14) >>> ");
                         payRate = input.nextDouble();

                         aStaff.setEmployeesId(idNum);
                         aStaff.setLastName(lastName);
                         aStaff.setFirstName(firstName);
                         aStaff.setPayRate(payRate);

                         obj.employee(aStaff);
                  }
             }

       //Employee Coordinator data
                         Employee aStaff = new Coordinator();
                         System.out.print("\nEnter employee's ID number(coordinator) >>> ");
                         idNum = input.nextLong();
                         System.out.print("Enter employee's last name >>> ");
                         lastName = inputString.nextLine();
                         System.out.print("Enter employee's first name >>> ");
                         firstName = inputString.nextLine();
                         System.out.print("Enter employee's pay rate(<=20) >>> ");
                         payRate = input.nextDouble();

                         aStaff.setEmployeesId(idNum);
                         aStaff.setLastName(lastName);
                         aStaff.setFirstName(firstName);
                         aStaff.setPayRate(payRate);

                         obj.employee(aStaff);

       display(obj);
     }

  public static void display(DinnerEvent obj)
      {
         System.out.println("\n\nDISPLAY ALL DINNER EVENT DATA");
         System.out.println("****************************************");
         System.out.println("****************************************");
         CarlysEventPriceWithMethods.displayMotto();
         System.out.println(obj.getMenu());
         obj.displayEmployee();
      }
}

























