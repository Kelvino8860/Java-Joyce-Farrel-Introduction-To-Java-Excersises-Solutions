/* 9. Create a class named Majors that includes an enumeration for the six majors
      offered by a college as follows: ACC, CHEM, CIS, ENG, HIS, PHYS. Display the
      enumeration values for the user, then prompt the user to enter a major. Display the
      college division in which the major falls. ACC and CIS are in the Business Division,
      CHEM and PHYS are in the Science Division, and ENG and HIS are in the
      Humanities Division. Save the file as Majors.java*/

import java.util.Scanner;
public class Majors{

      enum Values {ACC, CHEM, CIS, ENG, HIS, PHYS};

      public static void main(String[] args){

              System.out.print("Majors offered by our college >> ");
             for(Values c : Values.values())
              System.out.print(c + " ");

            Scanner input = new Scanner(System.in);
            System.out.print("\n\nEnter a major to see its division >> ");
            String major = input.nextLine().toUpperCase();
            Values majors = Values.valueOf(major);

             switch(majors){

                   case ACC :
                     System.out.println("ACC is in the Business Division");
                     break;

                   case CHEM :
                     System.out.println("CHEM is in the Science Division");
                     break;

                   case CIS :
                     System.out.println("CIS is in the Business Division");
                     break;
     
                   case ENG :
                     System.out.println("ENG is in the Humanities Division");
                     break;

                   case HIS :
                     System.out.println("HIS is in the Humanities Division");
                     break;

                   case PHYS :
                     System.out.println("PHYS is in the Science Division");
                     break;
                }
          }
}