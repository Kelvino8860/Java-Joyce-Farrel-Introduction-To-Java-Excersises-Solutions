/* 2. In the last chapter, you modified the RentalDemo program for Sammy’s Seashore
      Supplies to accept and display data for an array of three Rental objects. Now,
      modify the program to use an array of eight Rental objects. Prompt the user to
      choose an option to sort Rentals in ascending order by contract number, price, or
      equipment type. Display the sorted list, and continue to prompt the user for sortin*/

import java.util.Scanner;
public class RentalDemo
{ public static void main(String[]  args)
    { Rental[] object1 = new Rental[8];
    
       for(int i = 0; i < object1.length; i++){
        
        object1[i] = new Rental();
        object1[i] = getData(object1[i]);
        System.out.println();
      }

    SammysRentalPriceWithMethods.companyMotto();
    sortObj(object1);
      
        for(int i = 0; i < object1.length; i++){
          
            computeTime(object1[i]);
          }

  }

public static Rental getData(Rental details)
   { int minutes;
     String phoneNumber;
     String contNumber;
     int equipment;

     Scanner inputDevice = new Scanner(System.in);
     Scanner inputNum = new Scanner(System.in);

     System.out.print("Enter contract number(Should have have four characters;Start with a letter followed by three digits) >> ");
     contNumber = inputDevice.nextLine();

     System.out.print("Enter the type of equipment to rent (0-jet ski, 1-pontoon boat, 2-rowboat, 3-canoe, 4-kayak, 5-beach chair, 6-umbrella, 7-other) >> ");
     equipment = inputNum.nextInt();

     System.out.print("Enter Phone Number >> ");
     phoneNumber = inputDevice.nextLine();

       do{  System.out.print("Enter number of minutes >> ");
            minutes = inputNum.nextInt();
          }while(minutes < 60 || minutes > 7200);

     details.setContractNumber(contNumber);
     details.setEquipmentTypes(equipment);
     details.setPhoneNumber(phoneNumber);
     details.setHoursAndMinutes(minutes);
     return details;

         }

public static void sortObj(Rental[] object1)
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
                                            Rental temp = object1[j];
                                            object1[j] = object1[j + 1];
                                            object1[j + 1] = temp;
                                         }
                              }
                       }

                      for(int i = 0; i < object1.length; i++)
                          computeTime(object1[i]);
                }

            if(choice == 2)
                {
                    for(int i = 0; i < object1.length; ++i)
                       {
                          for(int j = 0; j < object1.length - 1; ++j)
                              {
                                  if(object1[j].getPrice() > object1[j + 1].getPrice())
                                         {
                                            Rental temp = object1[j];
                                            object1[j] = object1[j + 1];
                                            object1[j + 1] = temp;
                                         }
                              }
                       }

                      for(int i = 0; i < object1.length; i++)
                          computeTime(object1[i]);
                }

           if(choice == 3)
               {
                    for(int i = 0; i < object1.length; ++i)
                       {
                          for(int j = 0; j < object1.length - 1; ++j)
                              {
                                  if(object1[j].getEquipmentName().compareTo(object1[j + 1].getEquipmentName()) > 0)
                                         {
                                            Rental temp = object1[j];
                                            object1[j] = object1[j + 1];
                                            object1[j + 1] = temp;
                                         }
                              }
                       }

                      for(int i = 0; i < object1.length; i++)
                          computeTime(object1[i]);
               }
       }while(choice != 4);
    }

public static void computeTime(Rental g)
   {  
       System.out.println("Contract Number >> " + g.getContractNumber());
       System.out.println("Equipment >> " + g.getEquipmentName());
       System.out.println("Phone Number: " + g.getPhoneNumber());
       System.out.println("Hours >> " + g.getNumberHours() + 
                          "\nMinutes >> " + g.getNumberRemMinutes());
       System.out.println("Hourly Rate >> $" + g.HOURLY_RENTAL_PAY);
       System.out.println("Total Price >> $" + g.getPrice() + "\n " + "..............................................................................");

   }

}




























  