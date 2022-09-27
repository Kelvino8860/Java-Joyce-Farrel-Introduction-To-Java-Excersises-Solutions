/* 6. a. Create a class named Salesperson. Data fields for Salesperson include an integer
         ID number and a double annual sales amount. Methods include a constructor that
         requires values for both data fields, as well as get and set methods for each of the
         data fields. Write an application named DemoSalesperson that declares an array of
         10 Salesperson objects. Set each ID number to 9999 and each sales value to zero.
         Display the 10 Salesperson objects. Save the files as Salesperson.java and
         DemoSalesperson.java*/

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