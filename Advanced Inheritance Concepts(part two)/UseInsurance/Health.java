public class Health extends Insurance
{
   public Health()
    {
       super("Health Insurace");
       setCost();
    }

  @Override
  public void setCost()
   {
      monthlyPrice = 196;
   }
  @Override
  public String display()
   {
       return("\nType of Insurance: " + getInsurance() +
                        "\nMonthly Cost: $" + getPrice());
   }
}