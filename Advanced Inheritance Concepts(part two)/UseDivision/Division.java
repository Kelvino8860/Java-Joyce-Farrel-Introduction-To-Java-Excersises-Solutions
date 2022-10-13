public abstract class Division
{
    protected String divisionName;
    protected long acctNum;

   public Division(String division, long acct)
      {
          divisionName = division;
          acctNum = acct;
      }

   public abstract void display();
}