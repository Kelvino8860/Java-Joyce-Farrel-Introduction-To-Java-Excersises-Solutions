public class DomesticDivision extends Division
{
    protected String state;

    public DomesticDivision(String name, long acct, String state)
     {
        super(name, acct);
        this.state = state;
     }

    @Override
    public void display()
      {
         System.out.println("\nDivision Name: " + divisionName +
                            "\nAccount Number: " + acctNum +
                            "\nState Located: " + state);
      }
}