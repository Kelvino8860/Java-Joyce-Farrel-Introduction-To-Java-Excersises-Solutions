public class CollegeEmployee extends Person
{
   private long socialSecurityNum;
   private double annualSalary;
   private String departmentName;

  public long getSocialSecurityNum()
      {
          return socialSecurityNum;
      }
  public double getAnnualSalary()
      {
          return annualSalary;
      }
  public String getDepartmentName()
      {
          return departmentName;
      }

  public void setSocialSecurityNum(long social)
      {
          socialSecurityNum = social;
      }
  public void setAnnualSalary(double salary)
      {
          annualSalary = salary;
      }
  public void setDepartmentName(String name)
      {
          departmentName = name;
      }

  @Override
  public void display()
     {
        System.out.println("\nFirst Name: " + super.getFirstName() + "\nLast Name: " + super.getLastName() +
              "\nStreet Address: " + super.getStreetAddress() + "\nZip Code: " + super.getZipCode() + 
              "\nPhone Number: " + super.getPhoneNumber() + "\nSocial Security Number: " + getSocialSecurityNum() +
              "\nAnnual Salary: " + getAnnualSalary() + "\nDepartment Name: " + getDepartmentName());
     }
}