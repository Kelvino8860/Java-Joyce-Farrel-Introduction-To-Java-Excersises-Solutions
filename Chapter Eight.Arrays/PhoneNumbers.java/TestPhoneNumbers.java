import java.util.Scanner;

public class TestPhoneNumbers{
     public static void main(String[]  args){    

    PhoneNumbers[] phoneDirectory = new PhoneNumbers[30];
   
    final int FIRST_LENGTH = 10;
    Scanner inputName = new Scanner(System.in);
    Scanner inputNumber = new Scanner(System.in);
    String name, nameInput;
    long phoneNumber;

  //input 10 names and their phone numbers
    System.out.println("Enter 10 names and their phone numbers");
     for(int i = 0; i < FIRST_LENGTH; i++){
            phoneDirectory[i] = new PhoneNumbers();
            System.out.print("Enter first name: ");
            name = inputName.nextLine();
            System.out.print("Enter phone number: ");
            phoneNumber = inputNumber.nextLong();
              phoneDirectory[i].setNames(name);
              phoneDirectory[i].setPhoneNumber(phoneNumber);
       }
           
               int count = 0;
               int arrayObj = FIRST_LENGTH;
               String name2 = " ";
               long phoneNumber2 = 0;

    do{
                  //prompt user for another name
                     System.out.print("Enter first name: ");
                      name2 = inputName.nextLine();

                 //check whether the name is already saved,if it has display phone number
                  for(int j = 0; j < FIRST_LENGTH; j++){
                           nameInput = phoneDirectory[j].getNames();
                        if(name2.equals(nameInput)){
                             System.out.println("Phone Number: " + phoneDirectory[j].getPhoneNumber());
                               count++;
                              break;
                           }
                     }

              //if the name is not already in the phoneDirectory then add it and the phone number
                if(count == 0 && !name2.equalsIgnoreCase("quit")){
                             phoneDirectory[arrayObj] = new PhoneNumbers();
                             System.out.print("Enter phone number: ");
                             phoneNumber2 = inputNumber.nextLong();
                             phoneDirectory[arrayObj].setNames(name2);
                             phoneDirectory[arrayObj].setPhoneNumber(phoneNumber2);
          
                         }
                 count = 0;
                 arrayObj++;
             if(arrayObj == phoneDirectory.length)
                break;
      }while(!name2.equalsIgnoreCase("quit"));

     //  System.out.println();         
     //  System.out.println("NAMES" + "\t\t" + "PHONE NUMBERS");
     //      for(int k = 0; k < arrayObj; k++){
    //             System.out.println(phoneDirectory[k].getNames() + "\t\t" + phoneDirectory[k].getPhoneNumber());
    //        }
  }
}