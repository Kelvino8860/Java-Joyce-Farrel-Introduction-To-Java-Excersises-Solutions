/* 10. In the exercises in Chapter 4, you created a CertOfDeposit class. Now, create an
       application to accept data for an array of five CertOfDeposit objects, and then
       display the data. Save the application as CertOfDepositArray.java.*/

import java.time.LocalDate;
import java.util.Scanner;

public class CertOfDepositArray{
     public static void main(String[] args){
          CertOfDeposits[] objArray = new CertOfDeposits[5];

            Scanner inputString = new Scanner(System.in);
            Scanner input = new Scanner(System.in);

            /*params*/
          String certNum, lastName;   int year, month, date;
          double balance;
          LocalDate issueDate, maturityDate;           

          for(int i = 0; i < objArray.length; i++){
                //Prompt user for information
                 System.out.print("Enter certificate number: ");
                 certNum = inputString.nextLine();
                 System.out.print("Enter your last name: ");
                 lastName = inputString.nextLine();
                 System.out.print("Enter balance: $");
                 balance = input.nextDouble();
                 System.out.print("Enter year of issue: ");
                 year = input.nextInt();
                 System.out.print("Enter month of issue: ");
                 month = input.nextInt();
                 System.out.print("Enter date of issue: ");
                 date = input.nextInt();
                 issueDate = LocalDate.of(year, month, date);
         
             objArray[i] = new CertOfDeposits(certNum, lastName, balance, issueDate);
             System.out.println();//spacing
            }
         
         for(int i = 0; i < objArray.length; i++){
              display(objArray[i]);
              System.out.println();//spacing
           }
      }

    /*Display all data of the five objects*/
   public static void display(CertOfDeposits y){
          System.out.println("Certificate Number: " + y.getCertNum());
          System.out.println("Last Name: " + y.getLastName());
          System.out.println("Balance: " + y.getBalance());
          System.out.println("Issue Date: " + y.getIssueDate());
          System.out.println("Maturity Date: " + y.getMaturityDate());
       }
}