import java.time.LocalDate;
public class CertOfDeposits{
      private String certNum;
      private String lastName;
      private double balance;
      private LocalDate issueDate;
      private LocalDate maturityDate;

    public CertOfDeposits(String certNum, String lastName, double balance, LocalDate issueDate){
                this.certNum = certNum;
                this.lastName = lastName;
                this.balance = balance;
                this.issueDate = issueDate;
                this.maturityDate = this.issueDate.plusYears(1);
        }
    public void setCertNum(String certNum){
          this.certNum = certNum;
       }
    public String getCertNum(){
          return certNum;
       }
  
    public void getLastName(String lastName){
          this.lastName = lastName;
       }
    public String getLastName(){
           return lastName;
       }

    public void setBalance(double balance){
          this.balance = balance;
       }
    public double getBalance(){
          return balance;
       }

    public void setIssueDate(LocalDate issueDate){
           this.issueDate = issueDate;
        }
    public LocalDate getIssueDate(){
          return issueDate;
      }

    public void setMaturityDate(LocalDate maturityDate){
            this.maturityDate = maturityDate;
        }
    public LocalDate getMaturityDate(){
          return maturityDate;
        }
}