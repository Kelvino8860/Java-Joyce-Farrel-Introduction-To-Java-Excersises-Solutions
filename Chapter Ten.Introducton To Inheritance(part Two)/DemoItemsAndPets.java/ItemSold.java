public class ItemSold
{
   private String invoiceNum;
   private String description;
   private double price;

   public String getInvoiceNum()
      {
         return invoiceNum;
      }
   public String getDescription()
      {
         return description;
      }
   public double getPrice()
      {
         return price;
      }

   public void setInvoiceNumber(String invoice)
      {
          invoiceNum = invoice;
      }
   public void setDescription(String description)
      {
          this.description = description;
      }
   public void setPrice(double price)
      {
          this.price = price;
      }

  public void display()
     {
        System.out.println("\nInvoice Number: " + getInvoiceNum() +
             "\nDescription: " + getDescription() +
             "\nPrice: $" + getPrice());
     }
}