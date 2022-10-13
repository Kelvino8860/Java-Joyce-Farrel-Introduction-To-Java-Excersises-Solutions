import javax.swing.*;

public abstract class Loan implements LoanConstants
{
    protected String loanNumber;
    protected String lastName;
    protected double loanAmount;
    protected double interestRate;
    protected String term;

    public Loan(String loanNum, String name, double loan, int termChoice)
        {
             loanNumber = loanNum;
             lastName = name;
             
           //If loan amount exceeds the maximum dont allow loan amount to be set
            if(loan < MAXIMUM_LOAN)
              {
                 loanAmount = loan;
              }
            else if(loan > MAXIMUM_LOAN)
              {
                JOptionPane.showMessageDialog(null, "Sorry try borrowing a lower amount.");
              }

           //If loan term entered is not in the available terms force it short term
             if(termChoice == SHORT_TERM)
                 {
                    term = "Short Term";
                 }
             else if(termChoice == MEDIUM_TERM)
                 {
                    term = "Medium Term";
                 }
             else if(termChoice == LONG_TERM)
                {
                   term = "Long Term";
                }
             else
               term = "Short Term";
        }

   @Override
   public String toString()
      {
          return("\nCompany Name: " +  COMPANY_NAME +
                 "\nLoan Number: " + loanNumber +
                 "\nLast Name: " + lastName +
                 "\nLoan Amount: " + loanAmount +
                 "\nLoan Term : " + term);
      }
}










