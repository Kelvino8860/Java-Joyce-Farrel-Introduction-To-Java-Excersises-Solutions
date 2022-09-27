
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