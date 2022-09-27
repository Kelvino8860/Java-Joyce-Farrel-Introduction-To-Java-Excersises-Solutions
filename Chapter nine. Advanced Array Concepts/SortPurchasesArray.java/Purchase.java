public class Purchase
{  private int invoiceNum;
   private int salesAmount;
   private double salesTax;
   private final double RATE = 0.05;
public void setInvoiceNum(int invoice)
   {  invoiceNum = invoice;
      }
public void setSalesAmount(int sales)
   {  salesAmount = sales;
      salesTax = RATE * salesAmount;
        }
public int getInvoiceNum(){
          return invoiceNum;
        }
public int getSalesAmount(){
          return salesAmount;
        }
public static void display(Purchase y)
  {  System.out.println("Invoice Number : " + y.invoiceNum + "\nSales Amount : " +
                   y.salesAmount + "\nSales Tax : " + y.salesTax + "\n");
   }
}