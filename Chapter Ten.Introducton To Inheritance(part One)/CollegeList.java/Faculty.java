public class Faculty extends CollegeEmployee
{
   private boolean tenured;

   public boolean getTenured()
     {
        return tenured;
     }
   public void setTenured(boolean tenured)
      {
         this.tenured = tenured;
      }

  @Override
  public void display()
     {
          System.out.println("\nFirst Name: " + super.getFirstName() + "\nLast Name: " + super.getLastName() +
              "\nStreet Address: " + super.getStreetAddress() + "\nZip Code: " + super.getZipCode() + 
              "\nPhone Number: " + super.getPhoneNumber() + "\nSocial Security Number: " +
              super.getSocialSecurityNum() + "\nAnnual Salary: " + super.getAnnualSalary() +
               "\nDepartment Name: " + super.getDepartmentName() + "\nTenured: " + getTenured());
     }
}