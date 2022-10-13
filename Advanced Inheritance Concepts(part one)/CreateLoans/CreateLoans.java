/* 15. Sanchez Construction Loan Co. makes loans of up to $100,000 for construction
       projects. There are two categories of Loans—those to businesses and those to
       individual applicants
       Write an application that tracks all new construction loans. The application must also
       calculate the total amount owed at the due date (original loan amount + loan fee).
       The application should include the following classes:

          Loan—A public abstract class that implements the LoanConstants interface. A
          Loan includes a loan number, customer last name, amount of loan, interest rate,
          and term. The constructor requires data for each of the fields except interest
          rate. Do not allow loan amounts over $100,000. Force any loan term that is not
          one of the three defined in the LoanConstants class to a short-term, 1-year loan.
          Create a toString() method that displays all the loan data.

           LoanConstants—A public interface class. LoanConstants includes constant
           values for short-term (1 year), medium-term (3 years), and long-term (5 years)
           loans. It also contains constants for the company name and the maximum loan
           amount.

           BusinessLoan—A public class that extends Loan. The BusinessLoan constructor
           sets the interest rate to 1 percent over the current prime interest rate.
           PersonalLoan—A public class that extends Loan. The PersonalLoan constructor
           sets the interest rate to 2 percent over the current prime interest rate.

           CreateLoans—An application that creates an array of five Loans. Prompt the
           user for the current prime interest rate. Then, in a loop, prompt the user for
           a loan type and all relevant information for that loan. Store the created Loan
           objects in the array. When data entry is complete, display all the loans.

         Save the files as Loan.java, LoanConstants.java, BusinessLoan.java,
         PersonalLoan.java, and CreateLoans.java */

import javax.swing.*;

public class CreateLoans
{
     public static void main(String[] args)
        {
            String entry, loanNum, name, loan, term;
            double loanAmount, rate;
            int termInt, i, input;

            entry = JOptionPane.showInputDialog(null, "Enter percentage current prime interest rate;");
            rate = Double.parseDouble(entry);

            Loan[] objArray = new Loan[5];
             
            for(i = 0; i < objArray.length; ++i)
               {
                  entry = JOptionPane.showInputDialog(null, "Choose Loan Type" +
                            "\n1.Business Loan \n2.Personal Loan");
                  input = Integer.parseInt(entry);

                   if(input == 1)
                    {
                       loanNum = JOptionPane.showInputDialog(null, "Enter loan number");
                       name = JOptionPane.showInputDialog(null, "Enter last name");
                       loan = JOptionPane.showInputDialog(null, "Enter loan amount");
                       loanAmount = Double.parseDouble(loan);
                       term = JOptionPane.showInputDialog(null, "Choose term type" +
                               "\n1.Short Term \n3.Medium Term \n5.Long Term");
                        termInt = Integer.parseInt(term);

                       objArray[i] = new BusinessLoan(loanNum, name, loanAmount, termInt, rate);
                    }
         
                   else if(input == 2)
                     {
                         loanNum = JOptionPane.showInputDialog(null, "Enter loan number");
                         name = JOptionPane.showInputDialog(null, "Enter last name");
                         loan = JOptionPane.showInputDialog(null, "Enter loan amount");
                         loanAmount = Double.parseDouble(loan);
                         term = JOptionPane.showInputDialog(null, "Choose term type" +
                               "\n1.Short Term \n3.Medium Term \n5.Long Term");
                         termInt = Integer.parseInt(term);

                         objArray[i] = new PersonalLoan(loanNum, name, loanAmount, termInt, rate);
                     }
               }

            for(i = 0; i < objArray.length; ++i)
               {
                  System.out.println(objArray[i].toString());
               }
            
        }
}









