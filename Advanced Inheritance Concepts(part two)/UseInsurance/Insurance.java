public abstract class Insurance
{
   private String typeInsurance;
   protected double monthlyPrice;

   public Insurance(String insurance)
     {
        typeInsurance = insurance;  
     }

   public String getInsurance()
     {
        return typeInsurance;
     }
   public double getPrice()
     {
        return monthlyPrice;
     }

   public abstract void setCost();
   public abstract String display();
}