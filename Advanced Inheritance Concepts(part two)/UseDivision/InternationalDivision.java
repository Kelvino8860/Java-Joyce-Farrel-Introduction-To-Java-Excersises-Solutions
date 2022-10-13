public class InternationalDivision extends Division
{
    protected String country;
    protected String language;

    public InternationalDivision(String name, long acct, String country, String language)
       {
          super(name, acct);
          
          this.country = country;
          this.language = language;
       }

    @Override
    public void display()
      {
         System.out.println("\nDivision Name: " + divisionName +
                            "\nAccount Number: " + acctNum +
                            "\nCountry Located: " + country +
                            "\nLanguage Spoken: " + language);
      }
}