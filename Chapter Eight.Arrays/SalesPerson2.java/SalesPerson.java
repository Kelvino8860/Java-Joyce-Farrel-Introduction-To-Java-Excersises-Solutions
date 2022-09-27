/* b. Modify the DemoSalesperson application so each Salesperson has a successive
      ID number from 111 through 120 and a sales value that ranges from $25,000 to
      $70,000, increasing by $5,000 for each successive Salesperson. Save the file as
      DemoSalesperson2.java*/

public class SalesPerson{
     private int idNum;
     private double annualSales;
 
     public SalesPerson(int idNum, double annualSales){
         this.idNum = idNum;
         this.annualSales = annualSales;
      }
    public void setIdNum(int idNum){
         this.idNum = idNum;
      }
    public int getIdNum(){
        return idNum;
      }

    public void setAnnualSales(double annualSales){
        this.annualSales = annualSales;
      }
    public double getAnnualSales(){
        return annualSales;
      }
}