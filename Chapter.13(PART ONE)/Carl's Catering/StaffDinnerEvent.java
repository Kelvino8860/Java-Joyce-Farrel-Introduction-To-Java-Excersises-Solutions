/* 1. a. In Chapter 12, you created an interactive StaffDinnerEvent class that obtains
         all the data for a dinner event for Carly’s Catering, including details about the
         event and all the staff members required to work at the event. Now, modify the
         program to prompt the user for data for three dinner events and to create a data
         file that contains each event number, event type code, number of guests, and
         price. Save the program as StaffDinnerEventAndCreateFile.java.*/

import java.util.*;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
public class StaffDinnerEvent
{  
   public static void main(String[] args)
     {  
        Path file = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\DinnerEventData.txt");

        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        boolean correct = false;
        
        String eventNum, phoneNumber, lastName, firstName;
        int eventType = 0, numGuest = 0, entrees = 0, sideDishOne = 0, sideDishTwo = 0, dessert = 0;
        long idNum = 0;
        double payRate = 0.00;
        DinnerEvent[] obj = new DinnerEvent[3];

        String delimiter = ",";
        String s = "";
        OutputStream output = null;

         for(int j = 0; j < obj.length; ++j){
         
              	System.out.print("Enter event number >>> ");
                eventNum = inputString.nextLine();

                System.out.print("Enter phone number >>> ");
                phoneNumber = inputString.nextLine();
         do{
             try
              {
                System.out.print("Enter number of Guests >>> ");
                numGuest = input.nextInt();
                correct = true;
              }
             catch(InputMismatchException e)
              {
                 System.out.println(e.getMessage());
              }
    
               input.nextLine();

           }while(correct != true);

                correct = false;

            do{
             try
              {
                System.out.print("\nEnter event type; \n0.Wedding \n1.Baptism \n2.Birthday \n3.Cooperate \n4.Others" +
                    "\nEnter chooise >>> ");
                eventType = input.nextInt();
                correct = true;
              }
             catch(InputMismatchException e)
              {
                 System.out.println(e.getMessage());
              }
    
               input.nextLine();

           }while(correct != true);

                correct = false;

            do{
             try
              {
                System.out.print("\nChoose the entre`e; \n1.Butter Chicken \n2.Grilled Chicken" +
                   "\n3.Palak Paneer \n4.Rogan Josh \nEnter your choice >>> ");
                entrees = input.nextInt();
                correct = true;
              }
             catch(InputMismatchException e)
              {
                 System.out.println(e.getMessage());
              }
    
               input.nextLine();

           }while(correct != true);

                correct = false;

                 
            do{
             try
              {
               System.out.print("\nChoose the side dish; \n1.Cabbage \n2.Baked Beans" +
                   "\n3.Brocoli \n4.Baked Potatoes \nEnter your choice >>> ");
                sideDishOne = input.nextInt();
                correct = true;
              }
             catch(InputMismatchException e)
              {
                 System.out.println(e.getMessage());
              }
    
               input.nextLine();

           }while(correct != true);

                correct = false;

           do{
             try
              {
                System.out.print("\nChoose another side dish; \n1.Cabbage \n2.Baked Beans" +
                   "\n3.Brocoli \n4.Baked Potatoes \nEnter your choice >>> ");
                sideDishTwo = input.nextInt();
                correct = true;
              }
             catch(InputMismatchException e)
              {
                 System.out.println(e.getMessage());
              }
    
               input.nextLine();

           }while(correct != true);

                correct = false;
                
            do{
             try
              {
                 System.out.print("\nChoose the dessert; \n1.Cookies \n2.Biscuit" +
                   "\n3.Pastries \n4.Puddings \nEnter your choice >>> ");
                dessert = input.nextInt();
                correct = true;
              }
             catch(InputMismatchException e)
              {
                 System.out.println(e.getMessage());
              }
    
               input.nextLine();

           }while(correct != true);

                correct = false;
           
                obj[j] = new DinnerEvent(eventNum, numGuest, entrees, sideDishOne, sideDishTwo, dessert);
                obj[j].setEventNumber(eventNum);
                obj[j].setPhoneNumber(phoneNumber);
                obj[j].setGuest(numGuest);
                obj[j].setEventType(eventType);

               s = s + eventNum + delimiter + eventType + delimiter + numGuest + delimiter + obj[j].getPrice() + System.getProperty("line.separator");

               try
                {
                    output = new BufferedOutputStream(Files.newOutputStream(file,CREATE,WRITE));
                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
                    writer.write(s, 0, s.length());
                    writer.close();
                }
              catch(Exception e)
                {
                    System.out.println("Message: " + e);
                }
                


      //Employees waitStaff data
        if(numGuest < 10)
          {
              Employee aStaff = new Waitstaff();

               do{
                     try
                      {
                         System.out.print("Enter employee's ID number(waitstaff) >>> ");
                         idNum = input.nextLong();
                         correct = true;
                      }
                    catch(InputMismatchException e)
                      {
                         System.out.println(e.getMessage());
                      }
    
                    input.nextLine();

                 }while(correct != true);

                    correct = false;
           
            
             System.out.print("Enter employee's last name >>> ");
             lastName = inputString.nextLine();
             System.out.print("Enter employee's first name >>> ");
             firstName = inputString.nextLine();

                   
                    do{
                     try
                      {
                          System.out.print("Enter employee's pay rate(<=10) >>> ");
                          payRate = input.nextDouble();
                          correct = true;
                      }
                    catch(InputMismatchException e)
                      {
                         System.out.println(e.getMessage());
                      }
    
                    input.nextLine();

                 }while(correct != true);

                    correct = false;
            

             aStaff.setEmployeesId(idNum);
             aStaff.setLastName(lastName);
             aStaff.setFirstName(firstName);
             aStaff.setPayRate(payRate);

             obj[j].employee(aStaff);
          }
       else if(numGuest >= 10 && numGuest < 20)
          {
             for(int i = 0; i < 2; ++i)
               {     
                     Employee aStaff = new Waitstaff();

                 do{
                     try
                      {
                         System.out.print("Enter employee's ID number(waitstaff) >>> ");
                         idNum = input.nextLong();
                         correct = true;
                      }
                    catch(InputMismatchException e)
                      {
                         System.out.println(e.getMessage());
                      }
    
                    input.nextLine();

                  }while(correct != true);

                    correct = false;
                        
                     System.out.print("Enter employee's last name >>> ");
                     lastName = inputString.nextLine();
                     System.out.print("Enter employee's first name >>> ");
                     firstName = inputString.nextLine();


                      
                    do{
                        try
                        {
                          System.out.print("Enter employee's pay rate(<=10) >>> ");
                          payRate = input.nextDouble();
                          correct = true;
                      }
                    catch(InputMismatchException e)
                      {
                         System.out.println(e.getMessage());
                      }
    
                    input.nextLine();

                 }while(correct != true);

                    correct = false;        
                                
                      aStaff.setEmployeesId(idNum);
                      aStaff.setLastName(lastName);
                      aStaff.setFirstName(firstName);
                      aStaff.setPayRate(payRate);

                      obj[j].employee(aStaff); 
               }
          }
        else if(numGuest >= 20)
           {
               for(int i = 0; i < 3; ++i)
                 {
                     Employee aStaff = new Waitstaff();
                     
                  do{
                     try
                      {
                         System.out.print("Enter employee's ID number(waitstaff) >>> ");
                         idNum = input.nextLong();
                         correct = true;
                      }
                    catch(InputMismatchException e)
                      {
                         System.out.println(e.getMessage());
                      }
    
                    input.nextLine();

                  }while(correct != true);

                    correct = false;
                        
                     System.out.print("Enter employee's last name >>> ");
                     lastName = inputString.nextLine();
                     System.out.print("Enter employee's first name >>> ");
                     firstName = inputString.nextLine();


                      
                    do{
                        try
                        {
                          System.out.print("Enter employee's pay rate(<=10) >>> ");
                          payRate = input.nextDouble();
                          correct = true;
                      }
                    catch(InputMismatchException e)
                      {
                         System.out.println(e.getMessage());
                      }
    
                    input.nextLine();

                 }while(correct != true);

                    correct = false;        

                      aStaff.setEmployeesId(idNum);
                      aStaff.setLastName(lastName);
                      aStaff.setFirstName(firstName);
                      aStaff.setPayRate(payRate);

                      obj[j].employee(aStaff); 
                  }   
           }

      //Employee Bartender data
         int bartenders = numGuest / 25;
          if(bartenders > 0)
             {
                for(int i = 0; i < bartenders; ++i)
                  {
                         Employee aStaff = new Bartender();

                    do{
                       try
                       {
                          System.out.print("\nEnter employee's ID number(bartender) >>> ");
                          idNum = input.nextLong();
                          correct = true;
                       }
                    catch(InputMismatchException e)
                      {
                         System.out.println(e.getMessage());
                      }
    
                    input.nextLine();

                  }while(correct != true);

                    correct = false;
                        
                         System.out.print("Enter employee's last name >>> ");
                         lastName = inputString.nextLine();
                         System.out.print("Enter employee's first name >>> ");
                         firstName = inputString.nextLine();

                     do{
                        try
                        {
                          System.out.print("Enter employee's pay rate(<=14) >>> ");
                          payRate = input.nextDouble();
                          correct = true;
                      }
                    catch(InputMismatchException e)
                      {
                         System.out.println(e.getMessage());
                      }
    
                    input.nextLine();

                 }while(correct != true);

                    correct = false;        
 
                        

                         aStaff.setEmployeesId(idNum);
                         aStaff.setLastName(lastName);
                         aStaff.setFirstName(firstName);
                         aStaff.setPayRate(payRate);

                         obj[j].employee(aStaff);
                  }
             }

       //Employee Coordinator data
                         Employee aStaff = new Coordinator();

                     do{
                         try
                         {
                            System.out.print("\nEnter employee's ID number(coordinator) >>> ");
                            idNum = input.nextLong();
                            correct = true;
                       }
                    catch(InputMismatchException e)
                      {
                         System.out.println(e.getMessage());
                      }
    
                    input.nextLine();

                  }while(correct != true);

                    correct = false;

                         
                         System.out.print("Enter employee's last name >>> ");
                         lastName = inputString.nextLine();
                         System.out.print("Enter employee's first name >>> ");
                         firstName = inputString.nextLine();


                     do{
                        try
                        {
                          System.out.print("Enter employee's pay rate(<=20) >>> ");
                          payRate = input.nextDouble();
                          correct = true;
                      }
                    catch(InputMismatchException e)
                      {
                         System.out.println(e.getMessage());
                      }
    
                    input.nextLine();

                 }while(correct != true);

                    correct = false;
                        

                         aStaff.setEmployeesId(idNum);
                         aStaff.setLastName(lastName);
                         aStaff.setFirstName(firstName);
                         aStaff.setPayRate(payRate);

                         obj[j].employee(aStaff);
        }//loop


                  System.out.println("\n\nDISPLAY ALL DINNER EVENT DATA");
                  System.out.println("****************************************");
                  System.out.println("****************************************");
                  CarlysEventPriceWithMethods.displayMotto();               

          for(int i = 0; i < obj.length; ++i)
            display(obj[i]);
     }

  public static void display(DinnerEvent obj)
      {
         System.out.println(obj.getMenu());
         obj.displayEmployee();
      }
}

























