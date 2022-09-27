/*To keep the RentalDemo class simple, remove all the statements that compare
  rental times and that display the coupon Strings.*/

/*Modify the RentalDemo class so that instead of creating three single Rental
  objects, it uses an array of three Rental objects. Get data for each of the objects,
  and then display all the details for each object*/

import java.util.Scanner;
public class RentalDemo
{ public static void main(String[]  args)
    { Rental[] object1 = new Rental[3];
    
       for(int i = 0; i < object1.length; i++){
        
        object1[i] = new Rental();
        object1[i] = getData(object1[i]);
      }

    SammysRentalPriceWithMethods.companyMotto();
      
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




























  