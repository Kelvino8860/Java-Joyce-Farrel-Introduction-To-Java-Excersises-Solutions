public class PersonalLoan extends Loan
{ 
    private double totalAmountOwed;
    private double primeCurrentRate;     

    public PersonalLoan(String loanNum, String name, double loan, int term, double rate)
      {
         super(loanNum, name, loan, term);
         primeCurrentRate = rate;
         double interest = ((primeCurrentRate / 100) + 2) * loanAmount;
         totalAmountOwed = loanAmount + interest;
      }

    @Override
    public String toString()
       {
          return("\nCompany Name: " +  COMPANY_NAME +
                 "\nLoan Number: " + loanNumber +
                 "\nLast Name: " + lastName +
                 "\nLoan Amount: $" + loanAmount +
                 "\nLoan Term : " + term +
                 "\nTotal Amount Owed: $" + totalAmountOwed);
       }
}