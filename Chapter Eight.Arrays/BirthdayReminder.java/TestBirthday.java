import java.util.Scanner;
public class TestBirthday{
      public static void main(String[]  args){
          Birthday[] birthdayArray = new Birthday[10];
          Scanner input = new Scanner(System.in);
          String name, date,nameInput,nameGeter;
          boolean enteredName = false;

//Enter the names and birthdates and store them in an array containing objects
        System.out.println("Enter names and date of birth or ZZZ to quit");
           for(int i = 0; i < birthdayArray.length; i++){
                birthdayArray[i] = new Birthday();
                System.out.print("Enter name >>> ");
                   name = input.nextLine();
                 if(!name.equalsIgnoreCase("ZZZ")){
                       birthdayArray[i].setName(name);
                    System.out.print("Enter date of birthday >>> ");
                      date = input.nextLine();
                       birthdayArray[i].setDate(date);
                     }
                 else{
                       break;
                    }
                System.out.println("____________________________________________________");
             }
    System.out.println();

//Display how many names have been entered and display them together with their birthdates
          System.out.println("Total names entered are >> " + Birthday.size);
               for(int i = 0; i < Birthday.size; i++){
                       System.out.println("Name >> " + birthdayArray[i].getName());
                       System.out.println("Date of birth >> " + birthdayArray[i].getDate());
                       System.out.println();
                    }

//Input a name, if the name is available in the array of objects then display its dirthdate else show an error message
             do{
                 System.out.print("Kindly enter a name >> ");
                 nameInput = input.nextLine();
                   for(int i = 0; i < Birthday.size; i++){
                         nameGeter = birthdayArray[i].getName();
                           if(nameGeter.equalsIgnoreCase(nameInput)){
                               System.out.println("The date of birth of " + nameInput + " is " + birthdayArray[i].getDate());
                               enteredName = true;
                                 break;
                              }
                      }
                  if(enteredName == false && !nameInput.equalsIgnoreCase("ZZZ")){
                        System.out.println("Sorry the name entered is not in our DataBase");
                       }
                     enteredName = false;

               }while(!nameInput.equalsIgnoreCase("ZZZ"));
        }
}