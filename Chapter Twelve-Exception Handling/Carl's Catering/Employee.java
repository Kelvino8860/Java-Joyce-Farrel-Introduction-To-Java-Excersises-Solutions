public abstract class Employee
{
   private long employeesId;
   private String lastName;
   private String firstName;
   protected double payRate;
   protected String jobTitle;

   public long getEmployeesId()
      {
         return employeesId;
      }
   public String getLastName()
      {
         return lastName;
      }
   public String getFirstName()
      {
         return firstName;
      }
    public double getPayRate()
      {
         return payRate;
      }
    public String getJobTitle()
      {
         return jobTitle;
      }

    public void setEmployeesId(long id)
       {
          employeesId = id;  
       }
    public void setLastName(String last)
       {
           lastName = last;
       }
    public void setFirstName(String first)
       {
          firstName = first;
       }
    public abstract void setPayRate(double rate);
    public abstract void setJobTitle();
}