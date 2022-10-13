/* 4. Create an abstract Division class with fields for a company’s division name and
      account number, and an abstract display() method. Use a constructor in the
      superclass that requires values for both fields. Create two subclasses named
      InternationalDivision and DomesticDivision. The InternationalDivision includes
      a field for the country in which the division is located and a field for the language spoken;
      its constructor requires both. The DomesticDivision includes a field for the state in
      which the division is located; a value for this field is required by the constructor.
      Write an application named UseDivision that creates InternationalDivision and
      DomesticDivision objects for two different companies and displays information
      about them. Save the files as Division.java, InternationalDivision.java,
      DomesticDivision.java, and UseDivision.java.*/

import java.util.Scanner;

public class UseDivision
{
    public static void main(String[] args)
       {
           String divisionName, country, state, language;
           long acctNum;

           Scanner input = new Scanner(System.in);
           Scanner inputString = new Scanner(System.in);

           System.out.print("Enter Company's Division Name(International) >>> ");
           divisionName = input.nextLine();
           System.out.print("Enter Country the company is located >>> ");
           country = input.nextLine();
           System.out.print("Enter the language spoken in the Country >>> ");
           language = input.nextLine();
           System.out.print("Enter company's account number >>> ");
           acctNum = (long)(input.nextLong());

           Division obj1 = new InternationalDivision(divisionName, acctNum, country, language);
           System.out.println();//Spacing for visibility

           System.out.print("Enter Company's Division Name(Domestic) >>> ");
           divisionName = inputString.nextLine();
           System.out.print("Enter state the company is located >>> ");
           state = inputString.nextLine();
           System.out.print("Enter company's account number >>> ");
           acctNum = input.nextLong();

           Division obj2 = new DomesticDivision(divisionName, acctNum, state);

           obj1.display();
           obj2.display();
       }
}