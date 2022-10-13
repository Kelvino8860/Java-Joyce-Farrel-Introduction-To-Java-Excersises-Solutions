public abstract class NewspaperSubscription
{
    private String name;
    protected String address;
    protected double rate;

    public String getName()
      {
        return name;
      }
    public void setName(String name)
      {
         this.name = name;
      }

    public String getAddress()
      {
         return address;
      }
    public double getRate()
      {
         return rate;
      }

   public abstract void setAddress(String address);
}