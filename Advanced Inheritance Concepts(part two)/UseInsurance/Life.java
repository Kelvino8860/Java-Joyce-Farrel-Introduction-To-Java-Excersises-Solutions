public class Life extends Insurance
{
   public Life()
    {
       super("Life Insurace");
       setCost();
    }

  @Override
  public void setCost()
   {
      monthlyPrice = 36;
   }
  @Override
  public String display()
   {
       return("\nType of Insurance: " + getInsurance() +
                        "\nMonthly Cost: $" + getPrice());
   }
}